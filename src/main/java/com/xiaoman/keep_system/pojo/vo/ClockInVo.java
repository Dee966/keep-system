package com.xiaoman.keep_system.pojo.vo;

import java.util.Date;

public class ClockInVo {
    private Integer coachId;
    private Date clockInTime;

    public ClockInVo(){
    }

    public ClockInVo(Integer coachId, Date clockInTime) {
        this.coachId = coachId;
        this.clockInTime = clockInTime;
    }

    public Integer getCoachId() {
        return coachId;
    }

    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }

    public Date getClockInTime() {
        return clockInTime;
    }

    public void setClockInTime(Date clockInTime) {
        this.clockInTime = clockInTime;
    }

    @Override
    public String toString() {
        return "ClockInVo{" +
                "coachId=" + coachId +
                ", clockInTime=" + clockInTime +
                '}';
    }
}
