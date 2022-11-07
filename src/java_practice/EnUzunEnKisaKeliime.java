package java_practice;

public class EnUzunEnKisaKeliime {
    public static void main(String[] args) {
        //Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        //olusturun.

        String[] arr={"Ahmet","Kral Şakir","emre","Hasan","Mehmet Akif"};


        enUzunEnKisa(arr);

    }

    private static void enUzunEnKisa(String[] arr) {

        String enUzunKelime=arr[0];
        String enKisaKelime=arr[0];

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].length()>=enUzunKelime.length()){
                enUzunKelime=arr[i];
            }
            if (arr[i].length()<=enKisaKelime.length()){
                enKisaKelime=arr[i];
            }

        }

        System.out.println("en kısa kelime : "+enKisaKelime);
        System.out.println("en uzun kelime : "+enUzunKelime);



    }
}
