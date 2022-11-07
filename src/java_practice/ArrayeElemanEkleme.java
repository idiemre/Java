package java_practice;

import java.util.Arrays;

public class ArrayeElemanEkleme {
    public static void main(String[] args) {
        //Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        //eski array’e yeni degeri atayin.

        int[] arr={2,4,3,2,1,4,6,5};
        int eklenecekEleman=2;

        arr=arrayeElemanEkle(arr,eklenecekEleman);

        System.out.println(Arrays.toString(arr));


    }

    private static int[] arrayeElemanEkle(int[] ekleneceArr, int eklenecekEleman) {

        int[] yeniArr=new int[ekleneceArr.length+1];

        for (int i = 0; i <ekleneceArr.length ; i++) {

            yeniArr[i]=ekleneceArr[i];
        }
        yeniArr[yeniArr.length-1]=eklenecekEleman;

        return yeniArr;
    }
}
