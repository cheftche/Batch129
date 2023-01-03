package day12loops;

import java.util.Scanner;

public class C01_ForLoopIfElse {

    public static void main(String[] args) {

        /*
        Kullanicidan baslangic ve bitis degerlerini alin
        Baslangic degerinden bitis degerine kadar tum tamsayilari ekrana yazdiriniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen baslangic degerini giriniz");
        int baslangic = input.nextInt(); //10
        System.out.println("Lutfen bitis degerini giriniz");
        int bitis = input.nextInt(); //15

        if (baslangic > bitis) {
            System.out.println("Verdiginiz baslangic degeri bitis degerinden kucuk olmali");
        } else {
            for (int i = baslangic; i <= bitis; i++) {
                System.out.print(i + ""); //10 11 12 13 14 15  aralarinda bosluk kalsin diye "" ekledik
            }//for i
        }

          /*
        Kullanicidan baslangic ve bitis degerlerini alin
        Baslangic degerinden bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz.
        10 12 14
         */



        }//main


    } //class