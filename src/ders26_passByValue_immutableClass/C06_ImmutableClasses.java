package ders26_passByValue_immutableClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class C06_ImmutableClasses {
    public static void main(String[] args) {

        String str="Java guzeldir";

        System.out.println(str.toUpperCase(Locale.ROOT));//JAVA GUZELDIR

        System.out.println(str);//Java guzeldir

        str.toLowerCase();
        System.out.println(str);

        //String imuutable oldugu icin metod ile yapilan degisiklikler String'i kalici degistirmez


        List<String> harfler= new ArrayList<>();

        harfler.add("A");
        harfler.add("B");

        harfler.remove(0);

        System.out.println(harfler);// [B]

        // List ve Array mutablee olduklari icin metod ile yapilan degisiklikler kalici olur


    }
}
