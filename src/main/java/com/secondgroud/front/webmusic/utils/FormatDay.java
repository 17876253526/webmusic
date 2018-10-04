package com.secondgroud.front.webmusic.utils;

/**
 * 日期格式化
 */

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FormatDay {
    //将String类型转化为Date类型
    public static Date StringToDate(String d) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = format.parse(d);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        return date;
    }

    //购买vip截至日期
    public static Date stopVipDate(Date date, int month) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.MONTH, month);
        Date date1 = c.getTime();
        return date1;
    }
}
