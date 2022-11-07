package emre;

import java.util.SplittableRandom;

public class bugun {
    public static void main(String[] args) {


        String str1="nazlı";
        String str2="ayşe";
        String str3="fatma";
        String str4="emine";

        String str5="NAZLI";
        String str6="AYŞE";
        String str7="FATMA";
        String str8="EMİNE";




        System.out.println(str1.toUpperCase());
        System.out.println(str2.toUpperCase());
        System.out.println(str3.toUpperCase());
        System.out.println(str4.toUpperCase());

        System.out.println(str1.equals(str5));
        System.out.println(str2.equalsIgnoreCase(str6));

        System.out.println(str1.charAt(2));
        System.out.println(str4.charAt(str4.length()-2));

        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str3.length());
        System.out.println(str4.length());
        System.out.println(str2.substring(0,4).toUpperCase());
        System.out.println(str2.substring(0,4));
        System.out.println(str2.substring(str2.length()-2).toUpperCase());
        System.out.println(str4.substring(0,5).toUpperCase());
        System.out.println(str4.substring(0,1).toUpperCase()+
                str4.substring(1).toLowerCase());









    }
}
