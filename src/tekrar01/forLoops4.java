package tekrar01;

import java.util.Scanner;

public class forLoops4 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucuk olsa da program calissin


        Scanner scan=new Scanner(System.in);

        System.out.print("lütfen başlangıç sayısını giriniz :");
        int bas= scan.nextInt();
        System.out.print("lütfen bitiş sayısını giriniz :");
        int bitis= scan.nextInt();

        int toplam=0;

        for (int i = bas; i <=bitis ; i++) {


            toplam+=i;
        }
        System.out.println(toplam);

    }
}
