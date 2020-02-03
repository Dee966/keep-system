package com.xiaoman.keep_system.pojo.dto;

public class TokenIdDto {
    private String token;
    private Integer id;
    private String name;

    public TokenIdDto(){}

    public TokenIdDto(String token, Integer id, String name) {
        this.token = token;
        this.id = id;
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TokenIdDto{" +
                "token='" + token + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
