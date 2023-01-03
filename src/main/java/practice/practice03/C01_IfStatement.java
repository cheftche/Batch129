package practice.practice03;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        /*
        Kullanicidan bir gun alin
        Eger gun cuma ise "Muslumanlar Icin Kutsal Gun";
        Eger gun cumartesi ise "Yahudiler Icin Kutsal Gun";
        Eger gun pazar ise "Hristiyanlar Icin Kutsal Gun" yazdiran kodu olusturunuz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz...");
        String gun = input.next().toLowerCase(); //kucuk harfe cevirdik

        if(gun.equals("cuma")){           //string lerde bu buna esittir demek icin equals() kullaniyoruz
            System.out.println("Muslumanlar Icin Kutsal Gun");
        }else if(gun.equals("cumartesi")){
            System.out.println("Yahudiler Icin Kutsal Gun");
        }else if(gun.equals("pazar")){
            System.out.println("Hristiyanlar Icin Kutsal Gun");
        }else
            System.out.println("Kutsal Gun Degil");





    }

}
