package ders08_ternary_switch;

public class C05_NestedTernary {
    public static void main(String[] args) {





        int sayi = -350;

        if (sayi>0){
            System.out.println(sayi%2==0 ? "cift sayı" : "cift sayı değil");

        }else {
            System.out.println(sayi<-99 && sayi>-1000 ? "uc basamaklı" : "üc basamaklı değil");
        }

    }

}
