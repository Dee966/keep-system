package com.xiaoman.keep_system.pojo.dto;

import java.util.Date;

public class AttendanceDto {
    private Date start;
    private Date end;
    private Long attendant;

    public AttendanceDto(){}

    public AttendanceDto(Date start, Date end, Long attendant) {
        this.start = start;
        this.end = end;
        this.attendant = attendant;
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

    @Override
    public String toString() {
        return "AttendanceDto{" +
                "start=" + start +
                ", end=" + end +
                ", attendant=" + attendant +
                '}';
    }
}
