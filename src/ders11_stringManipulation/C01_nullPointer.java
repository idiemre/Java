package ders11_stringManipulation;

public class C01_nullPointer {
    public static void main(String[] args) {

        String str1="";
        //str1'e değer atanmıştır

        System.out.println(str1);//hiçlik
        System.out.println(str1.concat("Java"));//Java


        String str2;
        //str2 oluşturuldu ama deger atanmadı

        //System.out.println(str2); str2'ye değer atanmadıgı için yazdırılamaz

        //System.out.println(str2.concat("Java"));//değer atanmadığı için method kullanılamaz

        str2="Java Candir";
        System.out.println(str2);//Java Candir
        System.out.println(str2.concat("."));//Java Candir.

        String str3 = null;//str3 e deger atanmamıştır
                           //null pointer ile javaya deger atamadığımızın farkında oldugumuzu söylüyoruz

        System.out.println(str3);//null işaretlendiğini yazdırır

        System.out.println(str3.concat("Java"));

        System.out.println(str3+"Java");//nullJava
        System.out.println(str3.toUpperCase());//


    }
}
