package java_practice;

public class ElemanArama {
    public static void main(String[] args) {
        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //kullanildigini yazdiran bir method olusturun.

        int[] arr={1,3,4,5,6,7,4,3,4,2,4,5,6,7,6,5,6,4,3,3,9};

        int arananEleman=0;

        elemanArama(arr,arananEleman);



    }

    public static void elemanArama(int[] arr , int arananEleman){

        int sayac=0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]==arananEleman){
                sayac++;
            }
        }

        if (sayac==0){
            System.out.println("aranan eleman array'de yok");
        }else {
            System.out.println("aranan "+arananEleman  +" sayisi array'de "+sayac+" tane var");
        }
    }
}
