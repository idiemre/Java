package java_practice;

import java.util.Arrays;
import java.util.concurrent.LinkedTransferQueue;

public class ArrayeElemanEkleme2 {
    public static void main(String[] args) {
        //Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        //eski array’e yeni degeri atayin.


        int[] arr={3,4,5};
        int eklenecekEleman=7;

        System.out.println(Arrays.toString(elemanEkleMethodu(arr, eklenecekEleman)));
    }

    private static int[] elemanEkleMethodu(int[] arr,int eklenecekEleman) {

        int[] newArr=new int[arr.length+1];

        for (int i = 0; i < arr.length ; i++) {

            newArr[i]=arr[i];

        }
        newArr[newArr.length-1]=eklenecekEleman;


        return newArr;




    }
}
