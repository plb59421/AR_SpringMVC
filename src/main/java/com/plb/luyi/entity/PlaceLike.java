package com.plb.luyi.entity;

import java.util.Objects;

/**
 * 实体类
 * 地点点赞表
 */
public class PlaceLike {
    /**
     * 参数解释
     * place_id : 被点赞地点id
     * uid : 点赞的用户id
     * status : 该记录点赞状态
     */
    private int place_id;
    private int uid;
    private boolean status;

    public PlaceLike(int place_id, int uid, boolean status) {
        this.place_id = place_id;
        this.uid = uid;
        this.status = status;
    }

    public int getPlace_id() {
        return place_id;
    }

    public void setPlace_id(int place_id) {
        this.place_id = place_id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaceLike placeLike = (PlaceLike) o;
        return place_id == placeLike.place_id && uid == placeLike.uid && status == placeLike.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(place_id, uid, status);
    }

    @Override
    public String toString() {
        return "PlaceLike{" +
                "place_id=" + place_id +
                ", uid=" + uid +
                ", status=" + status +
                '}';
    }
}
