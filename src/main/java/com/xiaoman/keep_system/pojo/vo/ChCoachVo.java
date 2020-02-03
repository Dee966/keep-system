package com.xiaoman.keep_system.pojo.vo;

public class ChCoachVo {
    private Integer customerId;
    private Integer coachId;

    public ChCoachVo(){}

    public ChCoachVo(Integer customerId, Integer coachId) {
        this.customerId = customerId;
        this.coachId = coachId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCoachId() {
        return coachId;
    }

    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }

    @Override
    public String toString() {
        return "ChCoachVo{" +
                "customerId=" + customerId +
                ", coachId=" + coachId +
                '}';
    }
}
