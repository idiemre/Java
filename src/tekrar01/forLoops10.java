package tekrar01;

public class forLoops10 {
    public static void main(String[] args) {
        //Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip
        //kaydedin.

        String str="Kırıkhan";
        String tersStr="";



        for (int i = str.length()-1; i>=0 ; i--) {

            tersStr+=str.substring(i,i+1);

        }
        System.out.println(tersStr);

    }
}
