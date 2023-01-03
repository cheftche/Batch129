package day11forloop;

public class ForLoop03 {

    //util:kullanmak demek. Util class'ta cok kullanilan methodlari koyunca zaman kazandirir.

    public static void main(String[] args) {

        //Example 1: Size verilen bir String'i tersten yazdiriniz. (Interview sorusu)

        String s = "Java";
        String t = "";

        for(int i = s.length()-1; i>=0; i--){

            t = t + s.charAt(i);
        }

        System.out.println(t); //avaJ  //{} icine yazdirirsak butun adimi yazdirir disina yazilirsa son halini yazdirir


        //Example 2: Size verilen bir String'in "Palindrome" olup olmadigini kontrol eden kodu yaziniz.(Bastan ve sondan okunusu ayni)
        //civic, nalan, kucuk, 11211 ==> Palindrome (Bu da interview sorusu)

        //Logic: String'i ters cevir, sonra da duz hali ile karsilastir, ayni ise " Palindrome" de.
        String duz = "civic";
        String ters = "";

        for(int i= duz.length()-1; i>=0; i--){

            ters = ters + duz.charAt(i);
        }

        if (duz.equalsIgnoreCase(ters)){
            System.out.println(duz + " polindrome'dur");
        }else{
            System.out.println(duz + "polindrome degildir");
        }





    }
}
