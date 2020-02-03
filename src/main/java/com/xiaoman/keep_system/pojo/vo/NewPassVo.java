package com.xiaoman.keep_system.pojo.vo;

public class NewPassVo {
    private Integer id;
    private String password;
    private String user;

    public NewPassVo(){}

    public NewPassVo(Integer id, String password, String user) {
        this.id = id;
        this.password = password;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "NewPassVo{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
