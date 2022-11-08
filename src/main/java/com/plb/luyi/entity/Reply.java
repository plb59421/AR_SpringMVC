package com.plb.luyi.entity;

import java.util.Objects;

/**
 * 实体类
 * 消息回复
 */
public class Reply {
    /**
     * 参数解释
     * comment_id : 被回复的评论id
     * uid : 被回复的用户id
     * from_uid :  回复消息的用户id
     * content : 回复内容
     */
    private int comment_id;
    private int uid;
    private int from_uid;
    private String content;

    public Reply(int comment_id, int uid, int from_uid, String content) {
        this.comment_id = comment_id;
        this.uid = uid;
        this.from_uid = from_uid;
        this.content = content;
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

    public int getFrom_uid() {
        return from_uid;
    }

    public void setFrom_uid(int from_uid) {
        this.from_uid = from_uid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reply reply = (Reply) o;
        return comment_id == reply.comment_id && uid == reply.uid && from_uid == reply.from_uid && Objects.equals(content, reply.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comment_id, uid, from_uid, content);
    }

    @Override
    public String toString() {
        return "Reply{" +
                "comment_id=" + comment_id +
                ", uid=" + uid +
                ", from_uid=" + from_uid +
                ", content='" + content + '\'' +
                '}';
    }
}
