package advanced_practice.practice01;

import java.util.Scanner;

public class Q04_Regex_AdSoyad {

    /* Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
    ad ayrı soyad ayrı sekilde ekrana yazdırınız.
    Örn:
    Ad: Ali
    Soyad: Can
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ad ve soyadinizi arada bir bosluk olacak sekilde giriniz");

        String adSoyad = input.nextLine().replaceAll("[^a-zA-Z ]","").replaceAll("\\s+"," ").trim().toLowerCase();
        System.out.println("adSoyad =" + adSoyad);

        String ad = adSoyad.split(" ")[0];//bosluktan ikiye bolup ilk kelimeyi adi aldik ali
        String soyAd = adSoyad.split(" ")[1]; //can

        String adIlkHarf = ad.substring(0,1).toUpperCase(); //once ali aldik sonra ilk harfi buyuk harf yaptik
        String soyadIlkHarf = soyAd.substring(0,1).toUpperCase(); //soyadin ilk harfini buyuk harf yaptik

        String adFormat = adIlkHarf+ ad.substring(1); //verilenden sonuna kadar hepsini al index sifirdan sonra baslamasi gerekir
        String soyadFormat = soyadIlkHarf+ soyAd.substring(1);

        System.out.println("Ad:" + adFormat);
        System.out.println("Soyad:" +soyadFormat); //Ali Can olmus oldu

        //ilk replace ici tum harfler ve bosluk disindakileri hicbir seyle degis yani yok et
        //\\s+ bir veya birden fazla bosluk olanlari(+) , " " tek bosluk ile yer degis
        //trim() bastaki ve sondaki bosluklari at
        //toLowerCase ile butun harfleri kucuk yaptik
        //sonra sadece bas harfleri buyutecegiz

    }
}
