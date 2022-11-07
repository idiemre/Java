package tekrar01;

public class forLoops7 {
    public static void main(String[] args) {
        //Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.


        int sayi=1453;

        String sayistr=sayi+"";

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        for (int i = 0; i <=sayistr.length() ; i++) {

            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi=sayi/10;


        }
        System.out.println(rakamlarToplami);
    }
}
