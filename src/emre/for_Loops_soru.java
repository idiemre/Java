package emre;

public class for_Loops_soru {
    public static void main(String[] args) {

        int sayi= 100;


        for (int i = 1; i<sayi ; i++) {

            if (i%7==0) System.out.print(i+" ");

        }
        System.out.println("");

        int toplam=0;

        for (int i = 1; i<=5 ; i++ ) {

            toplam=toplam+i;
        }
        System.out.println(toplam);

        int s1=6;
        int fak=1;

        for (int i = s1; i>1; i--) {

            fak=fak*i;


        }
        System.out.print(fak);
        System.out.println("");




        int asal=50;
        boolean bayrak=false;

        for (int i = 2; i <asal ; i++) {

            if (asal%i==0) {
                bayrak = true;
                break;
            }



        }
        System.out.println(bayrak);
        if (bayrak==true){
            System.out.print("asal sayı");

        }else {
            System.out.print("asal sayı değil");
        }


    }
}
