package advanced_practice.practice02;

import javax.crypto.spec.PSource;

public class Q01_Ascii_AdiniYaz {

    //Adınızın içerdiği harfleri ve ascii table'a bakmadan, adınızı yazdıran bir kod yazınız. //Ali

    public static void main(String[] args) {

        char ch1 = 'B'-1; //A'nin ascii degerini verir 66-1
        char ch2 = 'm'-1; // l'nin ascii degeri
        char ch3 = 'h'+1; // veya 'j'-1

        //Not: Char'lari matematik islemine tabii tutarsak ascii degerlerinden matematik islemi yapmis olur
        System.out.println(ch1+ch2+ch3); //278
        System.out.println('Z'+1); //91

        //Not: Char'lari eger string (concatation) islemine tabii tutarsak sonuc asagidaki gibi olur
        System.out.println("" +ch1+ch2+ch3); //char'lari matematik islemine tabii tutunca ascii degerlerini alip isleme koyar "" koyarsak concat yapip yanyana yazar
        //Ali

        //Not: Char bir degiskene deger atarsak bize ascii karsiligini verir
        char ch4 = 65; //A
        char ch5 = 65+1;// B

    }
}
