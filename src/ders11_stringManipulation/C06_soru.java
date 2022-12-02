package ders11_stringManipulation;

public class C06_soru {
    public static void main(String[] args) {
        // Soru 1 : Kullanicidan bir cumle alin
        // - cumlede ev geciyorsa, "home home sweet home" yazdirin
        // - cumlede is geciyorsa, "calismak guzeldir"
        // - ikisini de iceriyorsa "Hem ev lazim hem is"
        // - hicbirini icermiyorsa "cok calisman lazim" yazdirin

        String cumle="ten çıktım  geldim";


        if (cumle.contains("ev") && cumle.contains("iş")){
            System.out.println("hem ev lazım hem iş");
        }else if (cumle.contains("ev")){
            System.out.println("home home sweet home");
        }else if (cumle.contains("iş")){
            System.out.println("calışmak güzeldir");
        }else{
            System.out.println("cok calışman lazım");
        }









    }
}
