package emre;

import java.util.Scanner;

public class fdfd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kg olarak kilonuzu giriniz");
        double agirlik= scan.nextDouble();
        System.out.println("cm olarak boyunuzu giriniz");
        double boy= scan.nextDouble();


        double vke= (agirlik*10000 / (boy *boy));
        System.out.println("Vucut kitle endeksiniz : " +vke);

        if (vke>30){
            System.out.println("Obez");
        }else if (vke>25 && vke<=30){
            System.out.println("kilolu");
        }else if(vke>=20 && vke<=25){
            System.out.println("normal");
        }else if (vke<20){
            System.out.println("zayıf");
        }


    }
}
