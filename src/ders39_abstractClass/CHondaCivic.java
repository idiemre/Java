package ders39_abstractClass;

public class CHondaCivic extends BHonda{


    @Override
    public void motor() {
        System.out.println("Honda Civic araclar vtec motorlar kullanir");
    }

    @Override
    public void kasa() {
        System.out.println("Civic araclar sedan veya hatchback kasa kullanir");
    }

    @Override
    public void tekerlek() {
        System.out.println("Civic araclar 205x16x55 tekre kullanir");
    }

    @Override
    public void yakit() {
        System.out.println("Civic araclar benzinlidir");
    }

    @Override
    public void guvenlik() {
        System.out.println("Civic araclar guvenlik standardina uyar");
    }

    @Override
    public void abs() {
        System.out.println("Honda civic arabalar standart olarak abs kullanir");
    }

    @Override
    public void klima() {
        System.out.println("Honda civic arabalar standart olarak klima kullanir");
    }

    public static void main(String[] args) {

        /*
          Abstract paren class'lardaki abstract method'lar
          concrete child class'lar tarafindan mecburen override edilir

          Ancak abstract parent'lardaki concrete method'lari
          override etmek mecburi degildir
          Eger child class'a uyarlamak isterseniz override edebilirsiniz
          veya override etmeyip parent class'ttaki haliyle kullanabilrisniz
         */

        CHondaCivic civic1=new CHondaCivic();
        civic1.abs();
        civic1.klima();
        civic1.marka();
        civic1.ozelTeknoloji();

    }
}
