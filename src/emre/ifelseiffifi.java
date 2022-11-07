package emre;

import java.util.Scanner;

public class ifelseiffifi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz :");
        int sayi = scan.nextInt();

        if (sayi<0){
            System.out.println("negatif sayı");
        }else if (sayi<10){
            System.out.println("rakam");
        }else if (sayi<100){
            System.out.println("iki basamaklı sayı");
        }else{
            System.out.println("büyük sayı" +
                    "");
        }
    }
}
