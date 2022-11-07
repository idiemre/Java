package emre;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        //verilen bir arrayin tüm elemanlarını 2 artırıp bize döndüren bir method
        //oluşturun eski arrayi yeni haliyle kaydedin


        int[] arr={2,4,6};

        artırMethodu(arr);



        System.out.println(Arrays.toString(arr));


    }
    public static int[] artırMethodu(int [] arr1){

        for (int i = 0; i < arr1.length ; i++) {

            arr1[i]=arr1[i]+2;


        }



        return arr1;

    }
}
