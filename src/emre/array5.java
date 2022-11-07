package emre;

import java.util.Arrays;

public class array5 {
    public static void main(String[] args) {

        int[] arr={4,5,6,7};

        arr=sagaKaydir(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] sagaKaydir(int[] arr){

        int boskova=arr[arr.length-1];

        for (int i =arr.length-2    ; i >=0 ; i--) {

            arr[i+1]=arr[i];

        }
        arr[0]=boskova;
        return arr;
    }
}
