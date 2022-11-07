package java_practice;

public class CiftKatliCiftToplama {
    public static void main(String[] args) {
        //Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
        //method olusturun.
        int[][] arr={{4,5,2,3,6},{8,7,5,2,1},{4,5,7,8,5,3,2}};


        ciftSayiToplama(arr);

    }

    public static void ciftSayiToplama (int[][] arr){
        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]%2==0){
                    toplam+=arr[i][j];
                }
            }

        }
        System.out.println(toplam);

    }
}
