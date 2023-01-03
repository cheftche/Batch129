package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {

    public static void main(String[] args) {

        //Example 1: String Array elemanlarini character sayisina gore kucukten buyuge siralayiniz.
        //           ["Michael", "Ajda", "Thomas", "Tom"] ==> ["Tom", "Ajda", "Thomas", "Michael"]

        String arr[] = {"Michael", "Ajda", "Thomas", "Tom"};

        Arrays.sort(arr, Comparator.comparingInt(String::length)); //comparator olan sort, karsilastirici, array'in elemanlarini verilen kurala gore sirala
        //String class'a git uzunluguna bak ve karsilastir

        System.out.println(Arrays.toString(arr)); //[Tom, Ajda, Thomas, Michael]


        //Exampe 2: String Array elemanlarini character sayisina gore buyukten kucuge siralayiniz.
        //          ["Michael", "Ajda", "Thomas", "Tom"] ==> ["Michael", "Thomas", "Cuneyt", "Ajda", "Tom"]

        String brr[] = {"Michael", "Ajda", "Thomas", "Tom", "Cuneyt"};

        Arrays.sort(brr, Comparator.comparingInt(String::length).reversed()); //reverse ters cevirmek demek
        System.out.println(Arrays.toString(brr)); //[Michael, Thomas, Cuneyt, Ajda, Tom]


        //Example 3: String Array elemanlarini character sayisina gore buyukten kucuge siralayiniz.
        //           Ayni character sayisinda olanlari da alfabetik siraya koyunuz.
        //["Michael", "Ajda", "Reyhane", "Gabriel", "Thomas", "Tom", "Ali", "Cin", "Cuneyt", "Cem"]
        //["Gabriel", "Michael", "Reyhane", "Thomas", "Cuneyt", "Ajda", "Ali", "Cem", "Cin", "Tom"]

        String crr[] = { "Michael", "Ajda", "Reyhane", "Gabriel","Thomas", "Tom", "Ali", "Cin", "Cem", "Cuneyt" };
        System.out.println(Arrays.toString(crr));

        Arrays.sort(crr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr));                          //alfabetik siralama yapar bu method

        //Java'daki method'lari kullanmak ==> functional programming
    }
}
