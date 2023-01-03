package day16multidimensionalarrays;

import java.util.Arrays;

public class Md04 {

    public static void main(String[] args) {

        //Example 1: Bir multi-dimensional array olusturunuz ve bir dimensionalli array donusturunuz.

        //- Arrayin toplam eleman sayısını bul
        //- Toplam sayısı uzunluğunda bir tek boyutlu array oluştur
        //- Döngü ile tek tek ekleme yap
        //          [ [2,5], [4,7,11] ] ==> [2, 5, 4, 7, 11]

        int a[][] = { {2,5}, {4,7,11} };
        System.out.println(Arrays.deepToString(a)); //[[2, 5], [4, 7, 11]]

        //"a" array'indeki toplam eleman sayisini bulunuz
        int totalElement = 0;

        for (int[] w: a){
            totalElement = totalElement + w.length; //a array'inde toplam eleman sayisi bulmak icin
        }

        //"b" isimli tek dimensional'li bir array olusturunuz
        int b[] = new int [totalElement];

        //"a" array'indeki elemanlari "b" array'ine transfer ediniz
        int idx = 0;

        for (int[] w: a){
            for (int k : w){
                b[idx] = k; //b array'ine git idx leri sirayla verilen sayilar yap
                idx++;
            }
        }
        System.out.println(Arrays.toString(b)); //[2, 5, 4, 7, 11]

    }
}
