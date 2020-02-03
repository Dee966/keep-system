package com.xiaoman.keep_system.shiro;


import com.xiaoman.keep_system.pojo.po.Customer;
import com.xiaoman.keep_system.service.LoginService;
import com.xiaoman.keep_system.utils.JWTUtil;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private LoginService loginService;
    @Autowired
    private JWTUtil jwtUtil;

    /**
     * 大坑！，必须重写此方法，不然Shiro会报错
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JWTToken;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        String username = JWTUtil.getUsername(principals.toString());
//        List<UserDto> userPermission = userService.getUserPermission(username);
//        Set<String> roles = new HashSet<>();
//        Set<String> permissions = new HashSet<>();
//        for (UserDto u:userPermission) {
//            roles.add(u.getRole());
//            permissions.add(u.getPermission());
//        }
//        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
//        simpleAuthorizationInfo.addRoles(roles);
//        simpleAuthorizationInfo.addStringPermissions(permissions);
        return null;
    }

    /**
     * 默认使用此方法进行用户名正确与否验证，错误抛出异常即可。
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken auth) throws AuthenticationException {
        String token = (String) auth.getCredentials();
        // 解密获得username，用于和数据库进行对比
        String username = jwtUtil.getUsername(token);
        if (username == null) {
            throw new AuthenticationException("token invalid");
        }

        Customer customer = loginService.getCusByUsername(username);
        if (customer == null) {
            throw new AuthenticationException();
        }

        if (! jwtUtil.verify(token, username)) {
            throw new AuthenticationException();
        }

        return new SimpleAuthenticationInfo(token, token, "my_realm");
//        return null;
    }
}
