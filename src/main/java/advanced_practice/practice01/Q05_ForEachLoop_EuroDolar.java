package advanced_practice.practice01;

import java.util.Arrays;

public class Q05_ForEachLoop_EuroDolar {

    /*
    Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarıni bulan bir kod yazınız.
    Ornek:
    String str ="$1 $12 €34 €56 $45 €78";
    dolarToplami: 58
    euroToplami: 168
     */

    public static void main(String[] args) {

        String str ="$1 $12 €34 €56 $45 €78";

        String[] arr = str.split(" "); //once aradaki bosluklardan tek hallerine ayiririz/ split() methodu Array sonuc verir
        System.out.println(Arrays.toString(arr)); // [$1, $12, €34, €56, $45, €78]

        int dolarToplam = 0;
        int euroToplam = 0;

        for (String w : arr){
            if (w.contains("$")){
                dolarToplam += Integer.parseInt(w.replaceAll("\\D","")); //dolar isaretini kaldir integer'a cevir dolarToplam'ina ekle
            }else {                                                                    //parseInt'in valueOf'tan farki primitive yapiyor
                euroToplam += Integer.parseInt(w.replaceAll("\\D",""));
            }
        }
        System.out.println("dolarToplam =" + dolarToplam); //58
        System.out.println("euroToplam =" + euroToplam); //168

    }
}
