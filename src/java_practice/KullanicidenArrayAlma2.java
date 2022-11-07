package java_practice;

import java.util.Arrays;
import java.util.Scanner;

public class KullanicidenArrayAlma2 {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        //donduren bir method olusturun.

        System.out.println(Arrays.toString(kullaniciArray()));


    }

    private static int[] kullaniciArray() {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen Array'in uzunlugunu giriniz: ");
        int[] lenght=new int[scan.nextInt()];

        for (int i = 0; i <lenght.length ; i++) {

            System.out.println("lütfen array'e eklenecek sayı giriniz :");
            lenght[i]= scan.nextInt();

        }
        return lenght;



    }
}
