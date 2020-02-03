package com.xiaoman.keep_system.pojo.po;

import java.util.Date;

public class Share {
    private Integer shareId;
    private String content;
    private String firImg;
    private String secImg;
    private String thiImg;
    private String name;
    private Integer praise;
    private Date shareTime;

    public Share(){}

    public Share(Integer shareId, String content, String firImg, String secImg, String thiImg, String name, Integer praise, Date shareTime) {
        this.shareId = shareId;
        this.content = content;
        this.firImg = firImg;
        this.secImg = secImg;
        this.thiImg = thiImg;
        this.name = name;
        this.praise = praise;
        this.shareTime = shareTime;
    }

    public Integer getShareId() {
        return shareId;
    }

    public void setShareId(Integer shareId) {
        this.shareId = shareId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFirImg() {
        return firImg;
    }

    public void setFirImg(String firImg) {
        this.firImg = firImg;
    }

    public String getSecImg() {
        return secImg;
    }

    public void setSecImg(String secImg) {
        this.secImg = secImg;
    }

    public String getThiImg() {
        return thiImg;
    }

    public void setThiImg(String thiImg) {
        this.thiImg = thiImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPraise() {
        return praise;
    }

    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    public Date getShareTime() {
        return shareTime;
    }

    public void setShareTime(Date shareTime) {
        this.shareTime = shareTime;
    }

    @Override
    public String toString() {
        return "Share{" +
                "shareId=" + shareId +
                ", content='" + content + '\'' +
                ", firImg='" + firImg + '\'' +
                ", secImg='" + secImg + '\'' +
                ", thiImg='" + thiImg + '\'' +
                ", name='" + name + '\'' +
                ", praise=" + praise +
                ", shareTime=" + shareTime +
                '}';
    }
}
