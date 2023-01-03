package day08nestedifternary;

import java.util.Scanner;

public class NestedIf02 {

    public static void main(String[] args) {

        //Example 2: Kullanicidan bir ucgenin kenar uzunlugunu aliniz.
        //Uc kenari birbirine esites "Eskenar Ucgen" yazdiriniz.
        //Sadece iki kenar uzunlugu birbirine esit ise "Ikizkenar Ucgen"
        //Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlari icin 3 tane uzunluk giriniz...");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        boolean ucgenMi = ((a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c)));

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Gecerli kenar uzunlugu giriniz...");
        }else if (ucgenMi){

            if(a==b && b==c && a==c){
                System.out.println("Eskenar ucgen");
            }else if (a==b || b==c || a==c){
                System.out.println("Ikizkenar ucgen");
            }else{
                System.out.println("Cesitkenar ucgen");
            }

        }else{
            System.out.println("Ucgen degil...");
        }

    }

}
