package emre;

import javax.swing.*;
import java.util.Scanner;

public class eskenarucgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("üçgenin kenar uzunluklarını giriniz : ");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();

        if (kenar1 == kenar2 && kenar3 == kenar2) {
            System.out.println("eskenar üçgen");
        } else {
            System.out.println("eskenar ücgen değil");
        }
    }
}