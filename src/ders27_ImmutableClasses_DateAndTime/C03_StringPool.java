package ders27_ImmutableClasses_DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C03_StringPool {
    public static void main(String[] args) {

        String a="";

        a+=2;
        a+='c';
        a+=false;

        if (a=="2cfalse") System.out.println("==");

        if (a.equals("2cfalse")) System.out.println("equals");


    }
}
