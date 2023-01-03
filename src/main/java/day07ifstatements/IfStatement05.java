package day07ifstatements;

import java.util.Scanner;

public class IfStatement05 {

    public static void main(String[] args) {

        //Example 1: Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ay ismi giriniz...");
        String monthName = input.next();

        if (monthName.equalsIgnoreCase("January")) {   //stringlerde == yerine equals() methodu kullanilir
            System.out.println(1);                                //ignore gormezden gel ignore case buyuk kucuk harf gormezden gel demek
        } else if (monthName.equalsIgnoreCase("February")) {
            System.out.println(2);
        } else if (monthName.equalsIgnoreCase("March")) {
            System.out.println(3);
        } else if (monthName.equalsIgnoreCase("April")) {
            System.out.println(4);
        } else if (monthName.equalsIgnoreCase("May")) {
            System.out.println(5);
        } else if (monthName.equalsIgnoreCase("June")) {
            System.out.println(6);
        } else if (monthName.equalsIgnoreCase("July")) {
            System.out.println(7);
        } else if (monthName.equalsIgnoreCase("August")) {
            System.out.println(8);
        } else if (monthName.equalsIgnoreCase("September")) {
            System.out.println(9);
        } else if (monthName.equalsIgnoreCase("October")) {
            System.out.println(10);
        } else if (monthName.equalsIgnoreCase("November")) {
            System.out.println(11);
        } else if (monthName.equalsIgnoreCase("December")) {
            System.out.println(12);
        } else{
            System.out.println("Invalid month name..."); //gecersiz ay ismi
        }

        /*
        Note: String'lerin esitliklerini kontrol ederken "==" yerine "equals() methodu kullaniriz.
        Niye?

        Cunku "==" sembolu iki String'i karsilastirirken hem adres'lerine hem de degerlerine bakar.
        Ikisi de ayni ise, size String'ler esittir der, ama biz kod yazarken genellikle String'lerin adresleri ile degil
        degerleri ile ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz.
        "equals()" methodu ise iki String'i karsilastirirken sadece degerlerine bakar, degerler ayni ise bu iki String
        esittir der degerler farkli ise bu iki String farklidir der ki bu bizim kod yazarken ihtiyac duydugumuz seydir.

        String s = "Tom";
        String t = "Terry";
        String r = "Tom";
        1)s==t ==>Java, Adres ve Deger karsilastirir sonuc farkli
        2)s.equals(t) ==> sadece degerlere bakar sonuc farkli
        3)s==r ==> Adres ler farkli, Degerler ayni sonuc farkli

        s.equals(r) ==>Sadece degerlere bakiyor,adreslere bakmiyor s ile r ayni String diyecek adreslerle degil degerlerle ilgileniriz

         */

        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");
        String m = "Tom";

        System.out.println(s==t); //false cunku; adres'ler ve deger'ler farkli
        System.out.println(s.equals(t)); //false cunku; degerler farkli

        System.out.println(s==r); //false cunku adresler farkli
        System.out.println(s.equals(t)); //true equals() sadece degerlere bakti s v "r" ikisi de Tom

        System.out.println(s==m); //true Java var olan ayni deger var mi diye bakar eger varsa onlari adrese koyar

        System.out.println(s.equals(m));//true














    }




























}
