package tekrar01;

import java.util.Scanner;

public class DataCasting3 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir sayi alin, kullanici
        //kac degerini girerse girsin, o sayiyi -128
        //ile 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen bir sayı giriniz : ");
        int sayi=scan.nextInt();
        sayi=(byte)sayi;
        System.out.println(sayi);
    }
}
