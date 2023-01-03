package day08nestedifternary;

import java.util.Scanner;

public class NestedIf03 {

    public static void main(String[] args) {

        /*
        Password' un ilk harfi buyuk harf ise
        'A' olursa gecerli password yazdirin, degilse gecersiz password yazdirin.
        Alemci ==> Gecerli

        Password'un ilk harfi kucuk harf ise;
        'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
        zehirli ==> Gecerli
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Passwordunuzu giriniz...");
        String pwd = input.nextLine();

        char firstChar = pwd.charAt(0); //Bir methodu cok fazla kullanmak gerektiginde onu bir variable yapin ve o sekilde kullanin. Daha hizli calisir.

        if (firstChar>='A' && firstChar<='Z'){          //char da matematiksel islem yaparsak ascii degerini kullanir

            if (firstChar=='A'){
                System.out.println("Gecerli Password");
            }else{
                System.out.println("Gecersiz Password cunku buyuk harf ama 'A' degil...");
            }

        }else if (firstChar>='a' && firstChar<='z'){

            if (firstChar=='z'){
                System.out.println("Gecerli Password");
            }else{
                System.out.println("Gecersiz password cunku kucuk harf ama 'z' degil...");
            }

        }else{
            System.out.println("Ilk character harf olmali");
        }




    }

}
