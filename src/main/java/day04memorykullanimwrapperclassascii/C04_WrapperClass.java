package day04memorykullanimwrapperclassascii;

public class C04_WrapperClass {

    /*
    Non-Primite data turleri sadece data barindirmak icin degil ayni zamanda  methodlar da bulundurur.
    Primitive Data turleri ise sadece deger saklar.
    Java bu duruma bir cozum uretmistir.
    Her primitive data turunu Non-Primitive olarak kullanabilmek icin ozel Class`lar olusturmustur.
    Oracle firmasinin urunu olan Java primitivelere method ekleyerek olusturduklari bu yeni yapiya Wrapper Class adini vermistir.

    Primitive    Wrapper
    byte    ==>   Byte
    short   ==>   Short
    int     ==>   Integer ***
    long    ==>   Long
    float   ==>   Float
    double  ==>   Double
    char    ==>   Character ***
     */

    public static void main(String[] args) {

        byte primitiveByte = 12; //primitive data type larinda nokta koydugumuzda hicbir method gelmez
        Byte wrapperByte = 12; //wrapper classlarda nokta koydugumuzda bircok method kullanabiliriz

        //byte data type`inin en kucuk ve en buyuk degerini ekrana yazdirin.
        System.out.println(Byte.MAX_VALUE); //127
        System.out.println(Byte.MIN_VALUE); //-128

    //**Primitive`ler Wrapper Class`lara Nasil Cevrilir?(Unboxing)
        Character w1 ='s';
    char primitiveW1 = w1;
    //Note: Autoboxing ve Unboxing Java tarafindan otomatik yapilir
    //Extra kod yazmaya gerek yoktur

    //Ex: Verilen iki String datanin toplamini veren kodu yaziniz
    String str1 ="12345";
    String str2 ="6789";
        System.out.println(str1+str2); //123456789 yanyana yazdirdi
        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2)); //19134






    }
}