package tekrar01;

public class klk {
    public static void main(String[] args) {

        gunler("pazartesi");


    }






















    public static void gunler(String gun){
        boolean haftasonuMu=false;

        if (gun.equalsIgnoreCase("pazartesi")){
            haftasonuMu=false;
        }else if (gun.equalsIgnoreCase("sali")){
            haftasonuMu=false;
        }else if (gun.equalsIgnoreCase("carsamba")){
            haftasonuMu=false;
        }else if (gun.equalsIgnoreCase("persembe")){
            haftasonuMu=false;
        }else if (gun.equalsIgnoreCase("cuma")){
            haftasonuMu=false;
        }else {
            haftasonuMu=true;
        }


        if (!(haftasonuMu)){
            if (gun.equalsIgnoreCase("pazartesi")){
                System.out.println("simdi calisma zamani tatile 5 gun var");
            }else if (gun.equalsIgnoreCase("sali")){
                System.out.println("simdi calisma zamani tatile 4 gun var");
            }else if (gun.equalsIgnoreCase("carsamba")){
                System.out.println("simdi calisma zamani tatile 3 gun var");
            }else if (gun.equalsIgnoreCase("persembe")){
                System.out.println("simdi calisma zamani tatile 2 gun var");
            }else if (gun.equalsIgnoreCase("cuma")){
                System.out.println("simdi calisma zamani tatile 1 gun var");
            }
        }else if (haftasonuMu){
            if (gun.equalsIgnoreCase("cumartesi")){
                System.out.println("simdi dinlenme zamani");
            }else if (gun.equalsIgnoreCase("pazar")){
                System.out.println("simdi dinlenme zamani");
            }
        }

    }
}
