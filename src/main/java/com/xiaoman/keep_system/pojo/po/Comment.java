package com.xiaoman.keep_system.pojo.po;

public class Comment {
    private Integer commentId;
    private String content;
    private Integer shareId;
    private String name;

    public Comment(){}

    public Comment(Integer commentId, String content, Integer shareId, String name) {
        this.commentId = commentId;
        this.content = content;
        this.shareId = shareId;
        this.name = name;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getShareId() {
        return shareId;
    }

    public void setShareId(Integer shareId) {
        this.shareId = shareId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", content='" + content + '\'' +
                ", shareId=" + shareId +
                ", name='" + name + '\'' +
                '}';
    }
}
