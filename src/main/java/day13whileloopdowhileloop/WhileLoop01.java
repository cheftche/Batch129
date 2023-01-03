package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {

    public static void main(String[] args) {

        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz.
                     // 3==> 3x1=1  3x2=6  3x3=9  3x4=12.....3x10=30

        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz...");
        double num=input.nextDouble();
        int i =1;
        while (i<11){

           System.out.println(num+"x"+i+"="+(num*i));
            i++;
        }


        //Example 2: Verilen bir String'te her harfin sonrasina "*" sembolunu ekleyiniz.
        //  Java ==> J*a*v*a

        //Scanner yukarida var
        System.out.println("Bir kelime giriniz");
        String word = input.next();
        String newWord = "";

        int k = 0; //index 0'dan baslar

        while (k<word.length()){
            newWord = newWord + word.charAt(k) + "*";
            k++;
        }
        System.out.println(newWord);

    }




}
