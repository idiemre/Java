package java_practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        /*
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *            ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *            ortalama kazançtan aşağıysa o günleri return yap.
         *
         * */

        Scanner scan=new Scanner(System.in);

        String[] arr={"Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartesi","Pazar"};

        List<String> gunler=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            gunler.add(arr[i]);
        }


        List<Double> gunlukKazanclar=new ArrayList<>();

        int sayac=0;

        while (sayac!=7){

            System.out.println(gunler.get(sayac)+" gun'unun kazancı : ");
            gunlukKazanclar.add(scan.nextDouble());
            sayac++;
        }

        System.out.println("Ortalama kazanc : "+ortalamakazanc(gunlukKazanclar));

        System.out.println("Ortalama kazancın üstündeki günler : "+ortalamaninUStekiKazancGunleri(gunlukKazanclar, gunler));

        System.out.println("Ortalama kazancın altındaki günler : "+ortalamninAltindakiKazancGunleri(gunlukKazanclar, gunler));


    }

    private static String ortalamninAltindakiKazancGunleri(List<Double>gunlukKazanclar,List<String> gunler) {

      String ortalamaninAltindakiKazancGunleri="";

        for (int i = 0; i <gunlukKazanclar.size() ; i++) {
            if (gunlukKazanclar.get(i)<ortalamakazanc(gunlukKazanclar)){
                ortalamaninAltindakiKazancGunleri+=gunler.get(i)+" ";
            }

        }
        return ortalamaninAltindakiKazancGunleri;
    }

    private static String ortalamaninUStekiKazancGunleri(List<Double> gunlukKazanclar, List<String> gunler) {

        String ortalamaninUstundekiKazancGunleri="";

        for (int i = 0; i <gunlukKazanclar.size() ; i++) {

            if (gunlukKazanclar.get(i)>ortalamakazanc(gunlukKazanclar)){
                ortalamaninUstundekiKazancGunleri+=gunler.get(i)+" ";
            }

        }
        return ortalamaninUstundekiKazancGunleri;

    }

    private static Double ortalamakazanc(List<Double> gunlukKazanclar) {

       double toplam=0;

        for (int i = 0; i <gunlukKazanclar.size() ; i++) {

            toplam+= gunlukKazanclar.get(i);
        }

        return toplam/7;
        }

    }

