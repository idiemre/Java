package ders31_inheritance;

public class BinekArac extends Arac {
    protected String marka = "Binek araclarin markasi vardir";
    protected String model = "binek araclarin modeli olur";
    protected int yil = 1900;



    protected void teker() {


    }
    public void hiz (String yakit){
        if (yakit.equalsIgnoreCase("benzin")) {
            System.out.println("maximum hiz 300");
        } else if (yakit.equalsIgnoreCase("dizel")) {
            System.out.println("maximum hiz 260");
        } else if (yakit.equalsIgnoreCase("hybrid")) {
            System.out.println("maximum hiz 220");
        } else {
            System.out.println("yakit belli değil son hiz söyleyemem");
        }
    }
}