package advanced_practice.practice01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q01_Variable_Fahrenheit {

    // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
    // formül: c = (f-32)*5/9

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Fahrenheit degeri giriniz");

        double fah = input.nextDouble();
        double cel = (((fah - 32) * 5) / 9);
        System.out.println("Celcius"+cel);

        DecimalFormat format = new DecimalFormat("0.00");//double sayilarda "."dan sonra kac anae istiyoruz gorunmesini boyle yapiyoruz
        String formattedCelcius = format.format(cel);
        System.out.println("formattedCelcius = " + formattedCelcius);

        //2.yol  printf
        System.out.printf("Formatli:" + "%.2f",cel); //%==> herhangi bir sayi- 2f==> 2 basamakli olsun, f==>format
    }

}

