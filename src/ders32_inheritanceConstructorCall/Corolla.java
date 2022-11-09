package ders32_inheritanceConstructorCall;

public class Corolla extends BToyota{

    Corolla(int p1){
        super(5);
        System.out.println("Parametreli Corolla constructor");
    }

    Corolla(){

    }

    Corolla(String str){
        this();
        System.out.println("Parametreli String olan Corolla");
    }

    public static void main(String[] args) {

        Corolla corolla1=new Corolla("Emre");
    }
}
