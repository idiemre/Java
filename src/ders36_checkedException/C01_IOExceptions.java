package ders36_checkedException;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C01_IOExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis=new FileInputStream("src/ders36_checkedException/Deneme.txt");

        FileOutputStream fos= new FileOutputStream("src/ders36_checkedException/Deneme.txt");

        //Java ile bilgisayaramizdaki bbir dosyaya ulasmak istersek
        //FileInputStream class'indan obje olusturup
        //o obje araciligiyla dosyayi kullanabiliriz

        //FileInputStream olustururken ulasmak istedigimiz dosyanin dosya yolunu
        //parametre olarak girmeliyiz

        /*
         check exception olusturma ihtimali olan kodlari yazdigimizda
         java compile time orada bir hata ihtimali ooldugunu görür
         ve kodun altını kırmızı olarak çizer


         bu durumda kirmii cizgiyi kaldirmak icin iki yontem vardir
         1- exception'i try catch blogu ile handle etmek
         2- java'ya sorun ihtimalinin farkinda oldugumuzu ama kodumuza guvendigimizi
            ve calismaya devam etmesni istedigimizi soylemek
            bunun icin method signature'ina method deklarasyonu ile
            curly braces arasina throws keyword ve beklenen exception turu yazilabilir
         */
    }
}
