package ders34_overriding_pollymorphism;

public class BChild extends Aparent{

    public void method1(){
        System.out.println("Child class method 1");
    }

    public void method2(int a){
        //overriding olabilmesi icin hem method ismi
        //hem de signature ayni olmalidir
        System.out.println("Child class method 2");
    }


    public void method2(String isim){
        System.out.println("Child class String parametreli method 2");
    }

    @Override
    public void method3() {
        //super.method3();
        //overriding varsa parent ve child class'daki
        //overidden ve overriding methoddlardan sadece biri çalışır
        //eger ikisini birden calistirmak isterseniz
        //super.overriddenMEthodIsmi yazilir

        /*
         Overriding method @Override notasyonu ile isaretlenebilir
         @Override kullanilmayan overriding isleminde,
         parent class'daki overrridden method silinirse
         hic bir sorun olmasi

         Ancak @Override kullanilan overriding isleminde
         parent class'daki overridden method silinirse
         Java CTE verir, boylece overriden methodun
         silinmesi engellenir
         */
    }



}
