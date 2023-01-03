package practice.practice05;

import java.util.Scanner;

public class C01_StringManipulations {

    /* String Class Methodlari
    1)equals():
    i)Iki tane String'in ayni olup olmadigini anlamamiza yarar.
   ii)equals() method'u "boolean" return eder.

    2)equalsIgnoreCase():
    i) Iki tane String'in ayni olup olmadigini buyuk harf, kucuk harfe dikkat etmeden anlamamiza yarar.
    ii) equalsIgnoreCase() method'u "boolean" return eder.

    3)toLowerCase():
    i)Bir String'deki tum harfleri kucuk harfe cevirmek icin kullanilir.
    ii) toLowerCase() method'u "String" return eder

    4)toUpperCase():
    i)Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir.
    ii) toUpperCase() method'u "String" return eder

    5)charAt():
    i) Bir String'den belli bir index'deki characteri almak icin kullanilir.
    ii) charAt() method'u "char" return eder.

    6)length():
    i) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir
    ii) length() method'u "int" return eder.

    7)contains():
    i)Bir String'de belli bir characterin veya characterlerin var olup olmadigini anlamak icin kullanilir
    ii) contains() method'u "boolean" return eder.

    8)split():
    i)Bir String'i istedigimiz character'den parcalamaya yarar
    ii)split() method'u "Array" return eder.

    9)replace():
    i)Metin icerisindeki karakter ya da karakterlerin, istenilen karakter ya da metinle degistirilmesini saglar.
    Sonuc String'dir..

    10)replaceFirst()
    i) Replace ile aynı sadece ilk bulunan karakteri değiştirir
     */

    /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
         1) \\d    ==> tum rakamlar(digit) yerine
            \\D    ==> tum rakam disi character ler yerine
         2) \\w    ==> A->Z        a->z         0->9    _tum buyuk, kucuk harf ve rakamlar (word)
            \\W    ==> A->Z        a->z         0->9    _ disindaki hersey
         3) \\s    ==> space tum bosluklar
            \\S    ==> space disindaki hersey

    12) + Concat: Bir String'e diğerini ekler.
        Concatenation : Java'da + islemi yapilirken eger toplanan ifadelerden biri veya
                        her ikisi String ise Java toplama degil BIRLESTIRME==YANYANA yazdirma yapar.

        ONEMLI NOT=JAVA YUKARIDAN ASAGI SOLDAN SAGA CALISIR.
         */

    public static void main(String[] args) {

        System.out.println(15+20+"Merhaba");//35Merhaba
        System.out.println("Merhaba"+15+20); //Merhaba1520 string + sayi yanyana yazar string'e doner
        System.out.println("Merhaba"+(15+20)); //Merhaba35 islem onceligi once parantez
        System.out.println("Merhaba"+15*20); //Merhaba300 carma,bolme oncelikli

        //Kullanicidan ismini ve soyismini girmesini isteyin, sonrasinda kullanici nasil girerse girsin
        // konsolda buyuk harfle yazilmasini saglayin.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isim ve soyismini giriniz");
        String name = input.nextLine(),surname = input.nextLine(); //String nameSurname = input.nextLine().toUpperCase(); boyle de ben yaptim oldu
        //Note: Multiple declaration= coklu tanimlama araya virgul koyulur;degil

        String nameSurname = name.concat(" " + surname).toUpperCase(); //concat yanyana yazdirma demek
        System.out.println("nameSurname =" + nameSurname);

        //Rakam haricindekileri silin.
        String str = "45.99$";
        str = str.replaceAll("\\D",""); //rakam harici olan her seyi sil dedik
        System.out.println("str = " + str); //4599

        //Verilen bir cumleyi * ile gizleyin, 10. character'den sonrasini yazdirin.
        String cumle = "Her dert Java gibi olsa";
        System.out.println(cumle.replaceAll("\\w","*")+cumle.substring(10)); //*** **** **** **** ****ava gibi olsa
        //System.out.println( ad.substring(0,10).replaceAll("\\w","*") + ad.substring(10)); olursa 10.karaktere kadar * yazip devam eder

        // a harfi yerine @ isareti yerlestiriniz
        String kelime = "olaganustu";
        System.out.println(kelime.replace("a","@")); //ol@g@nustu

        String txt = "Merhaba Dunya";
        //txt'deki butun 'a' harflerini 'e' ile degistirin
        System.out.println(txt.replace("a","e")); //Merhebe Dunye

        //txt'deki ilk bulunan 'a' yi 'e' yapin
        System.out.println(txt.replaceFirst("a","e")); //Merheba Dunya, ilk bulunan harfi degistirmek icin kullanilir

        //"Kalem" yerine "Biber" yazdirin.
        String str2 = "Dolma Kalem ile bir Dunya kalemi aldik";
        System.out.println(str2.replace("Kalem","Biber")); //Dolma biber ile bir Dunya kalemi aldik, buyuk kucuk harf duyarli

        String str3 = "bugun hava yagmurlu";
        System.out.println(str3.length()); //19

        String str4 = "";
        System.out.println("str4.length() = " + str4.length()); //0

        String str5 = " ";
        System.out.println("str5.length() = " + str5.length()); //1

        //Kullanicidan isim ve soyisim girmesini isteyin, hangisinin daha uzun oldugunu yazdiran kodu olusturun.
        Scanner input1 = new Scanner(System.in);
        System.out.println("Lutfen isim ve soyisim giriniz: \n name1:");
        String name1 = input1.nextLine();
        System.out.println("soyisim: ");
        String surname1 = input1.nextLine();

        if (name1.length()>surname1.length()){
            System.out.println("Isminiz daha uzun");
        }else if (name.length()==surname1.length()){
            System.out.println("Ayni uzunluktalar");
        }else{
            System.out.println("Soyisminiz isminizden uzun");
        }





    }
}
