package com.xiaoman.keep_system.pojo.po;

import com.xiaoman.keep_system.pojo.vo.LoginVo;
import com.xiaoman.keep_system.pojo.vo.ManagerVo;

import java.util.Date;

public class Manager {
    private Integer managerId;
    private String username;
    private String password;
    private String email;
    private String telephone;
    private Date workTime;

    public Manager(){}

    public Manager(int managerId, ManagerVo managerVo){
        this.managerId = managerId;
        this.email = managerVo.getEmail();
        this.telephone = managerVo.getTelephone();
        this.workTime = managerVo.getWorkTime();
    }

    public Manager(LoginVo loginVo){
        this.username = loginVo.getUsername();
        this.password = loginVo.getPassword();
    }

    public Manager(Integer managerId, String username, String password, String email, String telephone, Date workTime) {
        this.managerId = managerId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
        this.workTime = workTime;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerId=" + managerId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", workTime=" + workTime +
                '}';
    }
}
