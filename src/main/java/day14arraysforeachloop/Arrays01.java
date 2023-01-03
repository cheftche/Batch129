package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile son elemanin
        //           icerdigi karakter sayilari toplamini ekrana yazdiriniz.

        String arr[] = new String[5];

        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";

        System.out.println(Arrays.toString(arr)); // [Math, Science, Music, English, Art]

        System.out.println(arr[0].length() + arr[arr.length-1].length()); //ilkinin ve sonuncunun karakter uzunlugu toplami
                         // Math(4 karakter)   Art(3)==> eleman sayisi eksi bir==> son index(arr[4])
        //String'lerdeki length() parantezli, Array'lerdeki length'de parantez() kullanilmaz.



        //Example 2: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //                  icerdigi karakter sayilari toplamini ekrana yazdiriniz.

        String brr[] = new String[5];

        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Frankfurt";
        brr[3] = "Dhaka";
        brr[4] = "Athena";

        //1.Yol: for-loop
        int totalChar = 0;

        for (int i = 0; i < brr.length; i++) {

            totalChar = totalChar + brr[i].length(); //eleman karakter sayisi eklenerek toplanir, dongu
        }
        System.out.println(totalChar); //Miami(5)+ Istanbul(8)+ Frankfurt(9)+ Dhaka(5)+ Athena(6) =33

        //2.Yol: for-each-loop(enhanced-zenginlestirilmis)==> baslangic degeri, loop'un calisma sarti ve increment/decrement kismini kendisi halleder
        //for-each-loop ==> "Array"lerde ve "Collection"larda kullanilir
        // index kullanmaniz gerektiginde bazen "for-each-loop" caresiz kalir, mecburen diger loop'lari kullaniriz

        //arraydeki eleman data tipi w: array ismi

        int sum =0;
                             //Miami, Istanbul, Frankfurt, Dhaka, Athena
        for (String w : brr){
            sum = sum + w.length();
        }
        System.out.println(sum); //33



    }

    }

