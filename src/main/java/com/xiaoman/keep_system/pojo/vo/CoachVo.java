package com.xiaoman.keep_system.pojo.vo;

public class CoachVo {
    private String telephone;
    private String name;
    private Integer age;
    private String tall;
    private String weight;

    public CoachVo(){}

    public CoachVo(String telephone, String name, Integer age, String tall, String weight) {
        this.telephone = telephone;
        this.name = name;
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
        return "CoachVo{" +
                "telephone='" + telephone + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", tall='" + tall + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
