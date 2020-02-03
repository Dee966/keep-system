package com.xiaoman.keep_system.pojo.vo;

import java.util.Date;

public class ManagerVo {
    private String email;
    private String telephone;
    private Date workTime;

    public ManagerVo(){}

    public ManagerVo(String email, String telephone, Date workTime) {
        this.email = email;
        this.telephone = telephone;
        this.workTime = workTime;
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
        return "ManagerVo{" +
                "email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", workTime=" + workTime +
                '}';
    }
}
