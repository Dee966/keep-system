package com.xiaoman.keep_system.pojo.vo;

public class CodeVo {
    private Integer customerId;
    private String email;
    private String code;

    private CodeVo(){}

    public CodeVo(Integer customerId, String email, String code) {
        this.customerId = customerId;
        this.email = email;
        this.code = code;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "CodeVo{" +
                "customerId=" + customerId +
                ", email='" + email + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
