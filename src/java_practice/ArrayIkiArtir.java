package java_practice;

import java.util.Arrays;

public class ArrayIkiArtir {
    public static void main(String[] args) {
        //Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        //olusturun. Eski array’i yeni haliyle kaydedin.

        int[] arr={1,2,3,4,5,6,7};

        ikiArtir(arr);

        System.out.println(Arrays.toString(arr));


    }


    public static int[] ikiArtir(int[] arr){

        for (int i = 0; i < arr.length ; i++) {

            arr[i]+=2;
        }
        return arr;
    }
}
