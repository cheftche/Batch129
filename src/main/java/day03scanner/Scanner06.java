package day03scanner;

import java.util.Scanner;

public class Scanner06 {

    public static void main(String[] args) {

        //Kullanicidan alacağiniz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki rakamlari toplamini yazdiran kodu yaziniz
        //Bir sayinin son rakamini alabilmek icin o sayiyi 10'a bolun, kalana bakin.
        //Bir tam sayiyi bir tam sayiya bolerseniz, Java sonucu kesinlikle tam sayi yapar. Ondalik kismi iptal eder, yuvarlama islemi yapmaz.
        Scanner input = new Scanner(System.in); //38761

        System.out.println("5 basamakli bir sayi giriniz..."); //38761

        int number = input.nextInt();

        //Son rakami al
        int lastDigit = number%10; //%10 islemi sayiyi 10'a boler kalani alir.
        System.out.println(lastDigit); //1

        //Sayiyi kucult
        number = number/10; //sayiyi 10/a boler ondaligi atar, tam sayi kismini alarak sayiyi kucultur.
        System.out.println(number); //3876









    }
}
