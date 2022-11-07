package emre;

import java.util.Scanner;

public class gün {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("gün numarası giriniz :");
        int günNo=scan.nextInt();


        switch (günNo){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("hafta içi");
                break;
            case 6:
            case 7:
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("geçersiz gün numarası");








        }
    }
}
