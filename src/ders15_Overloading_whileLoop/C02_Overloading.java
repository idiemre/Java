package ders15_Overloading_whileLoop;

public class C02_Overloading {
    public static void main(String[] args) {

        carpim(3,5);// method call sırasında method parantezine yazılanlara argument denir
        carpim(3.4,2);//



    }
    //bir classta ayni isim ve aynı signature sahip iki method olmaz
    /*
    method overloading olan classlarda javahangi methodun calışacagına
    su sekilde karar verir

    1-önce method ismine bakar
    2-argument sayısı ile parametre sayısına bakar
    3-argumentt ve parametre uyumuna bakar
    4-minimum casting
     */





     public static void carpim(int sayi1,int sayi2){

        System.out.println("iki integer sayinin carpimi: "+sayi1*sayi2);

    }
    public static void carpim(int sayi3,int sayi4,int sayi5){

        System.out.println("üç integer sayinin carpimi: "+sayi3*sayi4*sayi5);

    }
    public static void carpim(double sayi1,int sayi2){

        System.out.println("double-integer sayinin carpimi: "+sayi1*sayi2);

    }
    public static void carpim(int sayi1,double sayi2){

        System.out.println("integer-double sayinin carpimi: "+sayi1*sayi2);

    }
    public static void carpim(double sayi1,double sayi2){

        System.out.println("iki double sayinin carpimi: "+sayi1*sayi2);

    }
}






