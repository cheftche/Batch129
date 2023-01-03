package day08nestedifternary;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1: Kullanicidan iki sayi aliniz "buyuk olmayan(kucuk veya esit olan) sayiyi yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Iki sayi giriniz...");
        double a = input.nextDouble();
        double b = input.nextDouble();

        //1.Yol
        if (a < b) {
            System.out.println(a);
        }else{
            System.out.println(b);
        }

        //2.Yol: "Ternary", if else 'in yaptigi isi yapar sadece soz dizimi farklidir. Lutfen cay getirir misin yerine Cay diyoruz
        //            Condition  ?  Condition true ise calisir    : Condition false ise calisir
        //double result = a<b      ?               a                :            b;                 //a ve b ikisi de double oldugundan double konteyner olusturup gelen datayi onun icine koyariz
        double result = a<b ? a : b;
        System.out.println(result);
    }
}
//Data artirmanin islemine Increment(Artirma-Artis) denir. int x = 10 x=x*4 x==40 :)
//Azaltma islemi (Decrement)
//a = a+2 == a+=2 ayni seydir
//x = x*4 == x*=4
// b = b-3 == b-=3
//y = y/3 == y/=3
// m= m+1; == m+=1; == m++; (sadece 1 ile artirmada kullanilir)
//n = n-1; == n-=1; == n--;