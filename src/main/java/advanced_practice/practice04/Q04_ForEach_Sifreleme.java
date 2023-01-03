package advanced_practice.practice04;

import java.util.Scanner;

public class Q04_ForEach_Sifreleme {

    /*Kullanıcıdan alınan bir String'de bulunan her bir karakteri alfabetik sırada bir sonraki karakter ile değiştirerek
    şifreleyen bir method ve şifreli ismi çözen ayrı bir method yazınız. (foreach loop kullanınız)*/

    public static void main(String[] args) {

        System.out.println(sifreleme());

        System.out.println(sifreCoz());

    }
    public static String sifreleme() {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir String giriniz"); //a, b ,c
        String[] arr = input.nextLine().split(""); //for each loop ta kullanmak icin String degeri Array yada List'e cevirmek gerekir, split method'u array doner
        //{"a", "b", "c"} verir

        String sifreliString = "";
        for (String w : arr) {

            if (w.equals("z")) {
                sifreliString += "a";
            } else if (w.equals("Z")) {
                sifreliString += "A";
            } else {
                sifreliString += (char) (w.charAt(0) + 1); //char degerini matematik islemine sokarsak ascii degerini kullanir, tekrar char'a cevirmek icin typecasting yapariz (char) ile
            }
        }
        return sifreliString;
    }

    //ayni islemi tersten yapan method, sifrelenmis halini normal haline ceviriyor
    public static String sifreCoz() {
        Scanner input = new Scanner(System.in);
        System.out.println("Şifreli String'i giriniz");
        String[] arr = input.nextLine().split("");// {".", ".", "." ... }
        String SifresizString = "";

        for (String w : arr) {
            if (w.equals("a")) {
                SifresizString += "z";
            } else if (w.equals("A")) {
                SifresizString += "Z";
            } else {
                SifresizString += (char) (w.charAt(0) - 1);
            }
        }
        return SifresizString;
    }
}

//Odev: Normal forloop ile ==>

/*
    System.out.println(siFrele());


}
public static String siFrele(){
    Scanner sc =new Scanner(System.in);
    System.out.println("Kullanmici String Gir");
    String cml=sc.nextLine();

    String sifreli="";

    for(int i=0;i<cml.length();i++){
        char k=(char)(cml.charAt(i)+1);
        sifreli=sifreli+k;

    }
    return sifreli;
}
 */


