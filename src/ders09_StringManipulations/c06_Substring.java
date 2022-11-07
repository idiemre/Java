package ders09_StringManipulations;

import java.util.Locale;

public class c06_Substring {
    public static void main(String[] args) {

        String str = "Java ogren, isi kap";


        System.out.println(str.substring(5));
        System.out.println(str.substring(0));

        System.out.println(str.length());

        //son karakteri String olarak kaydedein
        String sonHarf=""+str.charAt(str.length()-1);

        sonHarf=str.substring(str.length()-1);
        System.out.println(sonHarf);
        //son indexteki karakteri upper case olarak yazdırın

        System.out.println(str.substring(str.length()-1).toUpperCase());

        //son 3 harfi buyuk harf olarak yazdırın

        System.out.println(str.substring(str.length()-3).toUpperCase());


    }
}
