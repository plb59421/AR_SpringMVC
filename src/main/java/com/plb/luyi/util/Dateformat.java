package com.plb.luyi.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dateformat {
    private Date date;
    private Timestamp time;
    private Calendar calendar;
    public Dateformat(Date date){
        this.date=date;
    }
    public Dateformat(Timestamp time){
        this.time =time;
    }
    public Dateformat(Calendar calendar){
        this.calendar=calendar;
    }

    public String setFormat(String fomat){
        String str=null;
        SimpleDateFormat formatter = new SimpleDateFormat(fomat);
        return getString(str, formatter);
    }

    public String setFormat(){
        String str=null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        return getString(str, formatter);
    }

    private String getString(String str, SimpleDateFormat formatter) {
        if(calendar!=null){
            str = formatter.format(calendar.getTime());
            System.out.println(1);
        }else if(time!=null){
            str = formatter.format(time.getTime());
        }else if(date!=null){
            str = formatter.format(date);
        }
        return str;
    }

}
