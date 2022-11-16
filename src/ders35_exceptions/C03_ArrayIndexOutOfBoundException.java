package ders35_exceptions;

import java.util.Scanner;

public class C03_ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        //kullanicidan bir index isteyin
        //verilen bir array'den kullanicinin girdigi index'deki element yazdirin

        int[] arr={2,3,4,5,6,6,5,2,2,1,5,7,8,9,8,7};


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir index giriniz : ");
        int index=scan.nextInt();

        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());//Index 20 out of bounds for length 16
            e.printStackTrace();
        }
    }
}
