package com.plb.luyi.entity;

import java.util.Objects;

/**
 * 实体类
 * 评论点赞表
 */
public class CommentLike {
    /**
     * 参数解释
     * comment_id : 被点赞评论id
     * uid : 用户id
     * status : 评论被点赞状态
     */
    private int comment_id;
    private int uid;
    private boolean status;

    public CommentLike(int comment_id, int uid, Boolean status) {
        this.comment_id = comment_id;
        this.uid = uid;
        this.status = status;
    }

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentLike that = (CommentLike) o;
        return comment_id == that.comment_id && uid == that.uid && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comment_id, uid, status);
    }

    @Override
    public String toString() {
        return "CommentLike{" +
                "comment_id=" + comment_id +
                ", uid=" + uid +
                ", status=" + status +
                '}';
    }
}
