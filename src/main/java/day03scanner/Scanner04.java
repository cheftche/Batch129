package day03scanner;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        //EX 1)Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Iki sayi giriniz");
        double firstNumber = input.nextDouble(); //5
        double secondNumber = input.nextDouble(); //2

        System.out.println(firstNumber + secondNumber); //7.0
        System.out.println(firstNumber - secondNumber); //3.0
        System.out.println(firstNumber * secondNumber); //10.0
        System.out.println(firstNumber / secondNumber); //2.5

        //EX 2) Kullanicidan sayilari alarak toplama islemi yaptiran kodu yaziniz

        //Scanner input = new Scanner(System.in);
        System.out.println("Lütfen toplanacak olan ilk sayiyi giriniz");
        double sayi1 = input.nextDouble();

        System.out.println("Lutfen toplanacak olan ikinci sayiyi giriniz");
        double sayi2 = input.nextDouble();

        System.out.println("Toplam" + (sayi1+sayi2));

    }
}
