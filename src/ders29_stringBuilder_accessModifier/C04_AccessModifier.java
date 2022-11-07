package ders29_stringBuilder_accessModifier;

public class C04_AccessModifier {


    String isim = "Ali";// Access modifier gorunmuyor, zaan defaul access modifier gecerlidir
    // bu class'dan ve ders29 package' icerisindeki diger class'dan kullanilabilir

    // default int sayi = 10; default accesss modifier yazilmaz, YAZİLAMAZ
    //

        private static int sayi=10;

    public static void main(String[] args) {

        System.out.println(sayi);//10
        sayi=20;

        System.out.println(sayi);//20

    }

}
