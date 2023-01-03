package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {

    public static void main(String[] args) {

        /*

        Kullanicidan bir tamsayi aliniz.
        Tamsayi 100'den kucuk ise kullaniciya kaybettiniz mesaji vererek oyunu sonlandiriniz.
        Tamsayi 100 ve 100'den buyukse "Kazandiniz!" mesaji vererek oyuna devam ettiriniz.
         */

        Scanner input = new Scanner(System.in);

        int num = 0;

        do {
            System.out.println("Bir sayi giriniz");
            num = input.nextInt();

            if (num>=100){
                System.out.println("Kazandiniz!");
            }
        }while(num>=100); //while ici true ise en basa alir, oyun devam etsin tekrar bir sayi girin desin diye boyle

        System.out.println("Kaybettiniz!");

    }
}
