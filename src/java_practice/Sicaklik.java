package java_practice;

import java.util.Scanner;

public class Sicaklik {
    public static void main(String[] args) {
         /* Write a Java program to convert temperature from Fahrenheit to Celsius degree.
     Sorunun cevirisi : Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren
     bir Java programı yazınız.
     formula:
     c = (f-32)*5/9
       Not : 1 Fahrenheit yaklaşık -17.22 santigrat dereceye denk gelmektedir.
          100 Fahrenheit, bu formül göz önüne alındığında,
           yaklaşık 37,78 santigrat dereceye eşit olmaktadır
          */

        Scanner scan=new Scanner(System.in);


        System.out.print("Sıcakligi fahrenhayt degerinde giriniz : ");
        double sicaklik= scan.nextDouble();



        double derece=(sicaklik-32)*5/9;

        System.out.println(derece);


    }
}
