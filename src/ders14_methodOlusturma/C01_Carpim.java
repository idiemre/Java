package ders14_methodOlusturma;

import java.util.Scanner;

public class C01_Carpim {

    //main method içerisinde kullanıcıdan iki sayi alin,
    //bu iki sayiyi parametre olarak kabul edip,
    // çarpımlarını bize döndüren bir method olusturun

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen iki sayi giriniz :");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.println("işlemin sonucu :"+carpimMethodu(sayi1,sayi2));



    }

    public static double carpimMethodu(double sayi1, double sayi2) {


        return sayi1 * sayi2;

    }
}