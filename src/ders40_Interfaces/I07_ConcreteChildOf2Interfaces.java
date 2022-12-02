package ders40_Interfaces;

public class I07_ConcreteChildOf2Interfaces implements I05_Interface, I06_Interface {


    /*
      1- bir class sadece bir class'a extends edilebilir
         ancak 1'den fazla interface'a implements edilebilir
      2- Concrete child class implement ettigi
         tum interface'lerdeki abstract method'lari overried etmek zorunda oldugundan
         iki interface'deki tum methodlari override etmek gerekir
         -iki interface'de ayni isimde ve ayni return type'a sahip method'lardan
          hangisini override ettigi onemli degildir
         -ancak isimler ayni return typle'lar farkli oldugunda
          iki interface'i birden implement etmemiz mumkun olmayacaktir
         bu durumda
           *) ya chil class'dan bu iki interface'i implements etmekten vazgecmelisiniz
           *) veya sisteme mudahale imkaniniz varsa bu conlict'i cozmelisiniz
      3- child class'dan parent ınterface'lerdeki variable'lari kullanmak istersek
         - ayni isimde iki interface'de de variable varsa

     */


    @Override
    public void method1() {

    }

    @Override
    public String method2() {
        return null;
    }

    @Override
    public int method4() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    public static void main(String[] args) {

        System.out.println(I06_Interface.mesaj);
        System.out.println(I05_Interface.sayi);
        System.out.println(sayi2);
    }

}