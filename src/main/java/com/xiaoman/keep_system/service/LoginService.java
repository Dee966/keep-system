package com.xiaoman.keep_system.service;

import com.alibaba.druid.util.StringUtils;
import com.xiaoman.keep_system.dao.LoginDao;
import com.xiaoman.keep_system.exception.GlobleException;
import com.xiaoman.keep_system.pojo.po.Coach;
import com.xiaoman.keep_system.pojo.po.Customer;
import com.xiaoman.keep_system.pojo.po.Manager;
import com.xiaoman.keep_system.pojo.vo.*;
import com.xiaoman.keep_system.result.CodeMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Service
public class LoginService {

    private Logger logger = LoggerFactory.getLogger(getClass());//提供日志类

    @Autowired
    private LoginDao loginDao;
    @Autowired
    private JavaMailSenderImpl mailSender;//注入邮件工具类

    public Customer getCusByUsername(String username){
        return loginDao.getCusByUsername(username);
    }

    public Coach getCoachByUsername(String username){
        return loginDao.getCoachByUsername(username);
    }

    public Manager getMaByUsername(String username){
        return loginDao.getMaByUsername(username);
    }

    public Integer registerCus(RegisterVo registerVo){
        String username = registerVo.getUsername();
        String password = registerVo.getPassword();
        //判断用户名是否已存在
        if (loginDao.getCusByUsername(registerVo.getUsername()) != null){
            throw new GlobleException(CodeMsg.USER_EXIST);
        }
        Customer customer = new Customer(registerVo);
        loginDao.registerCus(customer);
        return customer.getCustomerId();
    }

    public void registerCoach(RegCoachVo regCoachVo){
        String username = regCoachVo.getUsername();
        String password = regCoachVo.getPassword();
        //判断用户名是否已存在
        if (loginDao.getCoachByUsername(regCoachVo.getUsername()) != null){
            throw new GlobleException(CodeMsg.USER_EXIST);
        }
        Coach coach = new Coach(regCoachVo);
        loginDao.registerCoach(coach);
    }

    public void registerMa(LoginVo loginVo){
        String username = loginVo.getUsername();
        String password = loginVo.getPassword();
        //判断用户名是否已存在
        if (loginDao.getCoachByUsername(loginVo.getUsername()) != null){
            throw new GlobleException(CodeMsg.USER_EXIST);
        }
        Manager manager = new Manager(new LoginVo(username,password));
        loginDao.registerMa(manager);
    }

    public void judgeMail(CodeVo codeVo){
        String code = loginDao.getCode(codeVo.getCustomerId());
        if (!code.equals(codeVo.getCode())){
            throw new GlobleException(CodeMsg.CODE_ERROR);
        }
        //如果验证成功，清除code
        loginDao.moveCode(codeVo.getCustomerId());
    }

    public void updPass(NewPassVo newPassVo){
        if ("会员".equals(newPassVo.getUser())){
            Customer customer = new Customer(newPassVo);
            loginDao.updCusPass(customer);
        } else if ("教练".equals(newPassVo.getUser())){
            Coach coach = new Coach(newPassVo);
            loginDao.updCoachPass(coach);
        } else {
            throw new GlobleException(CodeMsg.SERVER_ERROR);
        }
    }

}
