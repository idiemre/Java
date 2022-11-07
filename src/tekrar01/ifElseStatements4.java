package tekrar01;

import java.util.Scanner;

public class ifElseStatements4 {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char krk=scan.next().charAt(0);

        if (krk>='a'&& krk<='z'){
            System.out.println((char)(krk-32));
        }else {
            System.out.println(krk);
        }




    }
}
