package ders27_ImmutableClasses_DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C07_PeriodOf {
    public static void main(String[] args) {

        //dogumunuzdan ne kadar zaman gecti

        LocalDate bugun= LocalDate.now();
        LocalDate dg= LocalDate.of(2002,2,12);

        Period gecenSure= Period.between(dg,bugun);

        System.out.println(gecenSure.getYears());//20

    }
}
