package tekrar01;

public class dde {
    public static void main(String[] args) {

        int bas=1;
        int bitis=5;
        int toplam=0;


        for (int i = bas; i <=bitis ; i++) {
           toplam+=i;
        }


        if (bas<bitis){
            System.out.println(toplam);
        }else if (bas>bitis){
            System.out.println("uyari");
        }


    }
}
