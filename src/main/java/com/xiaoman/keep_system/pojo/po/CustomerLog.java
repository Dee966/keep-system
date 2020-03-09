package com.xiaoman.keep_system.pojo.po;

import javax.xml.crypto.Data;
import java.util.Date;

public class CustomerLog {
    private Integer customerLogId;
    private Date customerLeave;
    private Integer customerId;
    private Integer managerId;

    public CustomerLog(){}

    public CustomerLog(Integer customerLogId, Date customerLeave, Integer customerId, Integer managerId) {
        this.customerLogId = customerLogId;
        this.customerLeave = customerLeave;
        this.customerId = customerId;
        this.managerId = managerId;
    }

    public Integer getCustomerLogId() {
        return customerLogId;
    }

    public void setCustomerLogId(Integer customerLogId) {
        this.customerLogId = customerLogId;
    }

    public Date getCustomerLeave() {
        return customerLeave;
    }

    public void setCustomerLeave(Date customerLeave) {
        this.customerLeave = customerLeave;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        return "CustomerLog{" +
                "customerLogId=" + customerLogId +
                ", customerLeave=" + customerLeave +
                ", customerId=" + customerId +
                ", managerId=" + managerId +
                '}';
    }
}
