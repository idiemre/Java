package ders37_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {


        String dosyaYolu="src/ders36_checkedException/Deneme.txt";

        FileInputStream fis=new FileInputStream(dosyaYolu);
    }
}
