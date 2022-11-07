package ders09_StringManipulations;

public class C03_equalsIgnorCase {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="ali";
        String str3="ALI";

        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equals(str3));//false

        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str1.equalsIgnoreCase(str3));//true

        System.out.println(str1.equalsIgnoreCase("Ali Can"));//false

        /*
        equalsIgnorCase aynı metnin büyük kücük harf kullanılarak oluşturulan
        farklı yazımları birbirine eşit olarak kabul eder

        yani equalsIgnorCase içi ali, ALI, Ali, AlI, aLI, alI birbirine eşittir

        ama kelimelik farklılık varsa bunlaraı tolere etmez

        a li ile ali birbirine eşit değildir
        ali ile ALI. birbirine eşit değildir
         */





    }
}
