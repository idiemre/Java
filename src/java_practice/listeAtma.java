package java_practice;

import java.util.ArrayList;
import java.util.List;

public class listeAtma {
    public static void main(String[] args) {


        String[][] arr = {{"ali", "ahmet", "emre", "ekrem"}, {"ronaldo", "drogba", "messi"}, {"erkan", "hasan"}};

        listeAt(arr);


    }


    public static void listeAt(String[][] arr){

        List<String> isimler=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                isimler.add(arr[i][j]);

            }

        }
        System.out.println(isimler);
    }
}






