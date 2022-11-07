package tekrar01;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class ifElseStatements3 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char krk=scan.next().charAt(0);

        if (krk>='a' && krk<='z'){
            System.out.println("büyük harf değil");
        }else {
            System.out.println("büyük harf");
        }



    }
}
