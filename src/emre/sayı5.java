package emre;

import java.util.Scanner;

public class sayı5 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayı giriniz :");
        int sayi = scan.nextInt();

        System.out.println(sayi%5==0 ?"sayı 5'in tam katı":"sayı 5'in katı değil");








    }
}
