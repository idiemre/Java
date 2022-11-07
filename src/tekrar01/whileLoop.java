package tekrar01;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        //Soru : Kullanicidan toplanmak uzere sayilar isteyin toplam 500 olur veya gecerse
        //toplami yazdirin.

        Scanner scan=new Scanner(System.in);



       int toplam=0;

        while (toplam<=500){

            System.out.println("lütfen toplanmak üzere sayı giriniz :");
            int sayi=scan.nextInt();

            toplam+=sayi;


        }
        System.out.println("toplam "+toplam+" yeter");
    }
}
