package com.plb.luyi.entity;

import java.util.Objects;

/**
 * 实体类
 * 地点
 */
public class Place {
    /**
     * 参数解释
     * place_name : 地点名称
     * place_name_en : 地点名称转英文，待定
     * comment_count : 评论数量
     * place_code : 地点区号
     * place_lon : 地点经度
     * place_lat : 地点纬度
     */
    private String place_name;
    private String place_name_en;
    private String comment_count;
    private int place_code;
    private float place_lon;
    private float place_lat;

    public Place(String place_name, String comment_count, int place_code, float place_lon, float place_lat) {
        this.place_name = place_name;
        this.comment_count = comment_count;
        this.place_code = place_code;
        this.place_lon = place_lon;
        this.place_lat = place_lat;
    }

    public String getPlace_name() {
        return place_name;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

    public String getPlace_name_en() {
        return place_name_en;
    }

    public void setPlace_name_en(String place_name_en) {
        this.place_name_en = place_name_en;
    }

    public String getComment_count() {
        return comment_count;
    }

    public void setComment_count(String comment_count) {
        this.comment_count = comment_count;
    }

    public int getPlace_code() {
        return place_code;
    }

    public void setPlace_code(int place_code) {
        this.place_code = place_code;
    }

    public float getPlace_lon() {
        return place_lon;
    }

    public void setPlace_lon(float place_lon) {
        this.place_lon = place_lon;
    }

    public float getPlace_lat() {
        return place_lat;
    }

    public void setPlace_lat(float place_lat) {
        this.place_lat = place_lat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return place_code == place.place_code && Float.compare(place.place_lon, place_lon) == 0 && Float.compare(place.place_lat, place_lat) == 0 && Objects.equals(place_name, place.place_name) && Objects.equals(place_name_en, place.place_name_en) && Objects.equals(comment_count, place.comment_count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(place_name, place_name_en, comment_count, place_code, place_lon, place_lat);
    }

    @Override
    public String toString() {
        return "Place{" +
                "place_name='" + place_name + '\'' +
                ", place_name_en='" + place_name_en + '\'' +
                ", comment_count='" + comment_count + '\'' +
                ", place_code=" + place_code +
                ", place_lon=" + place_lon +
                ", place_lat=" + place_lat +
                '}';
    }
}
