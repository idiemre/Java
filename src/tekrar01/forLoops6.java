package tekrar01;

import java.util.Scanner;

public class forLoops6 {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scan=new Scanner(System.in);

        System.out.print("lütfen 20'den kücük bir sayı giriniz :");
        int sayi= scan.nextInt();
        int faktoriyel=1;



        for (int i = sayi; i >=1 ; i--) {

            faktoriyel=faktoriyel*i;
            System.out.println(faktoriyel);
        }

    }

}
