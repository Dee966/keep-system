package com.xiaoman.keep_system.pojo.dto;

import com.xiaoman.keep_system.pojo.po.Coach;

import java.util.Date;

public class CustomerDto {
    private String email;
    private String telephone;
    private String name;
    private String sex;
    private Integer age;
    private String tall;
    private String weight;
    private String times;
    private Date joinTime;
    private CoachDto coachDto;

    public CustomerDto(){}

    public CustomerDto(String email, String telephone, String name, String sex, Integer age, String tall, String weight, String times, Date joinTime, CoachDto coachDto) {
        this.email = email;
        this.telephone = telephone;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.tall = tall;
        this.weight = weight;
        this.times = times;
        this.joinTime = joinTime;
        this.coachDto = coachDto;
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

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public CoachDto getCoachDto() {
        return coachDto;
    }

    public void setCoachDto(CoachDto coachDto) {
        this.coachDto = coachDto;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", tall='" + tall + '\'' +
                ", weight='" + weight + '\'' +
                ", times='" + times + '\'' +
                ", joinTime=" + joinTime +
                ", coachDto=" + coachDto +
                '}';
    }
}
