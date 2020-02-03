package com.xiaoman.keep_system.pojo.po;

import java.util.Date;

public class Attendance {
    private Integer attendanceId;
    private Date start;
    private Date end;
    private Long attendant;
    private Integer coachId;

    public Attendance(){}

    public Attendance(Integer attendanceId, Date start, Date end, Long attendant, Integer coachId) {
        this.attendanceId = attendanceId;
        this.start = start;
        this.end = end;
        this.attendant = attendant;
        this.coachId = coachId;
    }

    public Integer getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Long getAttendant() {
        return attendant;
    }

    public void setAttendant(Long attendant) {
        this.attendant = attendant;
    }

    public Integer getCoachId() {
        return coachId;
    }

    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "attendanceId=" + attendanceId +
                ", start=" + start +
                ", end=" + end +
                ", attendant=" + attendant +
                ", coachId=" + coachId +
                '}';
    }
}
