package ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_TamBolenlerListesi {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen
        //tum pozitif tamsayilari bir liste olarak bize donduren bir method olusturun
        
        int tamSayi=28;

        System.out.println(tamBolenler(tamSayi));

    }
    
    public static List<Integer> tamBolenler(int sayi){

        List<Integer> toplam=new ArrayList<>();

        for (int i = 1; i <=sayi ; i++) {

            if (sayi%i==0){
                toplam.add(i);
            }


            
        }
        return toplam;
    }

}
