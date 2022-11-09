package com.plb.luyi.entity;

import java.util.Date;
import java.util.Objects;

/**
 * 实体类
 * 用户
 */
public class User {
    /**
     * 参数解释
     * username ：用户名
     * password ：用户密码
     * phoneNumber ：用户手机号
     * password_past ：用户历史密码
     * ip ：用户的ip名(地区)
     * avatar ：用户头像
     * birthday ：用户生日
     * regTime ：用户注册日期
     */
    private String username;
    private String password;
    private String phoneNumber;
    private String password_past;
    private String ip;
    private String avatar;
    private Date birthday;
    private Date regTime;

    public User(String username, String password, String phoneNumber, String ip, String avatar, Date birthday) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.ip = ip;
        this.avatar = avatar;
        this.birthday = birthday;
        this.regTime = new Date();
    }

    public User(Long uid,String username, String phoneNumber, String password,String password_past, String ip, String avatar, Date birthday,Date regTime) {
        this.username = username;
        this.password = password;
        this.password_past =password_past;
        this.phoneNumber = phoneNumber;
        this.ip = ip;
        this.avatar = avatar;
        this.birthday = birthday;
        this.regTime = regTime;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword_past() {
        return password_past;
    }

    public void setPassword_past(String password_past) {
        this.password_past = password_past;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(phoneNumber, user.phoneNumber) && Objects.equals(password_past, user.password_past) && Objects.equals(ip, user.ip) && Objects.equals(avatar, user.avatar) && Objects.equals(birthday, user.birthday) && Objects.equals(regTime, user.regTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, phoneNumber, password_past, ip, avatar, birthday, regTime);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password_past='" + password_past + '\'' +
                ", ip='" + ip + '\'' +
                ", avatar=" + avatar +
                ", birthday=" + birthday +
                ", regTime=" + regTime +
                '}';
    }
}
