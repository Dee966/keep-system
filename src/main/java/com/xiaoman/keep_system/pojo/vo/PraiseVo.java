package com.xiaoman.keep_system.pojo.vo;

public class PraiseVo {
    private Integer judge;//0点赞 1取消
    private Integer shareId;

    public PraiseVo(){}

    public PraiseVo(Integer judge, Integer shareId) {
        this.judge = judge;
        this.shareId = shareId;
    }

    public Integer getJudge() {
        return judge;
    }

    public void setJudge(Integer judge) {
        this.judge = judge;
    }

    public Integer getShareId() {
        return shareId;
    }

    public void setShareId(Integer shareId) {
        this.shareId = shareId;
    }

    @Override
    public String toString() {
        return "PraiseVo{" +
                "judge=" + judge +
                ", shareId=" + shareId +
                '}';
    }
}
