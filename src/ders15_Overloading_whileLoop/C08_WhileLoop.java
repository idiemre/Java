package ders15_Overloading_whileLoop;

public class C08_WhileLoop {
    public static void main(String[] args) {
        //Soru 2- While loop kullanarak
        //kullanicidan alinan sayinin rakamlar toplamini bulun.

        int sayi=1453;

        int birlerBasamagÄ±=0;
        int rakamlarToplami=0;

        while (sayi!=0){

            birlerBasamagÄ±=sayi%10;
            rakamlarToplami+=birlerBasamagÄ±;
            sayi/=10;

        }
        System.out.println(rakamlarToplami);

    }
}
