package ders13_nestedForLoop_methodOlusturma;

import java.util.SortedMap;

public class C01_ForLoop {
    public static void main(String[] args) {
        //soru 9 kullanıcıdan bir string alın ve stringi ters yazdırın

        String input="java ne kadar güzel";

        //lezug

        for (int i = input.length()-1; i >=0 ; i--) {
            System.out.print(input.charAt(i));;

        }
    }
}
