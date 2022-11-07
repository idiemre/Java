package ders08_ternary_switch;

public class C03_Ternary {
    public static void main(String[] args) {


        int a = 5;
        /*
        Ternary operatörü tek basina kullanılamaz
        ternary bize bir sonuc üretir
        bu sonucu ya direk yazdırmalı yada bir vaiable'a atamalıyız
         */

        String sonuc = a%2==0 ? "cift sayı" : "tek sayı";
        System.out.println(sonuc);


        /*
        ternary'nin sonucu bir variable'ye ataycaksak
        true ve false durumlarında uretilecek sonucun
        aynı data turune uygun olması gerekir
        aksi halde CTE oluşur

        ama ternary'i sout içinde kullanırsak sonuçların
        data türünün aynı olması şart olmaz
         */

        String sonuc2 = a>10 ? "buyuk sayı" :""+ 2*a ;//CTE vermemesi icin stringe çevirdik


    }
}
