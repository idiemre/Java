package ders29_stringBuilder_accessModifier;

public class C02_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java Candir");

        System.out.println(sb1.reverse());//ridnaC avaJ

        System.out.println("tersini yazdırdıktan sonra sb1 : "+sb1);//ridnaC avaJ

        System.out.println(sb1.insert(0, "."));//.ridnaC avaJ

        System.out.println(sb1);//ridnaC avaJ

        System.out.println(sb1.reverse());//Java Candir.

        StringBuilder sb2=new StringBuilder("Java Candir.");
        String str="Java Candir.";

        System.out.println(sb1==sb2);//false  icerik ayni olsa bile false verir
        System.out.println(sb1==sb1);//true sadece bir sb kendisi ile karsilastirilirsa true verir
        //System.out.println(sb1==str); farkli iki data turu ile karsilastiralamaz

        System.out.println(sb1.equals(sb2));//false
        System.out.println(sb1.equals(sb1));//true
        System.out.println(sb1.equals(str));//false  CTE vermez ama sonuc herzaman false'dir

        System.out.println(sb1.compareTo(sb2));//0

        StringBuilder sb3=new StringBuilder("Java Kandir");

        System.out.println(sb1.compareTo(sb3));//2

        /*
        CompareTo sadece tamamen ayni mi yoksa farkli mi sorusunun cevvabini verir
        tamamen ayni ise ==> 0 döner
        farklilik varsa ==> ilk farkli harfi buldugunda, farkli harflerinn arasinda kac harf oldugunu verir

         */






    }
}
