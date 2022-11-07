package ders15_Overloading_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        /*
        Soru : Kullanicidan Kullanicidan sifre isteyin asagidaki
        sartlari saglamayan sifrelerde hatalari yazdirip,
        kullanicinin yeni sifre girmesi isteyin
        Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
        gecerli sifre yazilinca “sifreniz basari ile kaydedildi” yazdirin
        sartlar :
        - sifrenin ilk karakteri kucuk harf olmali
        - sifrenin son karakteri sayi olmali
         */
        Scanner scan = new Scanner(System.in);
        boolean sifreGecerliMi = false;
        String sifre = "";
        int bayrak = 0;

        while (sifreGecerliMi == false) {

            System.out.println("lutfen şifrenizi giriniz : ");
            sifre = scan.nextLine();

            if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
                System.out.println("siftrenin ilk karakteri küçük harf olmalı");
                bayrak++;
            }

            if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
                System.out.println("şifrenin son karakteri sayı olmalı");
                bayrak++;

            }
            if (bayrak == 0) {
                sifreGecerliMi = true;
                System.out.println("şifreniz başarı ile kaydedildi");

            }


        }


    }
}