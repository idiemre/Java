package ders13_nestedForLoop_methodOlusturma;

public class C06_NestedForLoopUcgen {
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print(i*j +" ");

            }


            System.out.println("kral şakir");
            System.out.println("");

        }
    }
}
