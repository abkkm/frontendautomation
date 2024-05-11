package com.abkkm.aggregate;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.TimeZone;

public class tt {

    static void print(String format, String result) {
        System.out.printf("%s: %s\n", format, result);
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss a", Locale.ENGLISH);
        formatter.setTimeZone(TimeZone.getTimeZone("America/New_York"));

        String dateInString = "22-01-2015 10:15:55 AM"; 
        Date date = formatter.parse(dateInString);
        String formattedDateString = formatter.format(date);
    }

    public static void main(String[] args) {
        print("ofLocalizedDate(*)", DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(LocalDate.now()));
        print("ofLocalizedTime(*)", DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(LocalTime.now()));
        print("ofLocalizedDateTime(*)", DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(LocalDateTime.now()));
        print("ofLocalizedDateTime(*, *)", DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT).format(LocalDateTime.now()));

        print("BASIC_ISO_DATE", DateTimeFormatter.BASIC_ISO_DATE.format(LocalDate.now()));
        print("ISO_LOCAL_DATE", DateTimeFormatter.ISO_LOCAL_DATE	.format(LocalDate.now()));
        print("ISO_OFFSET_DATE", DateTimeFormatter.ISO_OFFSET_DATE.format(OffsetDateTime.now()));
        print("ISO_DATE", DateTimeFormatter.ISO_DATE.format(OffsetDateTime.now()));
        print("ISO_LOCAL_TIME", DateTimeFormatter.ISO_LOCAL_TIME.format(LocalTime.now()));
        print("ISO_OFFSET_TIME", DateTimeFormatter.ISO_OFFSET_TIME.format(OffsetTime.now()));
        print("ISO_TIME", DateTimeFormatter.ISO_TIME.format(OffsetTime.now()));
        print("ISO_LOCAL_DATE_TIME", DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.now()));
        print("ISO_OFFSET_DATE_TIME", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(OffsetDateTime.now()));
        print("ISO_ZONED_DATE_TIME", DateTimeFormatter.ISO_ZONED_DATE_TIME.format(ZonedDateTime.now()));
        print("ISO_DATE_TIME", DateTimeFormatter.ISO_DATE_TIME.format(ZonedDateTime.now()));
        print("ISO_ORDINAL_DATE", DateTimeFormatter.ISO_ORDINAL_DATE.format(ZonedDateTime.now()));
        print("ISO_WEEK_DATE", DateTimeFormatter.ISO_WEEK_DATE.format(ZonedDateTime.now()));
        print("ISO_INSTANT", DateTimeFormatter.ISO_INSTANT.format(ZonedDateTime.now()));
        print("RFC_1123_DATE_TIME", DateTimeFormatter.RFC_1123_DATE_TIME.format(ZonedDateTime.now()));
    }
}