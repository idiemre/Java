package emre;

import java.util.Scanner;

public class adf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen birinci tamsayiyi giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("Lutfen 2.tamsayiyi giriniz");
        int sayi2 = scan.nextInt();

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;







        System.out.println("sayi1'in degeri : " + sayi1);

        System.out.println("sayi2'in degeri : " + sayi2);
    }
}
