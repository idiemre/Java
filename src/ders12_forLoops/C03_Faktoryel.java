package ders12_forLoops;

public class C03_Faktoryel {
    public static void main(String[] args) {

        // kullanıcının verdiği sayının faktoriyelini bulalım

        //5! = 5*4*3*2*1 = 120


        int sayi= 5;

        int faktoriyel= 1;

        for (int i = sayi; i >=1 ; i--) {

            faktoriyel=faktoriyel*i;
        }
        System.out.println(faktoriyel);


        // 1'den 100'e kalan olan sayıları toplayın

        int toplam = 0;

        for (int i = 1; i <=100 ; i++) {

            toplam=toplam+i;
        }
        System.out.println(toplam);











    }
}
