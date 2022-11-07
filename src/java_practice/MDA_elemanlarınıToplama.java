package java_practice;

import java.util.Arrays;

public class MDA_elemanlarınıToplama {
    public static void main(String[] args) {

        /* TASK :
        multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}
         */


        int[][] input={{10,20,30},{4},{6,7,20}};

        int[] yeniArr=new int[input.length];




        for (int i = 0; i <input.length ; i++) {

            int toplam=0;

            for (int j = 0; j <input[i].length ; j++) {
                toplam+=input[i][j];
            }
           yeniArr[i]=toplam;
        }
        System.out.println(Arrays.toString(yeniArr));


    }
}
