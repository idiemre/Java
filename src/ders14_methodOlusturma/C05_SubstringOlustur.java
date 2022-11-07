package ders14_methodOlusturma;

public class C05_SubstringOlustur {
    /*Soru 1- Kullanicidan input olarak verilen bir String,
     baslangic ve bitis indexlerine gore baslangic index’i dahil,
     bitis index’i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun.
     kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse,
     hata mesaji verin kullanici str’da olan index’lerden daha buyuk bir index girerse hata mesaji yazdirin.
     */

    public static void main(String[] args) {
        String input="Java ne kadar guzel";
        int basIndexi=5;
        int bitisIndexi=7;

        kendiSubstringMethodu("java",1,3);
        kendiSubstringMethodu("deneme",6,3);
        kendiSubstringMethodu("Java",6,8);


    }


    public static void kendiSubstringMethodu(String input, int basIndexi, int bitisIndexi){

        if (basIndexi>bitisIndexi){
            System.out.println("baslangıç indexi bitis indexinden büyük olamaz");
        } else if (bitisIndexi>=input.length()){
            System.out.println("bitis indexi string'in sinirları disinda");
        }
        else{
            for (int i = basIndexi; i <bitisIndexi ; i++) {
                System.out.print(input.charAt(i));

            }
            System.out.println("");
        }
    }




}
