package ders17_Scope;

public class C02_ClassLevelVariables {

    //class level variable'lar methodların dışında oluşturulur
    //genel kullanım en ustte oluşturulmalarıdır
    static String hastaneIsmi="Yıldız hastanesi";
    static int hastaSayisi=23453;
    static String bashekimIsmi;
    String persIsmi="Isim girilmedi";
    String persTelefonu="Telefon girilmedi";
    int persYasi;





    public static void main(String[] args) {
        System.out.println(hastaneIsmi);//Yıldız hastanesi
        System.out.println(bashekimIsmi);//null
        //System.out.println(persIsmi);//static olmadıgı içi statik main method'tan kullanılamaz
        /*
        Class level variable'lara deger atamsı yapılmamış olursa
        Java bu variable'lara data türüne göre
        defaul olarak tanımlanan degerleri atar
        default degerler
        sayısal variable'lar : 0
        boolean : false
        char : ''
        objeler (Strin dahil) : null

         */


    }




    public static void method1(){
        System.out.println(hastaSayisi);
        hastaSayisi++;
        // System.out.println(persIsmi);
    }

    public void method2(){
        System.out.println(hastaneIsmi);//Yıldız hastanesi
        hastaSayisi++;
        System.out.println(persIsmi);// Isim girilmedi
        System.out.println(persYasi);//0
    }
}
