package emre;

public class array3 {
    public static void main(String[] args) {

        int[] arr = {2,3,5,6,5,5,5,4,3,3,5,6,7,8,7,6,5,4,4,0};

        int arananEleman = 2;
        elemanAramaMethodu(arr,5);



    }



   public static void  elemanAramaMethodu(int[] arr, int arananEleman) {
        int sayac = 0;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == arananEleman) {
                sayac++;
            }


        }
        if (sayac == 0) {
            System.out.println("aranan eleman array'de yok");
        } else {
            System.out.println("Aranan " + arananEleman + " sayisi, array'de " + sayac + " kere kullanilmis");
        }


    }
}

