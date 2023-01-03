package day13whileloopdowhileloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        //Bu yapinin icinde sadece bir tane data depolanabilir
        //Ama biz kod yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz
        //Bir yapinin icinde coklu data depolayabilmek icin Java "Array" yapisini olusturmustur.

        //IT'de ogrenme adimlari:
        //What?
        //Why?
        //Simple Implementation (basit uygulama)
        //Mid level...
        //Advance level...
        //Project


        //Array nasil olusturulur?
        //Array olusturmak icin Array elemanlarinin data type'i ve eleman sayisi mutlaka yazilmalidir.
        String stdNames[] = new String[5]; //   [] ile yapariz

        //Array console'a nasil yazdirilir?
        //toString() methodu kullanmadan sadece array ismi ile yazdirirsaniz Java o Array'in adresini yazdirir.
        System.out.println(Arrays.toString(stdNames)); // [null, null, null, null, null] ==> null,null,Ajda(2.index),null,null

        //Array'e eleman ekleme nasil yapilir?
        stdNames[2] = "Ajda";
        //System.out.println(Arrays.toString(stdNames)); // [null,null,Ajda(2.index),null,null]

        stdNames[0] = "Cuneyt";
        stdNames[1] = "Kemal";
        stdNames[3] = "Ezel";
        stdNames[4] = "Besir";
        System.out.println(Arrays.toString(stdNames)); // [Cuneyt, Kemal, Ajda, Ezel, Besir]


        //Array'den specific bir elemani almak
        System.out.println(stdNames[2]); //Ajda

        //Example: Array'deki her elemani sonuna "!" isareti koyarak ekrana yazdiriniz.
        for (int i=0; i< stdNames.length; i++){
            System.out.println(stdNames[i] + "!");

        }
    }
}
