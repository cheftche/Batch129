package day11forloop;

public class ForLoop01 {

    public static void main(String[] args) {

        //Example 1:Verilen bir String'te ilk 'a' harfinden inceki tum character'leri konsola yazdiriniz.
        //          "I love Java ==> "I love J" olmali
        //String s = "I love Java"; //index length-1

        String s = "Tramvay";

        for (int i=0; i<s.length(); i++ ){
            char ch = s.charAt(i);

            if (ch=='a'){
                break;
            }
            System.out.print(ch); //I love J | Tr

        }

        System.out.println();

        //Example 2: Verilen bir String'te verilen son 'a' dan sonraki tum character'leri tersten yazdiriniz.
        //           "Germany" ==> yn
        String t = "Germany";

        for (int i=t.length()-1; i>=0; i--){
            char ch = t.charAt(i);

            if (ch=='a'){
                break;
            }
            System.out.print(ch);
        }

    }
}
