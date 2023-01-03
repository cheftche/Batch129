package day03scanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Kullanicidan adresini aliniz ve ekrana yazdiriniz.
        Scanner input = new Scanner(System.in);

        //nextLine() method'u kullanicidan cok kelimeli String almak icin kullanilir.
        System.out.println("Lutfen adresinizi giriniz...");
        String adress = input.nextLine();
        System.out.println(adress); //Parkland Miami USA

    }
}
