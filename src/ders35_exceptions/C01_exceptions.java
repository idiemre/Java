package ders35_exceptions;

import java.util.Scanner;

public class C01_exceptions {
    public static void main(String[] args) {

        //kullanicidan bir tam sayi alin
        //ve sayinin tam karesini yazdirin
        //kullanici ondalikli sayi girerse kullaniciya
        //uyari yazisi yazdirip tekrar sayi isteyin


        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz :");
       int girilenSayi=scan.nextInt();
        System.out.println(girilenSayi*girilenSayi);
    }
}
