package tekrar01;

import java.util.Scanner;

public class forLoops3 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan=new Scanner(System.in);

        System.out.print("lütfen başlangıç sayısını giriniz :");
        int bas= scan.nextInt();
        System.out.print("lütfen bitiş sayısını giriniz :");
        int bitis= scan.nextInt();

        if (bas>bitis){
            System.out.println("bitiş degeri baslangıc degerinden küçük olamaz");
        }else {
            int toplam=0;

            for (int i = bas; i <=bitis ; i++) {


                toplam+=i;
            }
            System.out.println(toplam);

        }
        }




}
