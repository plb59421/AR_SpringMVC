package com.plb.luyi;

import com.plb.luyi.util.Dateformat;

import java.util.Calendar;
import java.util.Date;

public class test1 {
    public static void main(String[] args) {
        User user = new User(new Date());
        Calendar calendar = Calendar.getInstance();
        Dateformat dateformat =new Dateformat(calendar.getTime());
        System.out.println(dateformat.setFormat());
    }
}
class User{
    public Date time;
    public User (Date time) {
        this.time =time;
    }

}