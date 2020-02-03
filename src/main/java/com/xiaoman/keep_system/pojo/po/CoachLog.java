package com.xiaoman.keep_system.pojo.po;

import java.util.Date;

public class CoachLog {
    private Integer coachLogId;
    private Date coachLeave;
    private Integer coachId;
    private Integer managerId;

    public CoachLog(){}

    public CoachLog(Integer coachLogId, Date coachLeave, Integer coachId, Integer managerId) {
        this.coachLogId = coachLogId;
        this.coachLeave = coachLeave;
        this.coachId = coachId;
        this.managerId = managerId;
    }

    public Integer getCoachLogId() {
        return coachLogId;
    }

    public void setCoachLogId(Integer coachLogId) {
        this.coachLogId = coachLogId;
    }

    public Date getCoachLeave() {
        return coachLeave;
    }

    public void setCoachLeave(Date coachLeave) {
        this.coachLeave = coachLeave;
    }

    public Integer getCoachId() {
        return coachId;
    }

    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        return "CoachLog{" +
                "coachLogId=" + coachLogId +
                ", coachLeave=" + coachLeave +
                ", coachId=" + coachId +
                ", managerId=" + managerId +
                '}';
    }
}
