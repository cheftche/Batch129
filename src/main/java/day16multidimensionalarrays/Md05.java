package day16multidimensionalarrays;

import java.util.Arrays;

public class Md05 {

    public static void main(String[] args) {

        //Example 1: Bir integer multi-dimensional array olusturun
        //           Bu array'deki tum elemanlarin carpimini console'a yazdiran kodu yaziniz.

        int a[][] = { {2,5}, {4,7,11} };
        System.out.println(Arrays.deepToString(a)); //[[2, 5], [4, 7, 11]]

        int carpim = 1;

        for (int[] w : a){
            for (int k : w){
                carpim = carpim * k;
            }
        }
        System.out.println(carpim); //3080

    }
}
