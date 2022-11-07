package ders17_Scope;


public class C01_LocalVariables {
    public static void main(String[] args) {
        //bir method'un içerisinde oluşturulan variable'ların scope'u
        //içinde oluşturuldukları method'dur
        //o method'un dışından ULAŞILAMZLAR


        int sayi=10;
        String isim="Ramazan";
        //System.out.println(dogruMu);

        for (int i = 0; i <10 ; i++) {
            String adres="Ankara";
         //bir loop içerisinde oluşturulan variable'lar sadece o loop içerisinde geçerlidirler
        }

        // System.out.println(adres);

        double pi;
        //System.out.println(pi);
        //local variable'laar değer atamadan oluşturulabilir ancak kullanılamazlar
        //kulllanmadan önce değer atanmış olmalıdır

    }

    public static void method1(){

        //System.out.println(sayi);
        //isim="tugay";

        boolean dogruMu=true;


    }
}
