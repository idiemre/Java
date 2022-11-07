package ders17_Scope;

import java.util.Scanner;

public class C05_ObjectVariables {

    public static void main(String[] args) {

        //C03 class'indaki instance variabl'lara nasıl ulasabiliriz?
        // instance variallerin diger adı obje variable'larıdır
        //instance variable'lara obje üzerinden ulasabiliriz


        C03_ObjectVariables pers1 = new C03_ObjectVariables();

        System.out.println(pers1.persIsmi);// Isim girilmedi
        System.out.println(pers1.persYasi);// 0

        pers1.persIsmi = "Süleyman";
        pers1.persYasi = 35;
        pers1.persTelefonu = "5553456754";

        System.out.println(pers1.persIsmi);//Süleyman
        System.out.println(pers1.persYasi);// 35

        C03_ObjectVariables pers2=new C03_ObjectVariables();
        pers2.persIsmi = "Latife";
        pers2.persYasi = 32;
        pers2.persTelefonu = "523345.6754";


        System.out.println(pers1.persIsmi);// Süleyman
        System.out.println(pers2.persIsmi);// Latife

        C03_ObjectVariables pers3=new C03_ObjectVariables();
        pers3.persIsmi = "Heysem";
        pers3.persYasi = 30;
        pers3.persTelefonu = "544637483";

        System.out.println(pers1.persYasi);//35
        System.out.println(pers2.persYasi);//32
        System.out.println(pers3.persYasi);//30



    }
}
