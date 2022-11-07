package java_practice;

import java.util.Arrays;
import java.util.concurrent.LinkedTransferQueue;

public class ArrayToplama {
    public static void main(String[] args) {
        //Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
        //olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //input : int[][] arr = {{3,4,5}, {2,3,6,7}};
        //output: [5, 7, 11]

        int[][] arr = {{3,4,5}, {2,3,6,7}};

        int ortakIndexSayisi=(arr[0].length<arr[1].length?arr[0].length:arr[1].length);

        int[] ortakIndexToplamlariArr=new int[ortakIndexSayisi];

        for (int i = 0; i <ortakIndexToplamlariArr.length ; i++) {

            ortakIndexToplamlariArr[i]=arr[0][i]+arr[1][i];

        }
        System.out.println(Arrays.toString(ortakIndexToplamlariArr));
    }
}
