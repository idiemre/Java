package tekrar01;

import java.util.Scanner;

public class ifStatements3 {
    public static void main(String[] args) {
         //Soru 3- Kullanicidan bir sayi alin,
        // sayi 3 ile bolunuyorsa ”Uc ile bolunebilensayi”,
        //5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz : ");
        int sayi=scan.nextInt();

        if (sayi%5==0){
            System.out.println("5 ile bölünebilen sayı");
        }else if (sayi%3==0){
            System.out.println("3 ile bölünebilen sayı");
        }else{
            System.out.println("üç ve beş ile bölünemeyen sayı");
        }

    }
}
