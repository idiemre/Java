package ders20_multiDimensionalArrays;

public class C06_MDA_Soru {
    public static void main(String[] args) {
        //verilen iki katlı bir array'de
        //her bir inner array'in son elementlerini toplamını yazdıran bir method olusturun

        int[][] arr={{5,7}, {5, 8, 9},{0,1}};

        sonElemanTopla(arr);



    }
    public static void sonElemanTopla(int [][] arr){
        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {

            toplam+=arr[i][arr[i].length-1];
        }
        System.out.println(toplam);
    }
}
