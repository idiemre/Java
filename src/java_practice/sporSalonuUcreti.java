package java_practice;

import java.util.Scanner;

public class sporSalonuUcreti {
    public static void main(String[] args) {
        // TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy,
        // salona devam edeceği ay süresini
        // bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.


        Scanner scan=new Scanner(System.in);

        System.out.print("isim soyisim : ");
        String isimSoyisim=scan.nextLine();

        System.out.print("yas : ");
        int yas=scan.nextInt();

        System.out.print("kilo : ");
        double kilo= scan.nextDouble();

        System.out.print("boy : ");
        double boy=scan.nextDouble();

        System.out.print("üyelik : ");
        int üyelik= scan.nextInt();


        System.out.println("isim soyisim : "+isimSoyisim+
                "\nyaş : "+yas+
                "\nkilo : "+kilo+
                "\nboy : "+boy+
                "\nüyelik ücreti : "+(üyelik*20)+"$");
    }
}
