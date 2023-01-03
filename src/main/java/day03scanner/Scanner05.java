package day03scanner;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {

        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //i)Alanini hesaplayiniz. kisa kenar*uzun kenar
        //ii)Cevresini hesaplayiniz. 2*kisa kenar + 2*uzun kenar)

        Scanner input = new Scanner(System.in);
        System.out.println("Dikdortgenin kisa kenar uzunlugunu giriniz..."); //1,2
        float shortSide = input.nextFloat();

        System.out.println("Dikdortgenin uzun kenar uzunlugunu giriniz..."); //4
        float longSide = input.nextFloat();

        System.out.println("Alan =" + (shortSide * longSide)); //4.8
        System.out.println("Cevre =" + (2*shortSide + 2*longSide)); //10.4

    }
}
