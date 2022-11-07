package ders09_StringManipulations;

public class C07_substring {
    public static void main(String[] args) {

        String str="Java gun gectikce guzellesiyor";

        System.out.println(str.substring(5,8));//gun
        //5. inddexten başlar (8-5) karakter yazdırır
        //5. index dahil (inclusive) , 8. index haric(exclusıve)

        System.out.println(str.substring(9,17));//gectikce

        System.out.println(str.substring(3,7));//a gu

        String isim= "EMRE";
        //verilen isimi ilk harfi büyük geriye kalanlar
        //kucuk harf olarak kaydedin

       isim= isim.substring(0,1).toUpperCase()+//ilk harfi alıp büyük harf yağptık
              isim.substring(1).toLowerCase();
        System.out.println(isim);

        System.out.println("zor sorunun cevabı :"+isim.substring(2,2));//hiçilk

        System.out.println(isim.substring(0,4));


    }
}
