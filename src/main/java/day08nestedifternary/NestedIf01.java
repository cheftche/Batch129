package day08nestedifternary;

import java.util.Scanner;

public class NestedIf01 {
    //Once disardaki if, sonra icerdeki if calisir. Java pek sevmez.
    //Java "Nested IF" leri calistirirken cok zamana ihtiyac duyar. (Time Consuming - Zaman Emici)
    //Bu yuzden biz mumkun oldugu kadar Nested If kullanmamaya calisiriz. Son tercih olarak kullanalim.

    public static void main(String[] args) {

        /*
        Example 1: Kullanicidan 3 tane pozitif bir tam sayi aliniz.
        Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz.
        Eger ucgen ise "eskenar" ucgen olma durumunu kontrol ediniz.
        INFO: Ucgen olma sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                                herhangi iki kenar farki ucuncu kenardan kucuk olmali

                                a+b > c > a-b
                                a+c > b > a-c
                                b+c > a > b-c
                                a=b=b ise eskenar ucgen

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlari icin 3 tane uzunluk giriniz...");
        double a = (input.nextDouble()); //sideLength kenar uzunlugu demek
        double b = (input.nextDouble());
        double c = (input.nextDouble());
        boolean ucgenMi = ((a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c)));

        //Math.abs mutlak deger demek math class'indan abs methodu absolute value

        //Kullanicinin negatif sayi girmesini affetmiyorum

        if (a<=0 || b<=0 || c<=0){ //bir tanesi sonucu true yapiyorsa || veya kullanilmali
            System.out.println("Ucgenin kenarlari negatif olamaz");
        }
        else if (ucgenMi){ //ucgen olmayi inceler, (outer if hepisi)

            if (a==b && b==c && a==c){ //eskenar ucgen olmayi inceler (bu kisim eskenar degil dahil ic taraf, inner if)
                System.out.println("Ucgen hem de eskenar ucgen...");
            }else{
                System.out.println("Ucgen ama eskenar degil");
            }

        }else{
            System.out.println("Sen ucgen degilsin");
        }























    }

}
