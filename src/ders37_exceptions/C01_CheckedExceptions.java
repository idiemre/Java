package ders37_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_CheckedExceptions {
    public static void main(String[] args)  {


        String dosyaYolu="src/ders36_checkedException/Deneme.txt";
        int k=0;

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            while((k=fis.read())!=-1) {
                System.out.print((char)k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya yolu yanlis veya dosya arizali");
        } catch (IOException e) {
            e.printStackTrace();

            System.out.println("dosya okuma veya yazma ile ilgili bir sorun var l ");
        }

        /*
        bir kod calisirken birden fazla exception olusma ihtimali varsa
        bu kodu calisir hale getirmek icin 4 ihtimal vardir

        1- her bir exception ic ice try catch bloklari kullanmak
        2- bir tane try blogu birden fazla catch blogu olusturmak
        3- method signature'ina tum excption ihtimallerini yazmak
        4- eger muhtemel exception'larin tumunu kapsayan daha genis
           kapsamli bir exception varsa onu kullanmak
         */

        /*
        2. ve 3. ihtimallerde olusmasi muhtemel exception'lar arasinda
        parent-chil iliskisi olup olmadigi kontrol edilmelidir
        aralarida parent-child iliskisi yoksa exception'lari
        istedigimiz sirada yazabiliriz

        Ancak parent-child iliskisi varsa
        once child sonra parent yazilmalidir
        aksi takdirde parent daha kapsamli oldugundan tum excetion'lari yakalar
        ve asagidaki chıld exception
        işlevsiz kalır java bu durumu kabul etmez . CTE verir
         */
  }
}
