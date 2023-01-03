package day04memorykullanimwrapperclassascii;

public class C03_MantikOperatorleri {

    //10< sayi Mantik Operatoru sayi<20;
    //==Esittir icin cift == kullanilir, =tek esittir atama (assignment) yapar

    /*
    Java uclu karsilastima kabul etmez.
    Ikili karsilastirmalar yapip Mantik Operatorleriyle birlestirmeliyiz

    && == and (ve) operatoru and ||== or operatoru (veya demek)
    != esit degildir demek
    && ile &
    &&`de boolean sonucta bir tane false bulunca durur
    &`de ise tum satiri tarar sonra durur. Bu da &&`nin &`den daha hizli calismasini saglar.

    Cay ve Limon
     +  &&  +    = true (butun sartlarin olmasi gerekir true donmes icin)
     +  &&  _    = false
     -  &&  +    = false
     -  &&  -    = false

   || veya operatoru Polyannacidir. En ufak bir pozitiflikten true doner
   Cay   veya    Limon
    +     ||      +    = true
    +     ||      -    = true
    -     ||      +    = true
    -     ||      -    = false

     */

    public static void main(String[] args) {

        System.out.println(5+2==8); // false

        boolean sonuc1 = 5>4 && 7<9 && 6+3 == 9 && 5+2 !=8;
        System.out.println(sonuc1); //true

        boolean sonuc2 = 5>4 && 7>9 && 6+3 ==9 && 5+2==7; //false
        System.out.println(sonuc2);

        int sayi1 = 15;
        System.out.println(10<sayi1 && sayi1<20); //true

        int sayi2 = 5;
        System.out.println(sayi2<10 || sayi2>20); //true


    }
}
