package ders14_methodOlusturma;

public class C02_StringConcat {
    //verilen iki stringi parametre olarak kabul edip;
    //bu iki stringi aralarında bir bosluk olan tek bir string olarak
    //main methoda döndüren bir method oluşturun


    public static void main(String[] args) {
        String s1="Java";
        String s2="Candir";


        System.out.println(birlestirMethodu(s1, s2));


    }

    public static String birlestirMethodu(String s1,String s2){
        return s1+" "+s2;



    }




























}
