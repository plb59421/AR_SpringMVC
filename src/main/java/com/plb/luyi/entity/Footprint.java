package com.plb.luyi.entity;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * 实体类
 * 足迹记录
 */
public class Footprint {
    /**
     * 参数解释
     * uid : 用户id
     * place_id : 地点id
     * time : 足迹记录时间
     */
    private int uid;
    private int place_id;
    private Timestamp time;

    public Footprint(int uid, int place_id, Timestamp time) {
        this.uid = uid;
        this.place_id = place_id;
        this.time = time;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getPlace_id() {
        return place_id;
    }

    public void setPlace_id(int place_id) {
        this.place_id = place_id;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Footprint footprint = (Footprint) o;
        return uid == footprint.uid && place_id == footprint.place_id && Objects.equals(time, footprint.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, place_id, time);
    }

    @Override
    public String toString() {
        return "Footprint{" +
                "uid=" + uid +
                ", place_id=" + place_id +
                ", time=" + time +
                '}';
    }
}
