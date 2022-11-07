package java_practice;

import java.util.Arrays;
import java.util.Scanner;

public class C01_EnKucuk_EnBuyukSayiFarki {
    /* TASK :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.
	 */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);


        System.out.println("eleman sayısını giriniz: ");
        int[] arr=new int[scan.nextInt()];

        for (int i = 0; i <arr.length ; i++) {

            System.out.println("eleman giriniz :");
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        int fark=arr[arr.length-1]-arr[0];
        System.out.println(fark);









    }
}
