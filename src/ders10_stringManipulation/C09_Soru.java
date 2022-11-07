package ders10_stringManipulation;

import java.math.BigInteger;

public class C09_Soru {
    public static void main(String[] args) {

        //kullanıcıdan bir cümle ve bir metinb alın
        //cümlede metnin durumuna göre
        //1- cumle metni içermiyor
        //2- cumle metni sadece birkere içeriyor
        //3- cümle metni birden fazla iceriyor
        //seceneklerinden uygun olanı yazdırın

        String cumle="Javav cok guzeldir cok.";
        String metin="cok";

        int ilkIndex=cumle.indexOf(metin);
        int sonIndex=cumle.lastIndexOf(metin);

        if (ilkIndex==(-1)){
            System.out.println("cumle metni içermiyor");
        }else if (ilkIndex==sonIndex){
            System.out.println("cumle metni sadece bir kere içeriyor");
        }else{
            System.out.println("cumle metni birden fazla içeriyor");
        }



    }
}
