package day05typecastingstringmanipulations;

public class SwapValues {

    //Swap: Yer degistirmek.
    //1.kapta patates var, 2.kapta domates var ==> Swap ==> 1.kap domates, 2.kap patates olacak

    public static void main(String[] args) {

        int a = 12;
        int b = 5; //Swap`ten sonra ==> a=5 ve b=12 olmali Interview`larda sorarlar

        int temp = 0; //temporary gecici demek (bos tabak olusturduk) verilen deger onemli degil genelde 0 verilir!!
        System.out.println("a:" + a); //12
        System.out.println("b:" + b); //5


        //1.Yol
        //1.Adim
        temp = a; // Atama operatoru = sagdakini alip soldakinin icine koyar

        //2.Adim
        a = b;

        //3.Adim
        b = temp;

        System.out.println("a:" + a); //5
        System.out.println("b:" + b); //12 yer degistirmis olduk swap islemi

        //2.Yol (bos tabaksiz swap islemi interviewlerde genelde bu yolu isterler iyi ogren)
        int x = 12;
        int y = 5;

        x = x + y; //12 + 5 = 17
        y = x - y; //17 - 5 = 12
        x = x - y; //17 - 12 = 5

        System.out.println("x:" + x); //5
        System.out.println("y:" + y); //12







    }









}
