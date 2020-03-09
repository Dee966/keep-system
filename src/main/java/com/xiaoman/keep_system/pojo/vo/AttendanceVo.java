package com.xiaoman.keep_system.pojo.vo;

import java.util.Date;

public class AttendanceVo {
    private Integer id;
    private Long start;
    private Long end;

    public AttendanceVo(){}

    public AttendanceVo(Integer id, Long start, Long end) {
        this.id = id;
        this.start = start;
        this.end = end;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
                "id=" + id +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
