package com.plb.luyi.entity;

import javafx.scene.text.Text;

import java.util.Objects;

/**
 * 实体类
 * 评论
 */
public class Comment {
    /**
     * 参数解释
     * place_int : 地点id
     * uid : 用户id
     * content : 评论内容
     */
    private int place_int;
    private int uid;
    private String content;

    public Comment(int place_int, int uid, String context) {
        this.place_int = place_int;
        this.uid = uid;
        this.content = context;
    }

    public int getPlace_int() {
        return place_int;
    }

    public void setPlace_int(int place_int) {
        this.place_int = place_int;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getContext() {
        return content;
    }

    public void setContext(String context) {
        this.content = context;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return place_int == comment.place_int && uid == comment.uid && Objects.equals(content, comment.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(place_int, uid, content);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "place_int=" + place_int +
                ", uid=" + uid +
                ", content='" + content + '\'' +
                '}';
    }
}
