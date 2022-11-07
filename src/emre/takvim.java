package emre;

import java.util.Scanner;
public class takvim {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("lütfen ay'ın ilk harfini giriniz :");

        char ilkHarf =scan.next().charAt(0);

        if (ilkHarf=='o' || ilkHarf=='O'){
            System.out.println("ocak");
        }
        if (ilkHarf=='s' || ilkHarf=='S'){
            System.out.println("subat");
        }
        if (ilkHarf=='m' || ilkHarf=='M'){
            System.out.println("mart veya mayıs");
        }
        if (ilkHarf=='n' || ilkHarf=='N'){
            System.out.println("nisan");
        }
        if (ilkHarf=='h' || ilkHarf=='H'){
            System.out.println("haziran");
        }
        if (ilkHarf=='t' || ilkHarf=='T'){
            System.out.println("temmuz");
        }
        if (ilkHarf=='a' || ilkHarf=='A'){
            System.out.println("agustos veya aralık");
        }
        if (ilkHarf=='e' || ilkHarf=='E') {
            System.out.println("eylül veya ekim");
        }
        if (ilkHarf=='k' || ilkHarf=='K'){
            System.out.println("kasım");
        }




    }
}
