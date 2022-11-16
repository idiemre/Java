package ders35_exceptions;

public class C02_ArithmeticExceptions {
    public static void main(String[] args) {
        //verilen iki tamsayiyi birbirine bolup
        //sonucun tamsayi kisminni yazdirin


        int sayi1=20;
        int sayi2=10;


        try {
            //riskli oldugunu ongordugumuz kodlar
            System.out.println(sayi1/sayi2);
            System.out.println("bakalim bu satir calisacak mi ?");

        } catch (ArithmeticException e) {
            //catch (Exception e) ongordugumuz risk
            System.out.println("sayi 0'a bolunemez");
            //catch(='de sonraki { } catch blogu denir
            //beklenen risk gerceklesirse calisacak kodlar
        }

        /*
        bazi exception'lar if else ile handle edilebilir ancak
        tum exception'larr icin if else yeterli olmaz

         */
    }
}
