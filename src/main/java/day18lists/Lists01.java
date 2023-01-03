package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {

    public static void main(String[] args) {

        //Example 1: Integer bir Liat olusturunuz.
        //           List'e 5 tane eleman ekleyiniz.
        //           Bu elemanlardan 12'yi siliniz.

        List<Integer> ages = new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(12);

        //Note: Siz Java'da tam sayi yazdiginizda, Java o tam sayinin data type'ini otomatik olarak "primitive int" kabul eder.
        //      Bu yuzden remove() method'unun icine yazdiginiz tamsayi eleman olarak degl index olarak kabul edilir.
        //      Tam sayi'yi eleman olarak gostermenin birkac yolu vardir.

        //1.Yol:
        //Integer nonPrimitive = 12; //primitive 12'yi non-primitive(wrappper class) Integer'a koyduk
        //ages.remove(nonPrimitive);

        //2.Yol:* recommended
        ages.remove((Integer)12);

        //3.Yol:
        //ages.remove(Integer.valueOf(12)); //primitive 12'yi non-primitive(wrappper class) Integer'a koyduk

        //4.Yol:
        //ages.remove(ages.indexOf(12)); //12'yi bulacak index'ini verecek sonra remove da o index'e gidip silecek

        System.out.println(ages); // [10, 25, 8, 12] remove methodu sadece ilkini siler aynisindan baska varsa birakir


        //Example 2: Integer bir Liat olusturunuz.
        //           List'e 5 tane eleman ekleyiniz.
        //           Bu elemanlardan tum 12'leri siliniz.

        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);

        List<Integer> silinecekler = new ArrayList<>();
        silinecekler.add(12);

        //removeAll() method'u List ile calisir.
        //removeAll() method'u bir veya birden falza elemanin tum gorunumlerini silmek icin kullanilir
        nums.removeAll(silinecekler); //removeAll() kullanmak icin yeni bir array olusturup silmeyi dusunduklerimizi onun icine koymamiz gerekiyor

        System.out.println(nums); // [10, 25, 8]

        //method'lar hakkinda bilgiyi ctrl ye basili tutup methodun usutune gelince link oluyor na basinca gorursun





    }
}
