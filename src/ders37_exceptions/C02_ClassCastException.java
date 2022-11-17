package ders37_exceptions;

public class C02_ClassCastException {

    public static void main(String[] args) {

        short sayi1=23;
        int sayi2=sayi1;

        short sayi3=24;
        //Integer sayi4=sayi3; Integer ve Short arasinda parent-child ilskisi olmadigindan
        //                     birbirine atama yapamazssiniz


        // aralarinda parent-child iliskisi ola class'lardan olusan objeler icin
        // auto-widening veya exclipt-narrowing mumkundur

        Object obj=sayi3;
        System.out.println("Shorttan objeye cast edince : "+obj);

        Integer sayi5=(Integer) obj;

        System.out.println("Short datayi obje uzerinden Integer'a cevirince : "+sayi5);

}
}
