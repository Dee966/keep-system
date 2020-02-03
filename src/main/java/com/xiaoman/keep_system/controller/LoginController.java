package com.xiaoman.keep_system.controller;

import com.xiaoman.keep_system.mail.MailUtil;
import com.xiaoman.keep_system.pojo.dto.TokenIdDto;
import com.xiaoman.keep_system.pojo.po.Coach;
import com.xiaoman.keep_system.pojo.po.Customer;
import com.xiaoman.keep_system.pojo.po.Manager;
import com.xiaoman.keep_system.pojo.vo.CodeVo;
import com.xiaoman.keep_system.pojo.vo.LoginVo;
import com.xiaoman.keep_system.pojo.vo.MailVo;
import com.xiaoman.keep_system.pojo.vo.NewPassVo;
import com.xiaoman.keep_system.result.CodeMsg;
import com.xiaoman.keep_system.result.Result;
import com.xiaoman.keep_system.service.LoginService;
import com.xiaoman.keep_system.utils.JWTUtil;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private JWTUtil jwtUtil;
    @Autowired
    private MailUtil mailUtil;

    @GetMapping("/getCustomer")
    public Result<Customer> getUserByUsername(String username) {
        return Result.success(loginService.getCusByUsername(username));
    }

    /**
     * @param loginVo
     * @return com.xiaoman.keep_system.result.Result<com.xiaoman.keep_system.pojo.dto.TokenIdDto>
     * @desc 客户登录
     * @author Joe
     * @date 2020/1/25 21:14
     */
    @PostMapping("/customer")
    public Result<TokenIdDto> customerLogin(@RequestBody LoginVo loginVo) {
        Customer customer = loginService.getCusByUsername(loginVo.getUsername());
        if (customer == null) {
            return Result.error(CodeMsg.USER_NULL);
        }
        if (customer.getSafeCode() == null){
            return Result.error(CodeMsg.NOT_CONFIRM);
        }
        if(!customer.getSafeCode().equals(" ")){
            return Result.error(CodeMsg.NOT_CONFIRM);
        }
        if (customer.getPassword().equals(loginVo.getPassword())) {
            String token = jwtUtil.sign(loginVo.getUsername());
            Integer customerId = customer.getCustomerId();
            return Result.success(new TokenIdDto(token, customerId,customer.getName()));
        } else {
            throw new UnauthorizedException();
        }
    }

    /**
     * @param loginVo
     * @return com.xiaoman.keep_system.result.Result<com.xiaoman.keep_system.pojo.dto.TokenIdDto>
     * @desc 教练登录
     * @author Joe
     * @date 2020/1/25 21:14
     */
    @PostMapping("/coach")
    public Result<TokenIdDto> coachLogin(@RequestBody LoginVo loginVo) {
        Coach coach = loginService.getCoachByUsername(loginVo.getUsername());
        if (coach == null) {
            return Result.error(CodeMsg.USER_NULL);
        }
        if (coach.getPassword().equals(loginVo.getPassword())) {
            String token = jwtUtil.sign(loginVo.getUsername());
            Integer coachId = coach.getCoachId();
            return Result.success(new TokenIdDto(token,coachId,coach.getName()));
        } else {
            throw new UnauthorizedException();
        }
    }

    /**
     * @param loginVo
     * @return com.xiaoman.keep_system.result.Result<com.xiaoman.keep_system.pojo.dto.TokenIdDto>
     * @desc 管理员登录
     * @author Joe
     * @date 2020/1/25 21:14
     */
    @PostMapping("/manager")
    public Result<TokenIdDto> managerLogin(@RequestBody LoginVo loginVo) {
        Manager manager = loginService.getMaByUsername(loginVo.getUsername());
        if (manager == null) {
            return Result.error(CodeMsg.USER_NULL);
        }
        if (manager.getPassword().equals(loginVo.getPassword())) {
            String token = jwtUtil.sign(loginVo.getUsername());
            Integer coachId = manager.getManagerId();
            return Result.success(new TokenIdDto(token,coachId,manager.getUsername()));
        } else {
            throw new UnauthorizedException();
        }
    }

    @GetMapping("/mail")
    public Result<MailVo> sendMail(int customerId,String email){
        return Result.success(mailUtil.sendMail(customerId,email));
    }

    @PostMapping("/judge")
    public Result<Object> judgeMail(@RequestBody CodeVo codeVo){
        loginService.judgeMail(codeVo);
        return Result.success(null);
    }

    /**
     * @param loginVo
     * @return com.xiaoman.keep_system.result.Result<java.lang.Object>
     * @desc 客户账户注册--管理员操作
     * @author Joe
     * @date 2020/1/25 21:25
     */
    @PostMapping("/reg_customer")
    public Result<Integer> customerRegister(@RequestBody LoginVo loginVo) {
        return Result.success(loginService.registerCus(loginVo));
    }

    /**
     * @param loginVo
     * @return com.xiaoman.keep_system.result.Result<java.lang.Object>
     * @desc 教练账户注册--管理员操作
     * @author Joe
     * @date 2020/1/25 21:25
     */
    @PostMapping("/reg_coach")
    public Result<Object> coachRegister(@RequestBody LoginVo loginVo) {
        loginService.registerCoach(loginVo);
        return Result.success(null);
    }

    /**
     * @param loginVo
     * @return com.xiaoman.keep_system.result.Result<java.lang.Object>
     * @desc 管理员账户注册--管理员操作
     * @author Joe
     * @date 2020/1/25 21:25
     */
    @PostMapping("/reg_manager")
    public Result<Object> managerRegister(@RequestBody LoginVo loginVo) {
        loginService.registerMa(loginVo);
        return Result.success(null);
    }

    /**
     * @param newPassVo
     * @return com.xiaoman.keep_system.result.Result<java.lang.Object>
     * @desc 修改密码
     * @author Joe
     * @date 2020/2/2 17:06
     */
    @PutMapping("/new_pass")
    public Result<Object> updPass(@RequestBody NewPassVo newPassVo){
        loginService.updPass(newPassVo);
        return Result.success(null);
    }

}
