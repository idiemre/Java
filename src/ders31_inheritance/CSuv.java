package ders31_inheritance;

public class CSuv extends BinekArac{

    public static void main(String[] args) {


        CSuv suv1=new CSuv();
        System.out.println(suv1.marka);//Binek araclarin markasi vardir
        System.out.println(suv1.model);//binek araclarin modeli olur
        System.out.println(suv1.motor);//Tum araclar motor kullanir
        System.out.println(suv1.plaka);//Tum araclarin plakasi olur
        System.out.println(suv1.yakit);//Araclar farkli yakitlar kullanir
        System.out.println(suv1.yil);//1900
        suv1.hiz("benzin");//Binek araclarin hizi modele gore degisir
        suv1.teker();//Binek araclarin 4 tekeri olur


        CSuv suv2=new CSuv();
        suv2.marka="BMW";
        suv2.model="X6";
        suv2.motor="3.0";
        suv2.plaka="31 EMR 31";
        suv2.yakit="Benzin";
        suv2.yil=2022;
        suv2.hiz(suv2.yakit);



    }

    public void hiz(String yakit){
        if (yakit.equalsIgnoreCase("benzin")){
            System.out.println("maximum hiz 300");
        }else if (yakit.equalsIgnoreCase("dizel")){
            System.out.println("maximum hiz 260");
        }else if (yakit.equalsIgnoreCase("hybrid")){
            System.out.println("maximum hiz 220");
        }else {
            System.out.println("yakit belli değil son hiz söyleyemem");
        }
    }
}
