package ders11_stringManipulation;

public class C02_replace {
    public static void main(String[] args) {

        String str = "Java candir";

        System.out.println(str.replace('a', 'A'));//JAvA cAndir

        System.out.println(str.replace(' ','_'));//Java_candir

        System.out.println(str.replace("candir","cok guzeldir."));//Java cok guzeldir.

        System.out.println(str.replace(" ",""));//Javacandir


        System.out.println(str.replace("a",""));//Jv cndir

        //java yerine hava candır yerine cok güzel

        System.out.println(str.replace("Java","Hava").replace("candir","cok guzel"));//Hava cok guzel

        //sadece birinci a'yı A yapın

        System.out.println(str.replaceFirst("a","A"));//JAva candir


    }
}
