package tekrar01;

import java.util.Scanner;

public class ifElseStatements2 {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        // yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz :");
        int yas=scan.nextInt();

        if (yas>=65){
            System.out.println("emekli olabilirsin");
        }else {
            System.out.println("emekli olman için "+(65-yas)+" sene daha çalışman lazım");
        }
    }
}
