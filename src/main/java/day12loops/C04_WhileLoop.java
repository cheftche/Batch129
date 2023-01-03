package day12loops;

public class C04_WhileLoop {

    public static void main(String[] args) {

        //3'ten 10'a kadar tamsayilari ayni satira yazdiran kodu yazdiriniz

        //1.Yol
        for (int i = 3; i < 11; i++) {
            System.out.print(i+" ");
        }

        System.out.println(); //bosluk olsun diye

        //2.Yol
        int i =3; //baslangic degeri
        while (i<11){ //bitis degeri
            System.out.print(i+" ");
            i++; //artirma while loop'un body'si icinde
        }

        System.out.println();

        //17'den 4'e kadar tum cift tamsayilari ekrana ayni satirda yazdiran kodu yaziniz.
        int a = 17;         //baslangic degeri
        while (a>3){        //bitis degeri
            if (a%2==0){    //cift sayi ise
                System.out.print(a+" "); //yanyana bosluklu yazdir
            }
            i--;               //azalarak git komutu
        }









    }
}
