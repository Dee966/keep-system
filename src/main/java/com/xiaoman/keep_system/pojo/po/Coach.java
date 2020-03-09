package com.xiaoman.keep_system.pojo.po;

import com.xiaoman.keep_system.pojo.vo.*;

import java.util.Date;

public class Coach {
    private Integer coachId;
    private String username;
    private String password;
    private String email;
    private String telephone;
    private String name;
    private String img;
    private String sex;
    private Integer age;
    private String tall;
    private String weight;
    private Date workTime;
    private String workExperience;
    private String title;
    private String safeCode;
    private String managerId;

    public Coach(){}

    public Coach(RegCoachVo regCoachVo){
        this.username = regCoachVo.getUsername();
        this.password = regCoachVo.getPassword();
        this.name = regCoachVo.getName();
        this.email = regCoachVo.getEmail();
        this.telephone = regCoachVo.getTelephone();
        this.workTime = regCoachVo.getWorkTime();
        this.title = regCoachVo.getTitle();
        this.age = regCoachVo.getAge();
        this.sex = regCoachVo.getSex();
        this.img = regCoachVo.getImg();
        this.tall = regCoachVo.getTall();
        this.weight = regCoachVo.getWeight();
        this.workExperience = regCoachVo.getWorkExperience();
    }

    public Coach(int coachId, CoachVo coachVo){
        this.coachId = coachId;
        this.telephone = coachVo.getTelephone();
        this.name = coachVo.getName();
        this.age = coachVo.getAge();
        this.tall = coachVo.getTall();
        this.weight = coachVo.getWeight();
    }

    public Coach(NewPassVo newPassVo){
        this.coachId = newPassVo.getId();
        this.password = newPassVo.getPassword();
    }

    public Coach(LoginVo loginVo){
        this.username = loginVo.getUsername();
        this.password = loginVo.getPassword();
    }

    public Coach(Integer coachId, String username, String password, String email, String telephone, String name, String img, String sex, Integer age, String tall, String weight, Date workTime, String workExperience, String title, String safeCode, String managerId) {
        this.coachId = coachId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
        this.name = name;
        this.img = img;
        this.sex = sex;
        this.age = age;
        this.tall = tall;
        this.weight = weight;
        this.workTime = workTime;
        this.workExperience = workExperience;
        this.title = title;
        this.safeCode = safeCode;
        this.managerId = managerId;
    }

    public Integer getCoachId() {
        return coachId;
    }

    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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

    public Date getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSafeCode() {
        return safeCode;
    }

    public void setSafeCode(String safeCode) {
        this.safeCode = safeCode;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "coachId=" + coachId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", name='" + name + '\'' +
                ", img='" + img + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", tall='" + tall + '\'' +
                ", weight='" + weight + '\'' +
                ", workTime=" + workTime +
                ", workExperience='" + workExperience + '\'' +
                ", title='" + title + '\'' +
                ", safeCode='" + safeCode + '\'' +
                ", managerId='" + managerId + '\'' +
                '}';
    }
}
