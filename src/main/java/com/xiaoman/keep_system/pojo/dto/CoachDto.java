package com.xiaoman.keep_system.pojo.dto;

import java.util.Date;

public class CoachDto {
    private Integer coachId;
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

    public CoachDto(){}

    public CoachDto(Integer coachId, String email, String telephone, String name, String img, String sex, Integer age, String tall, String weight, Date workTime, String workExperience, String title) {
        this.coachId = coachId;
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
    }

    public Integer getCoachId() {
        return coachId;
    }

    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
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

    @Override
    public String toString() {
        return "CoachDto{" +
                "coachId=" + coachId +
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
                '}';
    }
}
