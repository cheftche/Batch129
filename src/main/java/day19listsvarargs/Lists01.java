package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Lists01 {

    public static void main(String[] args) {

        //Example 1: Verilen bir List'teki elemanlari tekrarsiz olarak yazdiriniz. (Interview sorusu)
        //           [2, 3, 2, 2, 5] ==> [2, 3, 5]

        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(5);

        List<Integer> newList = new ArrayList<>(); //bos yeni bir list olusturduk

        for (Integer w : myList){

            if (!newList.contains(w)){ //o eleman yoksa
                newList.add(w); //o elemani yeni list'e ekle
            }
        }
        System.out.println(newList); // [2, 3, 5]

        //Example 2: Musteriden urun ismini aliniz
        //           musterinin ismini verdigi urun listede varsa urunun ismini yazdiriniz
        //           Musterinin ismini verdigi urun listede yoksa "Out of stock" yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Urun Arama sistemimize hosgeldiniz");
        System.out.println("Urun Aramayi Sonlandirmak Icin Q'ya basiniz");

        List<String> products = new ArrayList<>();
        products.add("TV");
        products.add("Radio");
        products.add("iPad");
        products.add("PC");
        products.add("Notebook");
        products.add("Mobile Phone");

        /*for loop kurunuz, product listindeki herbir elemanin tum karakterlerini set method kullanarak kucuk harfe ceviriniz
        kullsnicidan gelen urun ismini de kucuk harfe cevirin
         */

        do {
            System.out.println("Aradiginiz urunun ismini giriniz...");
            String product = input.nextLine();

            if (product.equalsIgnoreCase("Q")){
                break;
            }else if (products.contains(product)){
                System.out.println(product + "is in stock");
            }else if (!products.contains(product)){
                System.out.println(product + "is out of stock!...");
            }
        }while(true);
        System.out.println("Sitemizi kullandiginiz icin etsekkur eder, tekrar bekleriz");






    }
}
