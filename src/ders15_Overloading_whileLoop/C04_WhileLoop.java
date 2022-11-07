package ders15_Overloading_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {

        /*
        kullanıcıdan toplanmak üzere tamsayılar alın
        kullanıcı 0'a basarsa sayi alma işlemini btirin

        kullanıcının kac sayı girdiğini ve bu sayıların
        toplamının kac olduğunu yazdırın
         */
        Scanner scan=new Scanner(System.in);
        int girilenSayi=5;//verilen ilk deger bu soru için 0 olmamalı
                          //cunku 0 loop'u bitirmek icin kullanılacak
        int sayac=0;
        int toplam=0;

        while (girilenSayi!=0){
            System.out.println("lutfen toplamak için tamsayı girin : "+
                    "\nBitirmek için 0'a basın");
            girilenSayi=scan.nextInt();

            if (girilenSayi!=0){
                sayac++;
                toplam=toplam+girilenSayi;
            }




        }
        System.out.println("girilen "+sayac+" adet sayının toplamı: "+toplam);







    }
}
