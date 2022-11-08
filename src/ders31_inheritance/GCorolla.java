package ders31_inheritance;

public class GCorolla extends FToyota {

    String model=" Corolla";
    String uretimYeri="Turkiye";

    GCorolla(){
        System.out.println("Corolla constructor calisti");
    }


    public static void main(String[] args) {

        GCorolla corolla1=new GCorolla();
        System.out.println(corolla1.model);//Toyota


        /*
        bir child class'dan obje olusturdugumuzda olusturulan obje sadece
        chil class'a ait ozellikleri degil tum parent class'lardaki ozellikleri tasir

        bir objenin bir classs'in ozelliklerini tasimasi icin
        o obje olusturulurken class'a ait constructor'in calismis olmasi gerekir
        yani child class'indaki bje olusturulurken
        tum parent class'lardaki constructor'lar da otomatik olarak calisir

        java bu islem icin soyle bir mekanizma gelistirmistir.
        bir class olusturdugumuzfa biz constructor olusturmasak'ta
        Java'nin o classs'a defaul constructor koydugu GIBI
        extends keyword kullanan bir class'da olusturulan her bir constructor'in
        ilk satirina super() constructor call yerlestirir
         */
    }
}
