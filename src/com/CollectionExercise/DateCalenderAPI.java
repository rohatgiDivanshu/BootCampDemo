package com.CollectionExercise;

import java.time.ZonedDateTime;

public class DateCalenderAPI {

    public static void main(String[] args) {

/*
        SimpleDateFormat sf = new SimpleDateFormat("F-Y");
        String date = sf.format(new Date());
        System.out.println(date);
*/

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

    }
}
