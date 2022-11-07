package emre;

import java.util.Scanner;

public class WhileLoopp2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        boolean sifreDogruMu=false;
        String sifre="";
        char ilkharf;
        char sonharf;

        while (sifreDogruMu!=true){

            System.out.println("lütfen şifre giriniz");
            sifre=scan.nextLine();
            ilkharf=sifre.charAt(0);
            sonharf=sifre.charAt(sifre.length()-1);


            if (!(ilkharf>='a' && ilkharf<='z')){
                System.out.println("sifrenin ilk harfi küçük olmalı");
            }else if (!(sonharf>'0'&& sonharf<'9')){
                System.out.println("son harf rakam olmalı");
            }else{
                System.out.println("şifreniz başarı ile kaydedildi");
                sifreDogruMu=true;
            }





        }

    }
}
