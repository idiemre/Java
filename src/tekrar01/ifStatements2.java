package tekrar01;

import java.util.Scanner;

public class ifStatements2 {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        // NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        // Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz: ");
        char harf=scan.next().charAt(0);


        if (harf=='o'|| harf=='O'){
            System.out.println("ocak");
        }else if (harf=='s'|| harf=='S'){
            System.out.println("subat");
        }else if (harf=='m'|| harf=='M') {
            System.out.println("mart ve mayıs");
        }else if (harf=='n'|| harf=='N'){
            System.out.println("nisan");
        }else if (harf=='h'|| harf=='H'){
            System.out.println("haziran");
        }else if (harf=='t'|| harf=='T') {
            System.out.println("temmuz");
        }else if (harf=='a'|| harf=='A'){
            System.out.println("agustos ve aralık");
        }else if (harf=='e'|| harf=='E'){
            System.out.println("eylül ve ekim");
        }else if (harf=='k'|| harf=='K'){
            System.out.println("kasım");
        }else{
            System.out.println("gçersiz harf girdiniz");
        }


    }
}
