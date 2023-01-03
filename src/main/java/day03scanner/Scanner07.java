package day03scanner;

import java.util.Scanner;

public class Scanner07 {
    public static void main(String[] args) {

        //Kullanicidan aldiginiz sekil ile asagidaki gibi bir gorsel olusturunuz.
        /* ucgen sekli
          A  bosbosAbosbos
          AA bosAbosAbos
         AAA AbosAbosAbosA
         */

        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen bir karakter giriniz"); //A
        char ch = input.next().charAt(0); //tek karakter alabilmek icin charAt(0) kullanilir
        System.out.println("  " +ch + "  ");
        System.out.println(" " + ch + " " + ch + " ");
        System.out.println(ch + " " + ch + " " + ch);
        System.out.println("\t\t" + ch + "\t\t"); // \t bir tab bosluk anlamina gelir
        System.out.println(ch + "\t" +ch + "\t\t" + ch + "\t\t" + ch);

        // /n ==> alt satira atar
        //ctrl+z ==>geri al komutu
        // \t ==> bir tab bosluk birakir
        //shift+ctrl+f10 ==>kodu calistirir
        //ctrl + s ==> kaydeder
        //ctrl+alt+l ==> Class'i duzenler sayfayi
        //ctrl + d ==> cogaltir

    }
}
