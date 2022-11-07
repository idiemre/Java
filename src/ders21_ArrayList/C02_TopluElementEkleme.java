package ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_TopluElementEkleme {

    public static void main(String[] args) {

        List<String> harfler=new ArrayList<>();

        //tum sesli harfleri listeyee ekleyin
        //eklenecek tüm ürünleri bir array olarak yazıp sonra for loop ile liste ekleyebiliriz

        String[] arr={"a","e","i","ı","o","ö","u","ü"};

        for (int i = 0; i <arr.length ; i++) {

            harfler.add(arr[i]);

        }
        System.out.println(harfler);//[a, e, i, ı, o, ö, u, ü]




    }
}
