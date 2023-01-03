package advanced_practice.practice01;

import java.util.Scanner;

public class Q02_Variable_Hipotenus {

    //Hipotenüs hesaplayan bir kod yazınız.

    public static void main(String[] args) {

        //a2 + b2 = c2 dik ucgen hipotenusu

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci dik kenar uzunlugunu giriniz");
        int a = input.nextInt();

        System.out.println("Ikinci dik kenar uzunlugunu giriniz");
        int b = input.nextInt();

        //c = a2 + b2 nin karekoku     Math.sqrt() methodu karekok alir
        double c = Math.sqrt(a*a + b*b); //hipotenus degeri

        System.out.println("Hipotenus =" + c);


    }
}
