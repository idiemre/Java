package ders10_stringManipulation;

public class C02_contains {
    public static void main(String[] args) {

        String str ="Java ile kodlama cok zevkli";

        System.out.println(str.contains("cok"));//true
        System.out.println(str.contains("odla"));//true
        System.out.println(str.contains("a"));//true
        //System.out.println(str.contains('s'));// paramatere ile char kabul etmez

        System.out.println(str.contains("java"));//false

        String str2 = "Java";
        System.out.println(str.contains(str2));//true

        String str3="234 Ali Can";
        System.out.println(str3.contains(str3));//true

    }
}
