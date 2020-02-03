package com.xiaoman.keep_system.pojo.vo;

import java.util.Date;

public class AttendanceVo {
    private Long start;
    private Long end;

    public AttendanceVo(){}

    public AttendanceVo(Long start, Long end) {
        this.start = start;
        this.end = end;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getEnd() {
        return end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "AttendanceVo{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
