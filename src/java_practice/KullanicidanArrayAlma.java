package java_practice;

import java.io.LineNumberReader;
import java.util.Arrays;
import java.util.Scanner;

public class KullanicidanArrayAlma {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        //donduren bir method olusturun.

        int[] kullaniciArray=kullanicidanArrayAlmaMethodu();

        System.out.println(Arrays.toString(kullaniciArray));

    }

    private static int[] kullanicidanArrayAlmaMethodu() {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen array'in uzunlugunu giriniz : ");
        int lenght= scan.nextInt();

        int[] kullaniciArrayi= new int[lenght];
        for (int i = 0; i <lenght ; i++) {

            System.out.println("arraye eklenecek sayı giriniz : ");
            kullaniciArrayi[i]= scan.nextInt();

        }
        return kullaniciArrayi;
    }
}
