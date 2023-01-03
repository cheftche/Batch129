package day05typecastingstringmanipulations;

public class TypeCasting01 {

     /*
        Numeric primitive data type`larinin birbirine donusturulmesine "Type Casting" denir.
        Numeric Data Type`lar kucukten buyuge dogru byte - short - int - long - float - double

        Note 1: Kucuk data type`larini buyuk data type`larina cevirmeyi Java otomatik yapabilir. (Kucuk kutuyu buyuk kutuya yerlestirme)
        Bu isleme "AutoWidening" (Otomatik Genisletme) denir.

        Note 2: Buyuk data type`larini kucuk data type`larina cevirmek riskli bir istir' Java bu riskli isi otomatik olarak yapmaz.
                Bu islemi kod yazanlar yapar.
                Bu isleme "ExplicitNarrowing" (Acik secik, aciktan Daraltma) denir.

     */

    public static void main(String[] args) {

        //byte data type`ini int data type`ina ceviriniz.
        byte age = 13;
        int ageInt = age; //AutoWidening

        //long data type`ini short data type`ina ceviriniz.
        long weight = 234;
        short weightShort = (short)weight; //ExplicitNarrowing (Riski ben aliyorum demek lazim o yuzden (short) ekledik

        //int data type`ini float data type`ina ceviriniz.
        int population = 700000;
        System.out.println(population); //700000 (yazdirip gorduk)
        float populationFloat = population;
        System.out.println(populationFloat); //700000.0

        //double data type`ini short data type`ina ceviriniz.
        double number = 12.234;
        System.out.println(number); //12.234
        short numberShort = (short)number;
        System.out.println(numberShort); //12 (Java sadece ondalik kismi iptal ederek tamsayiya cevirir)

        //Dikkat!
        //Donusum yaptiginiz sayi(260)' donuseceginiz data type`inin sinirlari disinda ise,
        // Java kullandiginiz sayi ile "mod" islemi yapar ve mod isleminin sonucu sizin yeni degeriniz olur.
        //Example 1:
        short num = 260;
        System.out.println(num); //260  -128........ -1 0 1 .......127 toplam 256 sayi var

        byte numByte = (byte)num;
        System.out.println(numByte); //4 260`i byte taki toplam 256 sayiya bolunce 4 kalir sonuc o olur

        //Example 2:
        short n = 1023;
        System.out.println(n); //1023
        byte nByte = (byte)n;
        System.out.println(nByte); //-1 1023 bolu 256 4 alip -1 kalip yaridan fazlaysa bi fazlasini sonuc alip kalani eksi sayi olarak yazar

    }














}
