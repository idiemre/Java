package ders11_stringManipulation;

public class C07_soru {
    public static void main(String[] args) {
       /* Kullanicidan isim ve soyismini ayri ayri alin.
          - ismi daha uzun isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin
        */

        String isim="Emre";
        String soyisim="cantürk";



        if (isim.length() > soyisim.length()){
            System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" "+
                               soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase());
        }else{
            System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+
                               " "+soyisim.substring(0).toUpperCase());
        }






















    }
}
