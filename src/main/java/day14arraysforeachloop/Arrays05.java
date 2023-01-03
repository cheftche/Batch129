package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05 {

    public static void main(String[] args) {

        //Note  : sort() method'u sayisal data type'larini kucukten buyuge siralar (ascending order)
        //Note 2: sort() method'u String data type'larini alfabetik olarak siralar (alphabetical order)
        //Note 3: ascending order + alphabetical order ==> Natural Order
        //Note 4: sort() method'u array elemanlarini "Natural Order" a gore siralar

        //Note 5: binarySearch() method'u bir elemanin bir array'de olup olmadigini kontrol etmek icin kullanilir
                                                                  //String'lerde contains() ile ayni
        //        binarySearch() method'nu kullanmadan once sort() method'unu kullanmak zorundayiz
        // sort() method'unu kullanmazsaniz sonuc guvenilir olmaz

        String color[] = new String[6];
        color[0] = "Red";
        color[1] = "Orange";
        color[2] = "Blue";
        color[3] = "Yellow";
        color[4] = "Green";
        color[5] = "Brown";

        Arrays.sort(color);

        System.out.println(Arrays.toString(color)); // [Blue, Brown, Green, Orange, Red, Yellow]

        int num1 = Arrays.binarySearch(color, "Blue");

        System.out.println(num1); //0 ==>Var hem de index'i sifir


        int num2 = Arrays.binarySearch(color, "Orange");

        System.out.println(num2); //3 ==>Var hem de index'i 3

        int num3 = Arrays.binarySearch(color, "Tarik");

        System.out.println(num3); //-6 ==> "-" bu eleman yok demek
                                  //       "6" ise olsaydi 6.eleman olurdu demek

        //interview'lerde hep array sorarlar!!!!

        //binarySearch() olan elemanlarda index verir, olmayanlarda kacinci eleman oldugunu verir

    }
}
