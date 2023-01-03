package day03scanner;

import java.util.Scanner; //kutuphaneye gittim o class'i(kitabi) aldim eve getirdim demek otomatik yaziyor

public class Scanner01 {
    
    //Kullanicidan data alip kodlarimizda kullanacagiz. 

    //Note: Object'in ismini input yaptik, cunku bu object kullanicidan alinan datayi benim kodlarimin icine koyacak.
    //Note: System.in System'in icine koy demek
    
    //Scanner classi kullanici ile etkilesim kurmamizi saglar.
    //Scanner bir Class'tir. Java util kutuphanesinden getirildigi icin import ister

    //Kullanicidan Data almak icin Yapilacaklar:
    //1.Adim Scanner Class'indan Object olusturun
    //Scanner input = new Scanner(System.in); //Bu Classi sistemin icine dahil etmek icin yazilir

    //2.Adim Kullaniciya ne istediginize dair mesaj veriniz.
    // System.out.println("Lutfen yasinizi giriniz");

    //3.Adim Uygun method'u kullanarak kullanicinin verdigi data'yi memory'ye yerlestiriniz, ardindan yazdiriniz.
    // byte age = input.nextByte();
    // System.out.println("age = " + age);

    public static void main(String[] args) {

        //Ornek: Kullaniciya ad, memleket, yas, boy, yasadigi yeri sevip sevmedigini soran bir program yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String name = input.nextLine(); //Birden fazla kelime isim olabilir o yuzden nextline diyin tum satiri alir, kullanicidan String bir deger istedik
        System.out.println("name = " + name);

        System.out.println("Lutfen memleketinizi giriniz...");
        String city = input.nextLine();
        System.out.println("city = " + city);

        System.out.println("Lutfen yasinizi giriniz");
        byte age = input.nextByte();
        System.out.println("age = " + age);

        System.out.println("Lutfen boyunuzu giriniz");
        short height =input.nextShort();
        System.out.println("height = " + height);

        System.out.println("Lutfen yasadiginiz yeri sevip sevmediginizi yaziniz");
        boolean doYouLike = input.nextBoolean();
        System.out.println("doYouLike = " + doYouLike);

        //System.out.println("***********"); //soutv yazinca hangisini yazdirmak istiyorsun diye isimler siralaniyor






    }


}
