package emre;

import java.util.Scanner;

public class kova {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("sayi1 : ");
        int sayi1= scan.nextInt();
        System.out.println("sayi2 : ");
        int sayi2= scan.nextInt();

        int temp;

        temp=sayi2;
        sayi2=sayi1;
        sayi1=temp;
        System.out.println("sayi1 in yeni degerei : "+sayi1+"\nsayi2 nin yeni degeri :"+sayi2);





        System.out.println("sayi1 : "+sayi1);
        System.out.println("sayi2 : "+sayi2);

    }
}
