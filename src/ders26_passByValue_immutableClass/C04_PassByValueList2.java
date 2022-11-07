package ders26_passByValue_immutableClass;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList2 {
    public static void main(String[] args) {

        // bir method olusturalim
        //method'da yeni bir liste olusturun
        //listeye sayilar listeesindeki degerlerin 5 fazlasını element olarak atayin
        //sonra sayilar listesine degre olarak yeni list'i atayın
        //ve sayilar list'ini yazdirin


        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        listArtir(sayilar);
        System.out.println("method Call'dan sonra main method'da sayilar list : "+sayilar);
    }

    public static void listArtir(List<Integer> sayilar){

        List<Integer> list=new ArrayList<>();

        for (int i = 0; i < sayilar.size() ; i++) {

            list.add(sayilar.get(i)+5);
        }

        sayilar=list;

        System.out.println("method'da sayilar listesinin son hali : "+ sayilar);
    }

}
