package ders13_nestedForLoop_methodOlusturma;

import java.util.Scanner;

public class C08_MethodOluşturma {
    public static void main(String[] args) {

        /*
        kullanıcıdan 2 sayı alıp,
        bunların ttoplamını yazdıran bir method oluşturun
         */
        isteToplaYazdır();
        isteToplaYazdır();



    }

    public static void isteToplaYazdır(){
        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen iki sayı giriniz : ");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        System.out.println("girilen sayıların toplamı : " + (sayi1+sayi2));
    }



}
