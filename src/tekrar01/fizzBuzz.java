package tekrar01;

public class fizzBuzz {
    public static void main(String[] args) {

        int sayi=200;


        for (int i = 1; i < sayi; i++) {
            if (i%5==0 && i%3==0){
                System.out.print("fizzBuzz\n");
            }else if (i%5==0){
                System.out.print("Buzz ");
            }else if(i%3==0){
                System.out.print("fizz ");
            }else {
                System.out.print(i+" ");
            }
        }


    }
}
