package com.xiaoman.keep_system.pojo.vo;

import java.util.Date;

public class CustomerVo {
    private String telephone;
    private String name;
    private String sex;
    private Integer age;
    private String tall;
    private String weight;
    public CustomerVo(){}

    public CustomerVo(String telephone, String name, String sex, Integer age, String tall, String weight) {
        this.telephone = telephone;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.tall = tall;
        this.weight = weight;
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

    @Override
    public String toString() {
        return "CustomerVo{" +
                "telephone='" + telephone + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", tall='" + tall + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
