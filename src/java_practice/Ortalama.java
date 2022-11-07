package java_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ortalama {
    public static void main(String[] args) {
        /*  TASK :
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         *
         * Output : 4
         */

        int[] arr={1,2,3,5,6,};

        double toplam=0;
        double ortalama=0;


        for (int i = 0; i < arr.length ; i++) {
            toplam+=arr[i];

        }
        ortalama=toplam/ arr.length;
        System.out.println("toplam : "+toplam);
        System.out.println("ortalama : "+ortalama);

        List<Integer> are=new ArrayList<>();


        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]>ortalama){
                are.add(arr[i] );


            }

        }
        System.out.println("ortalamadan büyük sayılar : "+are);





    }
}
