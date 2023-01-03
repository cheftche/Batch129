package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {

        /*
        Example 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                    i)En az 8 character olsun.
                    ii)Space character' i password'de olmasin.
                    iii)En az 1 adet buyuk harf olsun.
                    iv)En az 1 adet kucuk harf olsun.
                    v)En az 1 adet sembol olsun.
                    vi)En az 1 adet rakam olsun.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String pwd = input.nextLine();

        //i)En az 8 character olsun.
        boolean first = pwd.length()>7; //javaya cok is yaptirmak istemiyoruz yavaslar >=8 kullanmak yerine >7 yapiyoruz
        System.out.println(first); //en az 8 karakter girersek true der

        //Space character'i password'de olmasin.
        boolean second = !pwd.contains(" "); //space karakteri icermesin demek, ! olumsuz/not anlami veriyor (true)
        System.out.println(second);

        //ii)En az 1 adet buyuk harf olsun.
        //Note: Buyuk harf olmayanlari sil, kalan character sayisina bak, character sayisi 0(sifir) ise
        // // buyuk harf yok demektir, 0(sifir) dan buyuk ise buyuk harf var demektir.
        boolean third = pwd.replaceAll("[^A-Z]" , "").length()>0;//Method'lari ayni satirda yanyana kullanmaya "Method Chain" denir.
        System.out.println(third);                                               //length() methodu uzunluga bakar ve verilen ozelligi arar

        //iii)En az 1 adet kucuk harf olsun.
        boolean fourth = pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println(fourth); //cd ==> 2>0 oldugundan true verir


        //iv)En az 1 adet sembol olsun. (harf ve rakam harici her sey demektir) (space de semboldur)
        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]" , "").length()>0;
        System.out.println(fifth);

        //v)En az 1 adet rakam olsun.
        boolean sixth = pwd.replaceAll("[^0-9]" , "").length()>0;
        System.out.println(sixth);

        System.out.println("Password gecerli mi?" + (first && second && third && fourth && fifth && sixth));//hepsini karsiliyorsa password true




    }
}
