package tekrar01;

import java.util.Scanner;

public class whileLoop1 {
    public static void main(String[] args) {

        /*
        Soru : Kullanicidan Kullanicidan sifre
        isteyin asagidaki sartlari saglamayan
         sifrelerde hatalari yazdirip,
        kullanicinin yeni sifre girmesi isteyin
        Gecerli bir sifre yazilincaya kadar bu
        islemi tekrar edin gecerli sifre
        yazilinca “sifreniz basari ile
         kaydedildi” yazdirin
         sartlar :
        - sifrenin ilk karakteri kucuk harf
        olmali
         - sifrenin son karakteri sayi olmali
         */

        Scanner scan=new Scanner(System.in);

        boolean sifreDogruMu=false;
        String sifre="";
        char ilkHarf;
        char sonHarf;
        int sayac=0;

        while(sifreDogruMu==false){
            System.out.println("lüfen şifre giriniz : ");
            sifre=scan.nextLine();


           ilkHarf=sifre.charAt(0);
           sonHarf=sifre.charAt(sifre.length()-1);

           if (!(ilkHarf>='a' && ilkHarf<='z')){
               System.out.println("sifrenin ilk harfi kücük olmalı");
               sayac++;
           }
           if (!(sonHarf>='0' && sonHarf<='9')){
               System.out.println("son karakter sayi olmali");
               sayac++;
           }
           if (sayac==0){
               sifreDogruMu=true;
               System.out.println("sifre basarı ile kaydedildi");

           }
        }


    }
}
