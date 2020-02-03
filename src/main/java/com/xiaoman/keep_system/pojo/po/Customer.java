package com.xiaoman.keep_system.pojo.po;

import com.xiaoman.keep_system.pojo.vo.ChCoachVo;
import com.xiaoman.keep_system.pojo.vo.CustomerVo;
import com.xiaoman.keep_system.pojo.vo.LoginVo;
import com.xiaoman.keep_system.pojo.vo.NewPassVo;

import java.util.Date;

public class Customer {
    private Integer customerId;
    private String username;
    private String password;
    private String email;
    private String telephone;
    private String name;
    private String sex;
    private Integer age;
    private String tall;
    private String weight;
    private Integer times;
    private Date joinTime;
    private String safeCode;
    private Integer coachId;

    public Customer(){}

    public Customer(NewPassVo newPassVo){
        this.customerId = newPassVo.getId();
        this.password = newPassVo.getPassword();
    }

    public Customer(int customerId, CustomerVo customerVo){
        this.customerId = customerId;
        this.telephone = customerVo.getTelephone();
        this.name = customerVo.getName();
        this.sex = customerVo.getSex();
        this.age = customerVo.getAge();
        this.tall = customerVo.getTall();
        this.weight = customerVo.getWeight();
    }

    public Customer(ChCoachVo chCoachVo){
        this.customerId = chCoachVo.getCustomerId();
        this.coachId = chCoachVo.getCoachId();
    }

    public Customer(LoginVo loginVo){
        this.username = loginVo.getUsername();
        this.password = loginVo.getPassword();
    }

    public Customer(Integer customerId, String username, String password, String email, String telephone, String name, String sex, Integer age, String tall, String weight, Integer times, Date joinTime, String safeCode, Integer coachId) {
        this.customerId = customerId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.tall = tall;
        this.weight = weight;
        this.times = times;
        this.joinTime = joinTime;
        this.safeCode = safeCode;
        this.coachId = coachId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTall() {
        return tall;
    }

    public void setTall(String tall) {
        this.tall = tall;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public String getSafeCode() {
        return safeCode;
    }

    public void setSafeCode(String safeCode) {
        this.safeCode = safeCode;
    }

    public Integer getCoachId() {
        return coachId;
    }

    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", tall='" + tall + '\'' +
                ", weight='" + weight + '\'' +
                ", times=" + times +
                ", joinTime=" + joinTime +
                ", safeCode='" + safeCode + '\'' +
                ", coachId=" + coachId +
                '}';
    }
}
