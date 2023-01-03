package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    public static void main(String[] args) {

        //Example 1: Kullanici ile beraber bir array olusturunuz.

        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz");
        int numOfElements = input.nextInt();

        String stdNames[] = new String[numOfElements]; //array olusturma sebebi isimleri bunun icine koyucaz

        //her ogrenci icin tekrar islem yapicaz, tekrarli islemler icin loop kullanilir
        for (int i=1; i<=numOfElements; i++){

            System.out.println("Lutfen " + i + ". ogrencinin adini giriniz");//Lutfen 1. ogrencinin adini giriniz
            System.out.println("Girisi sonlandirmak icin Q tusuna basiniz...");
            String stdName = input.next();

            if (stdName.equalsIgnoreCase("Q")){
                break;
            }
            stdNames[i-1] = stdName; //forloop 1 den basliyor index 0'dan baslamasi icin i-1
        }

        System.out.println(Arrays.toString(stdNames));



    }
}
