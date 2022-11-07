package ders14_methodOlusturma;

public class C04_Tekrar {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        //bu iki sayının carpım soucunu yeni kod yazmadan
        //konsola yazdırın

        System.out.println(C01_Carpim.carpimMethodu(a, b));

        String c="nasil";
        String d="yani";
        //bu iki stringi aralarında bir bosluk bırakarak yazdırın

        System.out.println(C02_StringConcat.birlestirMethodu(c,d));

        String e="Bu da mi oldu?";
        //e stringini tersten yazdırın

        System.out.println(C03_StringTerseCevirme.stringiTerseCevir(e));

        //"bu cümleyi terse cevirin"

        System.out.println(C03_StringTerseCevirme.stringiTerseCevir("bu cümleyi terse cevirin"));



    }
}
