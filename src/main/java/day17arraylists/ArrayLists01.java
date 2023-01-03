package day17arraylists;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists01 {

    /*
    1) ArrayList(List)'ler coklu data depolamak icin kullanilir. (Array gibi)
    2) ArrayList'ler non-primitive data type'indeki coklu datalari depolamak icin kullanilir.
    ***List'ler "non-primitive" data kabul ederler, "Array"ler ise primitive data veya referance kabul ederler!!!
    3) ArrayList'leri olustururken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur.
    ***ArrayList'ler eleman sayisinda "flexible" dirlar, ama Array'ler "flexible" degildirler!!!
    4)Madem "Array"ler eleman sayisinda flexible degil, nicin Java "Array"leri iptal etmedi?
    i)Eleman sayisi belli olan data'lari depolamak icin Array'ler tercih edilir. Haftanin gunleri, ay sayisi gibi
    ii)Array'ler cok hizli calisir
    iii)Array'ler memory'de cok az yer kaplar.
     */

    public static void main(String[] args) {

        //List nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();
        //ArrayList class'i <wrapperclass non-primitive Integer> isim = new constructer<>();
        System.out.println(ages); // []


        //List'lere eleman nasil eklenir?
        //List ismi.add(ekle)methodu(eleman);

        //List'e eleman eklemek icin add() method'unu kullaniriz.
        //add() method'u elemanlari sizin verdiginiz sirada "list"e ekler. (Insertion Order) icine sokma sirasi saygisi :)
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(888); //sona eklemek icin normal add kullanilir

        ages.add(1,656); //verilen index'e verilen elemani atar
        ages.add(3, 777);
        System.out.println(ages); // [9, 656, 12, 777, 10, 888]

        //List'e coklu eleman nasil eklenir? veya List'e baska bir List nasil eklenir?
        //Bir "List" coklu eleman eklemek icin, o elemanlari once bir List'in icine koymalisiniz.
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges); //addAll en sona ekler, addAll index'li olan index'i verilen yere koyar
        ages.addAll(2, newAges); //yazdirirsak boyle cikar [9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]
        System.out.println(ages); //[9, 656, 12, 777, 10, 888, 8, 9, 10]

        //toArray() methodu: eleman sayisini degitirmeyecegimizden eminsek array' ye cevirip memory kullnimini azaltabiliriz

        //Bir List'teki tum elemanlari nasil silebilirim?
        //ages.clear(); //clear() method'u butun elemanlari siler
        //System.out.println(ages); //[]

        //contains() method'u bir elemanin List'te var olup olmadigini kontrol eder.
        boolean r = ages.contains(656);
        System.out.println(r); //true

        //Bir List'in baska bir List ile ayni olup olmadigini nasil kontrol ederiz?
        //Iki List'in esit olabilmesi icin ayni index'de ayni elemanlar olmalidir, sirasi da ayni olmalidir.
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("kim");
        names2.add("Jim");

        boolean s = names1.equals(names2);
        System.out.println(s); //false

        //Example 1: Verilen iki Integer List'te tamamiyla ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz.
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        //List'ler Collections yapisinin parcasi oldugundan bunun method'larini kullanabiliriz
        //Collections.sort() List'deki elemanları alıp küçükten büyüğe sıralar
        Collections.sort(nums1);
        Collections.sort(nums2);

        boolean t = nums1.equals(nums2);
        System.out.println(t); //true
    }
}
