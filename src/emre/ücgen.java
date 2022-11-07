package emre;

import java.util.Scanner;

public class ücgen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen kenar uzunluklarını giriniz :");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();


        System.out.println(kenar1==kenar2 && kenar2==kenar3 ? "eşkenar üçgen" : "eşkenar üçgen değil");




    }
}
