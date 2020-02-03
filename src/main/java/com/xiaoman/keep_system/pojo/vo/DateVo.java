package com.xiaoman.keep_system.pojo.vo;

import java.util.Date;

public class DateVo {
    private Date keepTime;

    public DateVo(){}

    public DateVo(Date keepTime) {
        this.keepTime = keepTime;
    }

    public Date getKeepTime() {
        return keepTime;
    }

    public void setKeepTime(Date keepTime) {
        this.keepTime = keepTime;
    }

    @Override
    public String toString() {
        return "DateVo{" +
                "keepTime=" + keepTime +
                '}';
    }
}
