package day16multidimensionalarrays;

import java.util.Arrays;

public class Md01 {

    public static void main(String[] args) {

        //dimensional ==> boyut demek

        //MultiDimensional Array nasil olusturulur?
        // a==> [[5,12][81,45][123,0]] Inner Array(0,1 index) - Outer Array (0,1,2 index)
        int a[][] = new int[3][2];

        //MultiDimensional Array nasil yazdirilir?
        System.out.println(Arrays.deepToString(a)); //[[0, 0], [0, 0], [0, 0]] dibine kadar yazdir demek

        //MultiDimensional Array'lere eleman nasil yazdirilir?
        a[0][0]=5;
        a[0][1]=12;
        a[1][0]=81;
        a[1][1]=45;
        a[2][0]=123;
        a[2][1]=0;
        System.out.println(Arrays.deepToString(a)); // [[5, 12], [81, 45], [123, 0]]

        //Note: Array'lere non-primitive data konulamaz.
        //      Array'lere primitive data veya referance koyulur.
        //      Array'i yazdirmak istediginizde Java adres(referance)ler sayesinde non-primitive data'ya ulasir
        //      ve o non-primitive data'yi sanki array'in icindeymis gibi gosterir.

        //MultiDimensional Array'lerdeki belli elemanlara nasil ulasilir?
        System.out.println(Arrays.toString(a[2])); //[123, 0]
        System.out.println(a[1][0]); //81  String'lerde adres olmadigindan direk yazilir
        System.out.println(Arrays.toString(a[0])); //[5, 12]
        System.out.println(a[2][1]); //0






    }
}
