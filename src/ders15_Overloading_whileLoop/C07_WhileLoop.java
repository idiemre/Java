package ders15_Overloading_whileLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
         While loop kullanarak verilen
        sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.
         */
        int sayi=5;
        int us=-1;

        usHesaplaMethodu(sayi,us);








    }


    public static void usHesaplaMethodu(int sayi, int us){

        int sonuc=1;

        while (us>0){
            sonuc*=sayi;

            us--;
        }
        System.out.println(sonuc);
    }
}
