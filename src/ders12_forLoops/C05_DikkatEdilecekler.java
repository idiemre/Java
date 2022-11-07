package ders12_forLoops;

public class C05_DikkatEdilecekler {
    public static void main(String[] args) {

        /*sonsuz loop
         for (int i = 0; i <-10 ; i++) {
            System.out.print(i+" ");
        }

         */

        //ilk deger için bitiş şartı true olmuyorsa
        //for body'si hiç devreye girmez
        for (int i = 0; i>10 ; i++) {

            System.out.println(i);
        }


        //bir loopu sonunu beklemeden bitirmek istersek

        //kullanıcının verdiği bir sayının asal sayı olup olmadığını bulun

        int sayi= 53;
        boolean bayrak=false;

        for (int i = 2; i <=sayi-1 ; i++) {

            if (sayi % i==0){
                //askimiz bitecek
              bayrak=true;
              break;
            }
        }


        System.out.println(bayrak);


        if (bayrak==true){
            System.out.println("asal sayı");
        }else {
            System.out.println("asal sayı değil");
        }
    }
}
