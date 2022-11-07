package emre;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        /*
        mail kontrolü yapan bir program hazırlayın
        1- maili @ isareti içermiyorsa gecersiz email
        2- @gmail.com içermiyorsa "gmail adresi giriniz"
        3- @gmail.com ile bitmiyorsa "yazim hatasi"
        seklinde sonuc yazdirin
         */

        Scanner scan =new Scanner(System.in);
        System.out.print("Lutfen Mail Adresini Giriniz :");
        String mail=scan.nextLine();


        if (!mail.contains("@")){
            System.out.println("geçersiz mail");
        }else if (!mail.contains("@gmail.com")){
            System.out.println("gmail adresi giriniz");
        }else if (!mail.endsWith("@gmail.com")){
            System.out.println("yazım hatası");
        }else
            System.out.println("giriş başarılı");



    }
}
