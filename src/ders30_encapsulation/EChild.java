package ders30_encapsulation;

public class EChild extends DParent {
    private boolean isEnough;


    /*
     Java'daki Inharitance'in insanlardan en buyuk farki :
      insanlarda parent child edinebilir ama child parent'ini secemez
      Java'da ise tam tersidir
      - siz bir class olusturudugunuzda daha once olsturulmus class'lardan
        tum ozellikleri inherit etmek istedeginiz class'i PARENT EDINIRSINIZ

     Bir class bir class'i inherit etmek istedigindde
     extends keyword ile bunu deklare eder
     */

    public static void main(String[] args) {

        EChild child1=new EChild();

        child1.yas=30;
        child1.isim="Mahmut";
        child1.isEnough=false;

        
    }
}
