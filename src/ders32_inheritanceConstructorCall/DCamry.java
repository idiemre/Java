package ders32_inheritanceConstructorCall;

public class DCamry extends BToyota {


    DCamry(String pc){
        super("Deniz");
        System.out.println("String parametreli Camry Constructor");
    }

    DCamry(){

    }

    public static void main(String[] args) {

        // eger kullanilan argumente uygun bir constructor
        // parent class'ta yoksa CTE olur

        DCamry camry2=new DCamry("celal");
        //Parametreli Araba constructor
        //String parametreli toyota Constructor
        //String parametreli Camry Constructor

        System.out.println("========");

        DCamry camry1=new DCamry();
        //Parametresiz Araba constructor
        //Parametresiz Toyota constructor
    }
}
