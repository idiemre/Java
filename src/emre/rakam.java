package emre;

import java.util.Scanner;

public class rakam {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("bir rakam giriniz :");
        int rakam=scan.nextInt();

        switch (rakam){
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");break;
            case 0:
                System.out.println("sıfır");

        }
    }
}
