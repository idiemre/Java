package java_practice;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("a, b, c sayılarını giriniz :");
        double a= scan.nextDouble();
        double b= scan.nextDouble();
        double c= scan.nextDouble();


        System.out.println("sonuç : "+((a*a)-(b*b))/(3*c));
    }
}
