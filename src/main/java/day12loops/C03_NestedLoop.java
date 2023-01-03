package day12loops;

import java.util.Scanner;

public class C03_NestedLoop {

     /*
       Example 1: Asagidaki sekli cizen kodu yaziniz
                   1
                   1 2
                   1 2 3
                   1 2 3 4
                   1 2 3 4 5
     */

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) { //satir kontrolu yaptik
            for (int j = 1; j <= i; j++) { //rakam kontrolu
                System.out.println(j + " ");
            }
            System.out.println(); //alt satira atsin diye koyduk
        }

        /*
        Example 2: Asagidaki sekli cizdiren kodu yaziniz
                * * * *
                * * *
                * *
                *
        */
        int satir = 4;
        for (int i = 1; i <= satir; i++) {
            for (int j = satir; j >=i; j--) {
                System.out.print("*" + " "); //yildiz yazdirir
            }
            System.out.println(); //asagiya atmasi icin
        }

        /*
        Example 3: Satir sayisini kullanicidan alarak asagidaki gibi sekil yazdiriniz.
             *             //5bosluk 1*
            * *            //4bosluk 2*    for satir
           *   *           //3bosluk 2*    for bosluk  ==> 3 adet for loop olusturacagiz
          *     *          //2bosluk 2*    for *
         * * * * *         //1bosluk 5*

         */
        //kac satir var once ona bakariz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz"); //5
        int row = input.nextInt(); //row ==> satir demek

        for (int i = 1; i <= row; i++) { //i satirlari temsil ediyor
            for (int bosluk = row; bosluk >=i ; bosluk--) { //bosluk kontrol
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <=i ; yildiz++) { //yildiz kontrolu
                if (yildiz==1 || yildiz==i){

                    System.out.print("* ");  //en distaki yildizlar
                }else if(i==row){

                    System.out.print("* "); //en alt satirdaki yildizlari ekledik
                }else
                    System.out.print("  "); //3 ve 4. satirdaki bosluklari biraktik

            }
            System.out.println();
        }




    }

}
