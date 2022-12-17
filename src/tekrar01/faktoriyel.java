package tekrar01;

public class faktoriyel {
    public static void main(String[] args) {

        int sayi=10;
        int faktoriyel=1;

        for (int i = 1; i <=sayi ; i++) {
            faktoriyel*=i;
        }

        System.out.println(sayi--+"*"+sayi--+sayi--+"*"+sayi--+"*"+sayi--+"*"+sayi--+"*"+sayi--+"*"+sayi--+"*"+
                sayi--+"*"+sayi--+"*"+sayi--+"*"+"= "+faktoriyel);



    }
}
