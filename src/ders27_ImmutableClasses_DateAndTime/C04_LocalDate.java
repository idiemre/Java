package ders27_ImmutableClasses_DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C04_LocalDate {
    public static void main(String[] args) {


        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);//2022-10-29

        System.out.println(tarih.minusDays(100));//2022-07-21
        System.out.println(tarih.minusWeeks(5).minusDays(3));//2022-09-21

        System.out.println(tarih.plusMonths(5)
                                .plusWeeks(2)
                                .plusDays(3));

        System.out.println(tarih.getMonthValue());//10
        System.out.println(tarih.getMonth());//October
        System.out.println(tarih.getDayOfWeek());//SATURDAY
        System.out.println(tarih.getDayOfYear());//302

        System.out.println(tarih.isLeapYear());//false

        System.out.println(tarih.withYear(2000).isLeapYear());//true
        System.out.println(tarih.withYear(2020).withMonth(11).withDayOfMonth(13));//2020-11-13

        System.out.println(tarih.lengthOfYear());//365

        System.out.println(tarih.withYear(2020).lengthOfYear());//366

        System.out.println(tarih.withYear(2002).withMonth(2).withDayOfMonth(12).getDayOfWeek());

        LocalDate date =LocalDate.of(2002,2,12);
        LocalDate date2=LocalDate.of(2010,10,10);

        System.out.println(date2.isBefore(date));//false
        System.out.println(date2.isAfter(date));//true

        System.out.println(tarih.equals(date));//false




    }

}
