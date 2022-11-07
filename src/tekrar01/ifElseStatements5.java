package tekrar01;

import java.util.Scanner;

public class ifElseStatements5 {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen cinsiyenizi giriniz :" +
                "\nlütfen yaşınızı giriniz :");
        char cinsiyet=scan.next().charAt(0);
        int yas=scan.nextInt();

        if (cinsiyet=='E' && yas>=65){
            System.out.println("emekli olabilirsin");
        }else if (cinsiyet=='E' && yas<65){
            System.out.println("emekli olabilmek için "+ (65-yas)+" sene daha çalışmalısın");
        }else if (cinsiyet=='K'&& yas>=60){
            System.out.println("emekli olabilirsin");
        }else if (cinsiyet=='K' && yas<60){
            System.out.println("emekli olabilmek için "+(60-yas)+" sene daha çalışmalısın");
        }else {
            System.out.println("geçersiz giriş");
        }




    }
}
