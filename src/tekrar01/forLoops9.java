package tekrar01;

public class forLoops9 {
    public static void main(String[] args) {
        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        String str="Java cok guzel";
        String tersStr="";


        for (int i = str.length()-1; i >=0; i--) {
            tersStr+=str.substring(i,i+1);


        }

        System.out.println(tersStr);
    }
}
