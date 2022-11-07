package tekrar01;

import java.util.Scanner;

public class ifElseStatements6 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("ilk dogum tarihini yıl/ay/gun şeklinde giriniz :");
        int yıl1 = scan.nextInt();
        int ay1 = scan.nextInt();
        int gun1 = scan.nextInt();
        System.out.println("ikinci dogum tarihini yıl/ay/gun şeklinde giriniz :");
        int yıl2 = scan.nextInt();
        int ay2 = scan.nextInt();
        int gun2 = scan.nextInt();

        if (yıl1 < yıl2) {
            System.out.println("ilk dogum tarihi büyüktür");
        } else if (yıl2 < yıl1) {
            System.out.println("ikinci dogum tarihi büyüktür");
        } else {
            if (ay1 < ay2) {
                System.out.println("ilk dogum tarihi büyüktür");
            } else if (ay2 < ay1) {
                System.out.println("ikinci dogum tarihi büyüktür");
            } else {
                if (gun1 < gun2) {
                    System.out.println("ilk dogum tarihi büyüktür");
                } else if (gun2 < gun1) {
                    System.out.println("ikinci dogum tarihi büyüktür");
                }


            }
        }
    }
}
