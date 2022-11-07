package tekrar01;

import java.util.Scanner;

public class Datacasting4 {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan iki double sayi alin,
        // ilk sayiyi ikinci sayiya bolun ve bolum
        //isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen iki double sayı giriniz : ");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        double sonuc=sayi1/sayi2;



         sonuc=(int)sonuc;

        System.out.println(sonuc);


    }
}
