package ders17_Scope;

public class C04_objectVariables {

    public static void main(String[] args) {
       // C03 deki hastane ismini yazdırmak istesek
        System.out.println(C03_ObjectVariables.hastaneIsmi);// yıldız hastanesi

        System.out.println(C03_ObjectVariables.hastaSayisi);//23453

        C03_ObjectVariables.hastaSayisi++;
        C03_ObjectVariables.hastaSayisi++;
        method1();
        System.out.println(C03_ObjectVariables.hastaSayisi);

    }

    public static void method1(){

        C03_ObjectVariables.hastaSayisi++;
    }//kod takibi main method'tan başlar
     // main methodun sonuna gelindiğinde hersey biter
     //tum degisimler resetlenir
     // variable degerleri bastaki hallerine döner




    /*
    Java runtıme programdır
    çalışmaya basladıgında variable'lara atanan degerleri işler
    calıştıgı müddetce yapılan degisiklikleri kaydeder
    ama calısması bittiginde degisen degerler resetlenir
     */
}
