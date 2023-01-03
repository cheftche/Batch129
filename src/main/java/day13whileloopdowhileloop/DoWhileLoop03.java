package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {


    /*
    Gecerli Username = "admin" ve Password= "pwd123"
    Kullanicidan username ve password' u alin
    Username ve password dogru ise console'a "Hesabiniza hosgeldiniz" yazdirin
    Username ve password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin.
    Username ve password 4.kere yanlis girilirse "hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz.

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 0; //counter sayac kac kere deneme yaptik gosterir

        do {
            if (counter == 4) {
                System.out.println("Hesabiniz bloke olmustur");
                break;
            }

            System.out.println("Username'i giriniz...");
            String username = input.next();

            System.out.println("Password'u giriniz");
            String password = input.next();

            if (username.equals("admin") && password.equals("pwd123")) {
                System.out.println("Hesabiniza hosgeldiniz!");
                break;
            }
            counter++;

        }while(true);

        //do-while ==> once calis sonra sarti kontrol et

    }
}
