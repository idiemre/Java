package tekrar01;

import java.util.Scanner;

public class nestedIfElse {
    public static void main(String[] args) {


        String gunIsim="sali";



        if (gunIsim.equalsIgnoreCase("pazartesi") || gunIsim.equalsIgnoreCase("sali" )
                || gunIsim.equalsIgnoreCase("carsamba") || gunIsim.equalsIgnoreCase("persembe") ||
                gunIsim.equalsIgnoreCase("cuma")){
            if (gunIsim.equalsIgnoreCase("pazartesi")){
                System.out.println("simdi calisma zamani tatile 5 gun var");
            }else if (gunIsim.equalsIgnoreCase("sali")){
                System.out.println("simdi calisma zamani tatile 4 gun var");
            }else if (gunIsim.equalsIgnoreCase("carsamba")){
                System.out.println("simdi calisma zamani tatile 3 gun var");
            }else if (gunIsim.equalsIgnoreCase("persembe")){
                System.out.println("simdi calisma zamani tatile 2 gun var");
            }else if (gunIsim.equalsIgnoreCase("cuma")){
                System.out.println("simdi calisma zamani tatile 1 gun var");
            }

        }else if (gunIsim.equalsIgnoreCase("cumartesi") || gunIsim.equalsIgnoreCase("pazar" )){
            if (gunIsim.equalsIgnoreCase("cumartesi")){
                System.out.println("simdi dinlenme zamani");
            }else if (gunIsim.equalsIgnoreCase("pazar")){
                System.out.println("simdi dinlenme zamani");
            }
        }




    }
}
