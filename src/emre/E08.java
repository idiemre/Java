package emre;

import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {

        //kullanıcıdan bir cümle ve bir kelime alın
        //cümlede kelimenin durumuna göre
        //1- cumle kelimeyi içermiyor
        //2- cumle kelimeyi sadece birkere içeriyor
        //3- cümle kelimeyi birden fazla iceriyor
        //seceneklerinden uygun olanı yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz :");
        System.out.println("lütfen bir cümle giriniz :");
        String cümle=scan.nextLine();
        String kelime=scan.nextLine();

        //int ilkkelime=cümle.indexOf(kelime);
        //System.out.println(cümle.indexOf(kelime,ilkkelime+1));



        if (!cümle.contains(kelime)){
            System.out.println("cümle kelimeyi içermiyor");
        }else {
            int ilkkelime=cümle.indexOf(kelime);
            int ikincikelime=cümle.indexOf(kelime,ilkkelime+1);

            if (ikincikelime==-1){
                System.out.println("cümle kelimeyi bir defa içeriyor");
            }else {
                System.out.println("cümle kelimeyi birden fazla içeriyor");
            }

        }






















    }
}
