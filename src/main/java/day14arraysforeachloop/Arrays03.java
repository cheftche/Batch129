package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Example 1: String bir Array olusturunuz, 6 tane eleman yerlestiriniz, character sayisi 5'ten cok olan elemanlari siliniz.

        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        System.out.println(Arrays.toString(colors)); // [Red, Orange, Blue, Yellow, Green, Brown]

        //Logic: Yeni bir array olusturup, character sayisi 5 ve 5'ten kucuk olan elemanlari yeni array'e transfer edecegiz.
        //Boylelikle yeni array'de character sayisi 5'ten buyuk olan hicbir eleman olmayacak.

        //Soru: Array olusturmak icin iki sey belirlenmelidir.
        //     1)Elemanlarin data type'i
        //     2)Yeni array'de kac tane eleman olacak

        //Verilen array'de eleman sayisi 5 ve 5'ten kucuk olan kac eleman var bulmaliyiz.

        int counter = 0;
                                  // [Red, Orange, Blue, Yellow, Green, Brown]
        for (String w : colors){  //bu kisimda karakter sayisi 6'dan kucuk kac eleman var ona bakiyor
            if (w.length()<=5){
                counter++; //4
            }
        }

        //Yeni array olustur
        String newColors[] = new String[counter]; //eleman sayisi 4 olan bir array olusturduk [null, null, null ,null]

        //Character sayisi 5 ve 5'ten kucuk olanlari yeni array'e transfer et
        int idx = 0;
                                // [Red, Orange, Blue, Yellow, Green, Brown]
        for (String w : colors){
            if (w.length()<5){
                newColors[idx] = w; //red'i ve kosullari karsilayan digerlerini, yeni arrayde index'i 0 olana ve diger indexlere koy
                idx++;
            }
        }
        System.out.println(Arrays.toString(newColors)); // [Red, Blue, Green, Brown]

    }
}
