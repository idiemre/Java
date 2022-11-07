package emre;

import java.util.Scanner;

public class C34_WhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);



        int sayı=0;
        int toplam=0;
        int sayac=0;



        while (toplam<500) {

            System.out.println("lütfen toplamak için sayı giriniz");
            sayı=scan.nextInt();

            toplam=toplam+sayı;
            sayac++;






        }
        System.out.println("girilen "+sayac+" adet sayının toplamı "+toplam+" bu kadar yeter");
    }
}
