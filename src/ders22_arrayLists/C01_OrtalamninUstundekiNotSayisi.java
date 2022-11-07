package ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_OrtalamninUstundekiNotSayisi {
    public static void main(String[] args) {
        //ogretmenden ogrenci notlarini alip bir list olusturun
        //ogretmen q'ya basip bitirdiginde
        //sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not not
        //aldigini yazdirin

        List<Double> notlar=listeOlustur();

        System.out.println(notlar);

        raporla(notlar);

    }

    private static void raporla(List<Double> notlar) {


        int ogrenciSayisi=notlar.size();
        double notlarToplami=0.0;
        double sinifNotOrtalamasi=0.0;
        int ortalamaUstundekiOgrenciSayisi=0;

        //notlar toplamini bulalim

        for (int i = 0; i <notlar.size() ; i++) {

            notlarToplami+=notlar.get(i);

        }

        //not ortalamsini bulalım

        sinifNotOrtalamasi=notlarToplami/ogrenciSayisi;

        //ortalama ustundeki ogrenci sayisini bulalim

        for (int i = 0; i <notlar.size() ; i++) {

            if (notlar.get(i)>sinifNotOrtalamasi){
                ortalamaUstundekiOgrenciSayisi++;
            }

        }

        //rapor icin istenenleri yazdiralim
        System.out.println("girilen not sayisi : "+ ogrenciSayisi
        +"\nGirilen notlarin ortalamasi : "+sinifNotOrtalamasi+
                "\nortalama uzerinde not alan ögrenci sayisi: "+ortalamaUstundekiOgrenciSayisi);
    }


    public static List<Double> listeOlustur(){


        List<Double> notlar=new ArrayList<>();

        Scanner scan=new Scanner(System.in);
        Double girilenNot=5.0;

        while (girilenNot<=100){

            System.out.println("Lutfen listeye eklemek için not giriniz"+
                                 "\nbitirmek için 100'den bir sayı yazın");
            girilenNot=scan.nextDouble();

            if (girilenNot<100){
                notlar.add(girilenNot);
            }
        }
        return notlar;

    }
}
