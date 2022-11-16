package ders34_overriding_pollymorphism;

public class DChild extends CParent {

    // Overridinng kurallari
    // 1- access modifier method signature'a dahil olmadigindan
    //    overridden ve overriding access modifier'lar farkli olabilir
    //    child parent'i sinirlandirmaz
    //    yani overriding method'un access modifier'i
    //    ayni veya daha genis kapsamli olmalidir
    //    private -- default -- protected -- public

    public void method1(){

    }

    // 2- private ve static method'lar override edilemez
    // ayni isimde method olusturulunca java CTE vermez
    // ancak override isareti cikmaz ve
    // @overrride notasyonu kullanilmak istenirse CTE olur
    // Yani Java bunlari farkli class'lardaki farkl method'lar olarak kabul eder

    public static void method2(){

    }

    private void method3(){

    }

    // 3- return type'lari method signature'ina dahil olmadigindan
    //    farkli secilebilir ancak
    //    return type void veya primitive ise ayni olmak zorundadir
    //    eger return type'lar non-primitive ise child class'taki
    //    return type parent class'taki return type'in
    //    child'i olmalidir



    public void method4(){

    }

    public Integer method5(){

        return 5 ;
    }

}
