package day10switchloops;

public class Loops01 {

    /*
    Code Standarts:
    1) Tekrar(Repetition) olmamalidir.
    2) Dynamic olmalidir. Degisimi kolay ustune ekleme cikarma vs.
    3) Fix(Tamir) ve update-maintenance(gelistirme) kolay yapilabilmelidir.
     */

    public static void main(String[] args) {

        //Example 1: Ekrana 5 kere "Hi" yazdiriniz.

        //1.Yol: Tavsiye edilmez.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2.Yol:
        //Ayni adimlar tekrar tekrar yapilmasi gerektiginde "Loop" lar kullanilir.
        //Dort tane Loop var; i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop

        //for-loop:
        //  Baslangic degeri      Loop'un calisma sarti    Increment/Decrement
        for(      int i=1       ;     i<6               ;         i++         ){
            System.out.println("Hi"); //5 tane Hi yazdirir

        //Example 2: 11,den 44'e kadar tum tamsayilari ekrana yazdiran kodu yaziniz.
            for (int ii=11 ; ii<45 ; ii++) {
                System.out.println(ii);
            }

        //Example 3: 40'dan 23'e kadar tum cift tam sayilari ekrana yazdiran kodu yaziniz.
            for (int iii=40 ; iii>22 ; iii--){
            if (iii%2 ==0) {
                System.out.println(iii);
            }

        //Example 4: 18'den 56'ya kadar tum tek tamsayilari ekrana yazdiran kodu yaziniz.
            for (int iv=18 ; iv<57 ; iv++){
            if (iv%2!=0){
                System.out.print(iv + " ");
            }


            }

            }
        }
    }
}
