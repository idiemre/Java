package ders22_arrayLists;

import java.util.Arrays;
import java.util.List;

public class C03_ArraysAslist {
    public static void main(String[] args) {

        Integer[] arr={1,2,3};

        //verilen bir array'i list'e cevirmek icin bir list olusturup
        //for loop ile elementleri tasimayi tavsiye ediyoruz

        List<Integer> arraydenList= Arrays.asList(arr);

        System.out.println(arraydenList);//[1, 2, 3]

        //bu yöntemin iki negatif yönü vardır
        //1- bu sekilde olusturulan listler esnek uzunluga sahip degillerdir
        // add, remove gibi özellikleri kulllanmak isterseniz runTimeError olusur


        //arraydenList.add(10);//UnsupportedOperationException
        //arraydenList.remove(1);//UnsupportedOperationException

        //2- bu yöntem kaynak olan array ile yeni olusturulan Listi birbirine baglar
        //  birinde yaptiginiz degisikligi otomatik olarak digerine yansitir

        System.out.println("Array : "+Arrays.toString(arr));//[1, 2, 3]
        System.out.println("Lİste : "+arraydenList);//[1, 2, 3]

        //sadece array'in bir elemanını degistirelim
        arr[0]=10;

        System.out.println("Array'i degistirince array : "+Arrays.toString(arr));//[10, 2, 3]
        System.out.println("Array'i degistirince Lİste : "+arraydenList);//[10, 2, 3]



    }
}
