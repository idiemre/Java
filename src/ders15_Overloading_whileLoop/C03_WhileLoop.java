package ders15_Overloading_whileLoop;

public class C03_WhileLoop {
    public static void main(String[] args) {

        // 2 basamaklı sayıları aralarında
        // bir boşluk olacak şekilde yanyana yazdırın

        for (int i = 10; i <100 ; i++) {
            System.out.print(i+" ");

        }
        System.out.println("");
        // while loop ile yaparsak

        int a=10;
        while (a<100){

            System.out.print(a+" ");
            a++;
        }
    }
}
