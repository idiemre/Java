package ders08_ternary_switch;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {

        //J : Java
        //D : Development
        //K : Kit
        //kullanıcıdan bir harf alın
        //alinan harf J,D,K'dan biri ise yukarıdaki kelimeleri yazdrın
        //bu harflerden biri değilse "gecersiz Kod" yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz :");
        char harf = scan.next().charAt(0);

        switch (harf){
            case 'J' :
            case 'j' :
                System.out.println("Java");
                break;
            case 'D' :
            case 'd' :
                System.out.println("Development");
                break;
            case 'K' :
            case 'k' :
                System.out.println("Kit");
                break;
            default:
                System.out.println("geçersiz harf");

        }



    }
}
