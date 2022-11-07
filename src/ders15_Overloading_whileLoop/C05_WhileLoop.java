package ders15_Overloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {


        /*
        kullanıcıdan toplanmak uzere sayı alım
        sayıların toplamı 500'e esit olur veya gecerse

        girilen sayı adedi,
        girilen sayıların toplamını ve
        "bukadar yeter" yazdırın
         */

        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;
        int toplam=0;
        int sayac=0;

        while (toplam<500){

            System.out.println("toplamak için sayı giriniz : ");
            girilenSayi= scan.nextInt();
            toplam+=girilenSayi;
            sayac++;
        }
        System.out.println("girilen: "+ sayac+ " sayinin toplamı: "+toplam+" oldu. bu kadar yeter");

    }
}
