package java_practice;

public class ArrraydeElemanArama2 {
    public static void main(String[] args) {
        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //kullanildigini yazdiran bir method olusturun.

        int[] arr={1,2,3,4,5,6,7,8,9,3};

        elemanAra(arr,3);



    }

    private static void elemanAra(int[] arr, int arananEleman) {

        int sayac=0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==arananEleman){
                sayac++;
            }
        }
        if (sayac!=0){
            System.out.println("aranan eleman arrayde "+ sayac + " tane var");
        }else{
            System.out.println("aranan eleman array'de yok");
        }

    }
}
