package com.xiaoman.keep_system.pojo.po;

import java.util.Date;

public class CustomerRecord {
    private Integer customerRecordId;
    private Long hour;
    private Date recordTime;
    private Date recordLeaveTime;
    private Integer customerId;

    public CustomerRecord(){}

    public CustomerRecord(Integer customerRecordId, Long hour, Date recordTime, Date recordLeaveTime, Integer customerId) {
        this.customerRecordId = customerRecordId;
        this.hour = hour;
        this.recordTime = recordTime;
        this.recordLeaveTime = recordLeaveTime;
        this.customerId = customerId;
    }

    public Integer getCustomerRecordId() {
        return customerRecordId;
    }

    public void setCustomerRecordId(Integer customerRecordId) {
        this.customerRecordId = customerRecordId;
    }

    public Long getHour() {
        return hour;
    }

    public void setHour(Long hour) {
        this.hour = hour;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public Date getRecordLeaveTime() {
        return recordLeaveTime;
    }

    public void setRecordLeaveTime(Date recordLeaveTime) {
        this.recordLeaveTime = recordLeaveTime;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "CustomerRecord{" +
                "customerRecordId=" + customerRecordId +
                ", hour=" + hour +
                ", recordTime=" + recordTime +
                ", recordLeaveTime=" + recordLeaveTime +
                ", customerId=" + customerId +
                '}';
    }
}
