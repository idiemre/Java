package emre;

import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {

        int[]arr={2,3,5,7,-5,-3};

        System.out.println(toplamaMethodu(arr));


    }


    public static int toplamaMethodu(int[] arr){
        int toplam=0;


        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]>0){
                toplam+=arr[i];
            }
        }
     return toplam;
    }
}
