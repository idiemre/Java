package emre;

import java.util.Scanner;

public class not {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("notunuzu giriniz :");
        int not =scan.nextInt();

        System.out.println(not>=101|| not<=-1 ? "geçersiz not girişi": not>=50 ? "sınıfı geçtiniz iyi tatiller":"sınıfta kaldınız yaz okuluna bekleriz");







    }
}
