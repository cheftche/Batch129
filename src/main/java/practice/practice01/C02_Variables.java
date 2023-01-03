package practice.practice01;

import java.util.Scanner;

public class C02_Variables {

    /*
    TechproEd spor salonu icin kullanicidan isim, soyisim, yas, kilo, boy, salona devam edecegi ay suresi
    bilgilerini alip aylik olarak $20 olarak toplam ucretini yazdiriniz.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("TechProEd Spor Salonuna hosgeldiniz");

        System.out.println("Lutfen isim soyisim giriniz.");
        String name = input.nextLine(); //tum cumleyi alir enter'a basana kadar

        System.out.println("Lutfen yasinizi giriniz.");
        byte age = input.nextByte(); //27

        System.out.println("Lutfen kilonuzu giriniz.");
        double weight = input.nextDouble(); //73.8

        System.out.println("Lutfen boyunuzu giriniz.");
        double height = input.nextDouble(); //170.5

        int monthlyPrice = 20;
        System.out.println("montlyPrice" + monthlyPrice);
        System.out.println("Kac ay geleceginizi giriniz.");
        int month = input.nextInt();
        int total_price = monthlyPrice * month;
        System.out.println("total_price:" + total_price);

        System.out.println("\nIsminiz:"+ name +"\t" + "Yasiniz:" + age + "  Kilo:" + weight + "  Boy:" + height +
                "  Odemeniz gereken toplam tutar:" + total_price + "$"); //hepsini ayni sout'a koyduk
        /*
        \n ==> alt satira gecirir
        \t ==> bir tab bosluk birakir
        \b ==> gerisindeki ilk harfi siler
        \\ ==> \ ters slash (prints a back slash)
        \' ==> ' tek tirnak yazdirir
        \" ==> " cift tirnak yazdirir
        ctrl + alt + l ==> windows icin sayfayi duzenler
        cmd + alt + l ==> mac icin sayfayi duzenler
         */














    }

}
