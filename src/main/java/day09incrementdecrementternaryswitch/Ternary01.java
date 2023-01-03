package day09incrementdecrementternaryswitch;

public class Ternary01 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int r1 = a<7 ? a++ : b++;

        System.out.println(r1); //20 //++b olursa eger 21 olur

        System.out.println(a); //10

        System.out.println(b); //21


        //Example 2:

        int r2 = a<b ? a++ : b++;

        System.out.println(r2); //10

        System.out.println(a); //11

        System.out.println(b); //20


        //Example 3:

        //Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        // -4 ==> -1*-4  4==>4   0==>0

        int c = -4;

        int r3 = c<0 ? -1*c : c;
        System.out.println(r3); //4

        //Example 4:
        //Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum"
        //mesaji veren kodu yaziniz.

        int m = 5;
        int n = 6;

        //"Object" Java'da butun "Non-primitive Data Type"(Class)larinin ortak "Parent"(Baba) idir.
        //"Object"in "Parent" i yoktur.
        //Farkli data type'lari icin ortak bir variable olusturmak istediginizde data type olarak object kullanabilirsiniz.
        //Java'da "Object", insanlik aleminde "Hz.Adem" e benzer.

        Object r4 = (m>0 && n>0) || (m<0 && n<0) ? m*n : "Farkli isaretli sayilari carpamiyorum";
        System.out.println(r4);

        //Example 5:
        //Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz.

        int p = -436;
        int r = Math.abs(p); //mutlak degeri hesaplatip ayri variable olusturduk

        String r5 = r>99 && r<1000 ? p + "uc basamaklidir" : p + "uc basamakli degildir";
        System.out.println(r5); //-436 uc basamaklidir




    }
}
