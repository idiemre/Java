package tekrar01;

public class forLoops11 {
    public static void main(String[] args) {
        //Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
        //kontrol edin ve sonucu yazdirin.


        int sayi=32;
        int sayac=0;


        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                sayac++;
            }


        }
        if (sayac==0){
            System.out.println("asal sayi");
        }else {
            System.out.println("asal sayi degil");
        }









    }
}
