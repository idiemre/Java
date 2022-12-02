package ders40_Interfaces;

public interface I03_InterfaceChildOfInterface extends I01_Interface {

    // eger bir interfece'i baska bir interface'in child'i yapmak isterseniz
    // extends keyword kullanilir

    // bir interface concrete class'i INHERIT EDEMEZ

    void method1();
    // interfface bir child parent interface'deki
    // abstract methodu override edebilir ama
    // iksininde body'si olmadigindan
    // bu islemin bir anlami yoktur

    int method4();
    boolean method5();

}
