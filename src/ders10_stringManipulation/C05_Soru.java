package ders10_stringManipulation;

import java.util.Scanner;

public class C05_Soru {
    public static void main(String[] args) {

        /*
        mail kontrolü yapan bir program hazırlayın
        1- maili @ isareti içermiyorsa gecersiz email
        2- @gmail.com içermiyorsa "gmail adresi giriniz"
        3- @gmail.com ile bitmiyorsa "yazim hatasi"
        seklinde sonuc yazdirin
         */
        String email="ahmet@gmail.com";

        if (!email.contains("@")){

            System.out.println("geçersiz email");
        }else if (!email.contains("@gmail.com")) {
            System.out.println("gmail adresi giriniz");
        }else if (!email.endsWith("@gmail.com")){
            System.out.println("yazim hatası");
        }else{
            System.out.println("email basarı ile kaydedildi");
        }
    }
}
