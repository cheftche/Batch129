package practice.practice03;

import java.util.Scanner;

public class C03_Ternary {

    public static void main(String[] args) {

        /*
        Kullanicidan sifirdan buyuk, pozitif bir tamsayi girmesini isteyin.
        Girilen pozitif tam sayi 3 basamakli ise ekrana "3 basamakli" yazdirin.
        3 basamakli degilse cift olup olmadigini kontrol edin.
        Cift ise "3 basamakli olmayan cift sayi" yazdirin.
        Cift sayi degilse "3 basamakli olmayan tek sayi" yazdirin.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifirdan buyuk pozitif bir tam sayi giriniz...");
        int number = input.nextInt();

        //1.Yil if else cozumu
        if (number > 0) {
            boolean sifirdanBuyukUcBas = number > 99 && number < 1000;
            boolean sifirdanBuyukUcBasOlmayanSayi = !(number > 99 && number < 1000) && number % 2 == 0;

            if (sifirdanBuyukUcBas) {
                System.out.println("3 basamakli");
            } else if (sifirdanBuyukUcBasOlmayanSayi) {
                System.out.println("3 basamakli olmayan cift sayi");
            } else
                System.out.println("3 basamakli olmayan pozitif tek sayi");

        } else {   //negatif sayilar icin burasi calisir
            System.out.println("Lutfen gecerli bir pozitif sayi giriniz...");
        }

        //2.Yol Ternary Cozumu
        boolean pozitifseTernary = number > 0;
        boolean sifirdanBuyukUcBasTernary = number > 99 && number < 1000;
        boolean sifirdanBuyukUcBasOlmayanSayiTernary = !(number > 99 && number < 1000) && number % 2 == 0;

        //ActionDataType variable = (sart) ? True Action : False Action ; Data Variable = sartim ? Dogruysa : Yanlissa; Type
        String sonuc = (pozitifseTernary) ? (sifirdanBuyukUcBasOlmayanSayiTernary) ? ("3 basamakli sayi") : //0'dan buyuk 3 basamakli ise incelendi
                (sifirdanBuyukUcBasOlmayanSayiTernary) ? ("3 basamakli olmayan cift sayi") : ("3 basamakli olmayan tek sayi") : //0'dan buyuk 3 basamakli degilse incelendi
                ("Lutfen sifirdan buyuk pozitif bir tam sayi giriniz"); //sifirdan kucuk olma durumu incelendi
        System.out.println(sonuc);
    } //main



} //class
