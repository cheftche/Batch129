package advanced_practice.practice02;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays_ElementSil {

    /*
     Elementlerini kullanıcıdan alarak bir integer Array oluşturunuz.
     Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
     */

    public static void main(String[] args) {

        //Elementlerini kullanıcıdan alarak bir integer Array oluşturunuz:
        Scanner input = new Scanner(System.in);
        System.out.println("Array limitini giriniz"); //5
        int limit = input.nextInt();
        int[] arr = new int[limit];

        for (int i=0; i<arr.length; i++){   //arr.length yerine limit de yazabiliriz
            System.out.println("indeks " + i + " degerini giriniz"); //indeks 0,1,2... degerini giriniz yazacak
            arr[i] = input.nextInt(); //alinan degerler array'e atanir
        }
        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 5]

        //Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz:
        //yeni bir array olusturup istemedigimiz elemani ona atariz

        System.out.println("Silmek istediginiz index'i giriniz");
        int indexSil = input.nextInt();

        int[] arr2 = new int[limit-1];
        int idx = 0;
        for (int i=0; i<limit; i++){
            if (i!=indexSil){
                arr2[idx] = arr[i]; //indexler farkli oldugundan yeni bir array olusturmaliyiz, uzunlugu ayni olsa gerek olmazdi
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr2));

    }
}
