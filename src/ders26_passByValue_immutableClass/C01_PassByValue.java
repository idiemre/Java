package ders26_passByValue_immutableClass;

public class C01_PassByValue {
    public static void main(String[] args) {

        double fiyat=300;

        System.out.println(indirimUygula(fiyat));
        System.out.println(indirimUygula(fiyat));
        System.out.println(indirimUygula(fiyat));

        System.out.println(fiyat);

        fiyat=indirimUygula(fiyat);

        System.out.println("indirim uygulanmis yeni fiyat : "+fiyat);


    }
    /*
    kodlarimizin anlasilir olmasi icin main method'dan diger methodlara
    parametre olarak gonderdigimiz variable'lar icin ayni isimli variable
    olusturmayi tercih ederiz

    Java method'lar arasinda gecis yaparken variable'i degil
    variable'nin value'sunu pass eder

    Bu Java'nin Pass By Value'yi tercih etmesinden kaynaklaniyor

    Eger method'un icerisinde yaptiginiz degisikligin
    main method icin de gecerli olmasini isterseniz
    main method icerisinde
    fiyat=method

    atamasini yapabiliriz
     */

    public static double indirimUygula(double fiyat) {
        //%10 indirim yapsin

        fiyat=fiyat*0.9;

        return fiyat;
    }
}
