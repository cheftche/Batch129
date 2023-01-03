package practice.practice02;

public class C02_MethodCreation {

    //Dikdortgenin alanini hesaplayan methodu olusturunuz ve kullaniniz.
    public static void main(String[] args) {


        //protokol alani, vip olan, sadece static girebilir

        System.out.println(areaOfRectagular(5, 10));


    } //main body

    /*
    Access Modifier   static   Data type   MethodAdi   (parametreler) {}
    */

    public static int areaOfRectagular (int a, int b){
        return a*b; //carpmanin sonucunu kullaniciya ver   bu iki cumle method, main method disinda yazilir
    }
    //main method static oldugu icin main'e bagli her seyin static olmasi gerekir
    //method adi Camel Case kucuk harf baslar sonraki her kelimenin ilk harfi buyuk olur


} //class body
