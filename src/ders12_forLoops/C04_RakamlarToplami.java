package ders12_forLoops;

public class C04_RakamlarToplami {
    public static void main(String[] args) {

        //kullanıcının verdiği sayının rakamlar toplamını bulun

        int sayi=1000;
        String sayistr=""+sayi;
        int birlerbasamagı=0;
        int rakamlartoplamı=0;

        for (int i = 1; i <=sayistr.length() ; i++) {

            birlerbasamagı=sayi%10;
            rakamlartoplamı=rakamlartoplamı+birlerbasamagı;
            sayi=sayi/10;
        }
        System.out.println(rakamlartoplamı);




    }
}
