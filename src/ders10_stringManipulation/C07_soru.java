package ders10_stringManipulation;

import java.util.Scanner;

public class C07_soru {
    public static void main(String[] args) {
        //kullanıcıdan bir cümle ve bir metinb alın
        //cümlede metnin durumuna göre
        //1- cumle metni içermiyor
        //2- cumle metni sadece birkere içeriyor
        //3- cümle metni birden fazla iceriyor
        //seceneklerinden uygun olanı yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("cümle giriniz : ");
        String cümle=scan.nextLine();

        System.out.println("metin giriniz : ");
        String metin=scan.nextLine();

        if (!cümle.contains(metin)){
            System.out.println("cumle metni içermiyor");
        }else{
            int ilkindex=cümle.indexOf(metin);

            int ikinciindex=cümle.indexOf(metin,ilkindex+1);//ya -1 olacak yada bir index olacak

            if (ikinciindex==(-1)){
                System.out.println("cumle metni bir kere içeriyor");
            }else{
                System.out.println("cumle metni birden fazla içeriyor");
            }


        }






    }
}
