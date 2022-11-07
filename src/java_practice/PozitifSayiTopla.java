package java_practice;

import java.util.Arrays;

public class PozitifSayiTopla {
    public static void main(String[] args) {
        //Soru 2- Verilen bir array’deki pozitif
        //tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz.

        int[] arr={1,2,4,5,-5,-4,6,-7};

       pozitifSayiTopla(arr);
        System.out.println(pozitifSayiTopla(arr));




    }

    public static int pozitifSayiTopla(int[] arr){
        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]>0){
                toplam+=arr[i];
            }

        }
        return toplam;
    }
}
