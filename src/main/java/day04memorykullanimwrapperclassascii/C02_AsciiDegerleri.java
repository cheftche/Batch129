package day04memorykullanimwrapperclassascii;

public class C02_AsciiDegerleri {

    /*
    ASCII = American Standart Kodlama Sistemi, uluslararasi kabul gormus degerlerdir.
    Klavyemizde kullandigimiz harf ve sembollerin matematiksel karsiligi char data turunde isleme alinirsa
    o char degerinin Ascii Table'daki karsiligini isleme alir.
    Harf ve sembollere deger atar.
    Karakterlerin cebirsel karsiligini bulmak icin ortaya cikmistir.
    Cunku bilgisayarda her sey 1 ve 0 dan olusur. Bu yapıya cevirebilmek icin Ascii Table olustulmustur.
    Buyuk harflerin Ascii degeri, kucuk harflerin Ascii degerinden daha kucuktur.
     */

    public static void main(String[] args) {
        //Bir tam sayı ile bir harfi toplayiniz
        int deger = 20;
        char harf = 'a'; //Ascii degeri 97

        //1.Yol
        int sum = deger+harf;
        System.out.println("Bir tam sayi ile harfin toplami =" + sum); //20 + 97 =117

        //2.Yol
        System.out.println("2.Yol Toplam=" + (deger+harf)); //117

        char rakam1 = '1';
        System.out.println("rakam1 =" + rakam1); //1

        char rakam2 = '2';
        System.out.println("rakam2 =" + rakam2); //2

        char rakam3 = '3';
        System.out.println("rakam3 =" + rakam3); //3

        char rakam4 = '4';
        System.out.println("rakam4 =" + rakam4); //4

        System.out.println("rakam1 + rakam2 +rakam3 + rakam4 =" + rakam1 + rakam2 +rakam3 + rakam4); //1234
        System.out.println("rakam1 + rakam2 +rakam3 + rakam4 ASCII Toplam=" + (rakam1 + rakam2 +rakam3 + rakam4)); //202 Ascii degerlerini topladi

        char kh = 'a';
        char bh = 'A';
        System.out.println("a'nin Ascii Degeri =" + (kh+0)); //97 (0 koyma nedenimiz harflerin Ascii degerini ogrenmek icin matematiksel bir isleme dahil etmek gerekir)
        System.out.println("A'nin Ascii Degeri =" + (bh+0)); //65

        System.out.println("kh > bh ==>" + (kh>bh)); //true - karsilastirma islemlerinin sonucu true yada false doner

        //Herhangi bir karakterin Ascii degerini hesaplatalim.

        //1.Yol
        char space = ' ';
        System.out.println("space Ascii degeri =" + (space+0)); //32 space Ascii degeri

        //2.Yol
        int hrf = 'm';
        System.out.println("int harf'in Ascii degeri =" + hrf); //109
        //char data type'larinda Java karaktere int deger de atanabilir
        //Cunku char data type'inin bir resim degeri bir de Ascii'den gelen int degeri vardir.
        //Bu sekilde de Ascii degerini bulabiliriz.

        //*****ASCII degerlerinde yararlanarak karsilastirma yapabiliriz

        byte b= 125;
        float f = 2.45648F;
        long l = 54565125511144L;
        char ch = 'h';
        System.out.println(l>ch); //true
        System.out.println(b<f); //false
        System.out.println(b<ch); //false

    }



}
