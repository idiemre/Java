package tekrar01;

import java.util.Scanner;

public class DataCasting2 {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir harf alin
        // ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir harf giriniz : ");
        char harf=scan.next().charAt(0);


        System.out.println(""+(char)(harf+1)+(char)(harf+2)+(char)(harf+3));
    }
}
