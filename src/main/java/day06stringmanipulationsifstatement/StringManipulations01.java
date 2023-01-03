package day06stringmanipulationsifstatement;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Bir String' in bas ve sonunda space character'i varsa siliniz.
        //"    Ali Can   "  ==> "Ali Can" space'leri silicez

        String s = "   Ali Can  "; //basinda 3 sonunda 2 space yapan kullanici hatasi var onu duzelticez
        System.out.println(s); //   Ali Can

        //trim() method'u bir String'in bas ve sonundaki space character'lerini siler, aradaki space'lere dokunmaz
        String sTrimmed = s.trim(); //trim kirpmak demek
        System.out.println(sTrimmed); //Ali Can

        //Example 2: Asagidaki fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv = "$456.99";  String laptop = "$875.99; ==> 456.99 + 875.99 = 1332.98
        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$", ""); //dolar isaretini siliyoruz
        System.out.println(tv2); //456.99 ==> Ondalik sayilar Java'da otomatik olarak double kabul edilir.

        String laptop2 = laptop1.replace("$", "");
        System.out.println(laptop2); //875.99

        //valueOf() method'u ile String "456.99" degerini Double 456.99'a cevirdik toplamak icin
        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2); //String toplayamayiz, wrapper class olarak Double'a cevirdik ve topladik
        System.out.println(totalPrice); //1332.98

        //Example 3: Verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //           "Ali Can" ==> AC
        String name = "   ali CAN  ";

        char first = name.trim().toUpperCase().charAt(0); //once space sildik, sonra butun harfleri buyuk harf yaptik, sonra da ali can'in ilk harfini aldik char(0) ile
        System.out.println(first); //A

        //split() ==> parcalamak methodu' ayirinca 0-1.. diye boler kelimeleri, hangisini istedigimizi yazmaliyiz, ikinci kelime icin 1 yazdik.
        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second); //C

        System.out.println("" + first + second);//AC normalde string old icin ascii degerlerini toplar, basina "" ekleyince yazi olarak yazar.

        //Example 4: Bir String'in hic character icermedigini(bos String) kontrol eden kodu yaziniz.
        String str = "";

        //1.Yol: length() kullan, String'te character sayisini verir.
        boolean result1 = str.length()==0;
        System.out.println("String bos mu?" + result1); //true

        //2.Yol: isEmpty() kullan. bunu oncelikli tercih et cunku Java zaten buna ozel method olusturmus
        boolean result2 = str.isEmpty();
        System.out.println("String bos mu?" + result2); //true

        //Example 5: Bir String'in space haric hicbir character icermedigini kontrol eden kodu yaziniz.
        String t = "     ";

        //1.Yol
        boolean result3 = t.replace(" ", "").length()==0;
        System.out.println("Sadece space mi var?" + result3); //true

        //2.Yol
        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println("Sadece space mi var?" + result4);

        //3.Yol
        // isBlank() method'u sadece space iceren String'ler icin true verir. Space disinda bir character icerirse false verir.
        // isBlank() methodu bos String'ler icin de true verir.
        // isBlank() ==> space + hicbir sey icin true   isEmpty ==> hicbir sey icin true
        boolean result5 = t.isBlank();
        System.out.println("Sadece space mi var?" + result5); //true

        //Example 6: Bir String'te a,e,i character'lerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        //           "Java is easy to learn" ==> 1+5+8 =14 olmasi lazim 0 dan baslayip harfleri siralayinca harflerin ilk gorundugu sayiyi aliriz
        String r = "Java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA); //1

        int idxI = r.indexOf('i');
        System.out.println(idxI); //5

        int idxE = r.indexOf('e');
        System.out.println(idxE); //8

        System.out.println("Index'ler toplami? " + (idxA + idxI + idxE)); //14

        //Example 7: Bir String'te "Java" kelimesinin ilk olarak kacinci index'de kullanildigini gosteren kodu yaziniz.
        //           "Ah Java vah Java sensiz olmuyor Java." ilk 3.indexte baslanmis

        String u = "Ah Java vah Java sensiz olmuyor Java.";

        //indexOf("Java") kullaniminda siz "Jva" kelimesinin ilk gorunumundeki ilk harfin(Yani J'nin) index'ini almis olursunuz.
        int idxJava = u.indexOf("Java");
        System.out.println(idxJava); //3

        // indexOf() method'u, olmayan character'ler icin kullanilirsa her zaman "-1" verir.
        int idxOfXyz = u.indexOf("xyz");
        System.out.println(idxOfXyz); //-1

        //Example 8: Bir String'te a'e'i character'lerinin "son" gorunumlerinin index'leri toplamini yaziniz.
        //"Java is easy to learn" ==> 18+5+17 =40 olmasi lazim 0 dan baslayip harfleri siralayinca harflerin ilk gorundugu sayiyi aliriz

        String v = "Java is easy to learn";
        int idxOfA = v.lastIndexOf('a');
        System.out.println(idxOfA); //18

        int idxOfI = v.lastIndexOf('i');
        System.out.println(idxOfI); //5

        int idxOfE = v.lastIndexOf('e');
        System.out.println(idxE); //17

        System.out.println(idxA + idxI + idxE); //40

        //Note:lastIndexOf() String olmayan bir character icin kullanilirsa her zaman "-1" verir.

        //Example 9: Bir String'teki tekrarsiz character'leri ekrana yazdiriniz.
        //           abbccdc == ad

        String y = "aac";
        char ch1 = y.charAt(0);
        if (y.indexOf(ch1) == y.lastIndexOf(ch1)){
            System.out.println(ch1); //a yazmaz
        }

        char ch2 = y.charAt(1);
        if(y.indexOf(ch2) == y.lastIndexOf(ch2)){
            System.out.println(ch2); // a yazmaz
        }

        char ch3 = y.charAt(2); //index'i 2 olan c'yi verir
        if(y.indexOf(ch3) == y.lastIndexOf(ch3));{
            System.out.println(ch3); //dogru old icin' c yazar
        }


        //Note: Bazi kodlarin bazi sartlara bagli olarak calismasi gerekir.
        //      Bazi kodlari bazi sartlara gore aktive etmez icin "if statement"(if cumlesi) kullanilir.
        //      if you study hard, you will learn Java.


        //Example 10: Sayi pozitif ise ekrana cift yazdirin.
        int num = 12;
        if(num>0){
            System.out.println("Pozitif");
        }

        //Example 11: Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdirin.
        int number = 3;
        if(number>-1 && number<10){
            System.out.println("Rakam");
        }

        //Example 12: Sayi 3 basamakli ise ekrana "Wooow! yazdirin.

        int n = 234;
        n = Math.abs(n); //Absolute mutlak deger kisaltmasi abs, -234 de 3 basamakli sayidir ornegin
        if(n>99 && n<1000){
            System.out.println("Wooow!");
        }

    }
}
