package day05typecastingstringmanipulations;

import java.sql.SQLOutput;

public class StringManipulations02 {

    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //Example 1: "s" String'inin "money" ile bitip bitmedigini kontrol ediniz.
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd); //true
        boolean isEndd = s.endsWith("y");
        System.out.println(isEndd); //true

        //Example 2: "s" String'inin "money" kelimesini "dollar" kelimesine ceviriniz.
        String s1 = s.replace("money","dollar");
        System.out.println(s1); //Learn Java earn dollar

        //Example 23: "s" String'inin "earn" kelimesini "win" kelimesine ceviriniz.
        String s2 = s.replace("earn","win"); //javada coklu karakterler cift tirnak icine koyulur
        System.out.println(s2); //Lwin Java win money (Stringteki butun earn leri cevirir)

        //Example 4: "s" String'inin "a" harflerini "*" a ceviriniz.
        //Note: Replace method'unda coklu karakter calisirsaniz mecbur cift karakter kullanacaksiniz.
        //Ama tek karakterle calisirsaniz cift tirnak veya tek tirnak kullanabilirsiniz.
        //Note: Ama ya ikisi de cift tirnak olmalidir; yada ikisi de tek tirnak olmalidir.
        String s3 = s.replace('a','*');
        System.out.println(s3); //Le*rn J*v* e*rn money

        //Example 5: "s" String'inin "n" harflerini "xxx" a ceviriniz.
        String s4 = s.replace("n","xxx");
        System.out.println(s4); //Learxxx Java earxxx moxxxey

        //Example 6: "s" String'inin  tum "e" harflerini siliniz.
        //Note: "Hicbir sey" char data type'nda yoktur, bu yuzden replace() methodu kullanarak silme islemi yaparsaniz mutlaka cift tirnak kullaniniz
        String s5 = s.replace("e","");
        System.out.println(s5); //Larn Java arn mony


        String t = "Ali 13 yasindadir!...";
        // Note: Bir grup data' yi degistirmek icin replaceAll() methodu kullanilir.
        // Note: Bir grup datayi ifade etmek icin "Regular Expressions"(Regex) kullaniriz. [0-9] gibi gosterimler
        //Example 7: "t" String'inin  tum rakamlari(0,1,2,3,4,5,6,7,8,9) "*" a ceviriniz.
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1); //Ali ** yasindadir!...

        /*
        Meshur Regex'ler:
        1)Tum rakamlar ==> [0-9]
        2)Tum kucuk harfler ==> [a-z]
        3)Tum buyuk harfler ==> [A-Z]
        4)Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
        5)Tum harfler ve rakamlar ==> [a-zA-Z0-9]
        6)Tum noktalama isaretleri ==> \\p{Punct} ***Sadece bunu ezbere bil (punctuation ing noktalama demek)
        7)Tum sesli harfler ==> [aeiou]
          x, q, w harfleri ==> [xqw]
          8)Kucuk harflerden farkli tum character'ler ==> [^] den farkli anlami veriyor orn [^a-z] kucuk harflerden farkli demek
          9)Tum harflerden farkli tum character'ler ==> [^a-zA-Z]

         */

        //Example 8: "t" String'inin  tum rakamlari ve harfleri "!" ceviriniz.
        String t2 = s.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2); //!!!!! !!!! !!!! !!!!!

        //Example 9: "t" String'inin  tum sesli harfleri "?" ceviriniz.
        String t3 = s.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3); //L??rn J?v? ??rn m?n?y

        //Example 10: "t" String'inin kucuk harfler disindaki tum character'leri "<>" ceviriniz.
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);// <>li<><><><>yasindadir<><><><>

        //Example 11: "t" String'inin tum harfler disindaki tum character'leri "+" ceviriniz.
        String t5 = s.replaceAll("[^a-zA-Z]" , "+");
        System.out.println(t5); //Learn+Java+earn+money

        //Example 12: "t" String'inin space'ler disindaki tum character'leri "$" ceviriniz.
        String t6 = s.replaceAll("[^ ]" , "+");
        System.out.println(t6); //+++++ ++++ ++++ +++++

        //Example 13: "t" String'inin sesli harfler disindaki tum character'leri "&" ceviriniz.
        String t7 = s.replaceAll("[^aeiouAEIOU]" , "&");
        System.out.println(t7); //&ea&&&&a&a&ea&&&&o&e&















    }
}
