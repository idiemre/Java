package tekrar01;

import java.util.Scanner;

public class DataCasting5 {
    public static void main(String[] args) {
          // Soru 5- Kullanicidan bir double, bir tamsayi alin,
         // double sayiyi ikinci sayiya bolun
        // ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir double bir tamsayı giriniz : ");
        double sayi1=scan.nextDouble();
        int sayi2=scan.nextInt();

        int sonuc=(int)(sayi1/sayi2);

        System.out.println(sonuc);






    }
}
