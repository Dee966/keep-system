package com.xiaoman.keep_system.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void  main(String[] ages) {
        String s = String.valueOf((int) ((Math.random() * 9 + 1) * 100000));
        System.out.println("随机数"+s);
//        long times = new Date().getTime();
//        System.out.println(new Date());

        Date date = new Date();

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String dateStr = simpleDateFormat1.format(date);
        System.out.println("当前时间"+dateStr);

        String string1 = "2020-01-27 00:00:00";
        String string2 = "2020-01-30 23:59:59";
        try {
            Date date1 = simpleDateFormat2.parse(string1);
            Date date2 = simpleDateFormat2.parse(string2);
            Date date3 = simpleDateFormat1.parse(string2);
            Date date4 = simpleDateFormat1.parse(dateStr);
            long times1 = date1.getTime();
            long times2 = date2.getTime();
            long times3 = date3.getTime();
            long times4 = date4.getTime();
            System.out.println("时间戳1："+times1);
            System.out.println("时间戳2："+times2);
            System.out.println("时间戳3："+times3);
            System.out.println("时间戳4："+times4);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
