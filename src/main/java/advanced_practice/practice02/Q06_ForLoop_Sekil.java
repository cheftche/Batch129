package advanced_practice.practice02;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Q06_ForLoop_Sekil {

    /*
		Şekli Yazdırınız:
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
     */

    public static void main(String[] args) {

        char ch = 'A';
        for (int i=0; i<6; i++){
            for (int j=0; j<=i; j++){
                System.out.print((char)(ch+i)+" "); //A+0 =65 verir onu char'a cevirdik toplama yapinca string oldu, en son string oldu, char int char string
            }
            System.out.println();

        }
    }

}
