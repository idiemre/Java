package ders22_arrayLists;

public class C04_ForEachLoop {
    public static void main(String[] args) {

        int[] arr={3,5,7,8,4,2,6,9,6,4,5};

        int toplam = 0;

        //bu array'deki 5'den buyuk olan tüm elementleri toplayalım


        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]>5) {

                toplam +=arr[i];
            }
        }
        System.out.println("for loop ile : "+toplam);



        //for each loop daha basit bir kurgu ile calisir
        // for each loopa'a 3 şeyi söylememiz lazım
        //1- hangi data tründe degiskenler 'le ugrasacaksınız
        //2- loop'un icerisinde her bir eleeman geldiginde hangi isimle islem yapcaksınız
        //3- hangi array veya collectio'dan eleman gelecek
        toplam=0;

        for (int each:arr //arr'ye git her bir int'i bana getir
             ) {

           if (each>5){
               toplam+=each;
           }
        }
        System.out.println("for-each loop ile toplam : "+toplam);
    }
}
