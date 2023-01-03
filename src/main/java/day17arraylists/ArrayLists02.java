package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {

    public static void main(String[] args) {

        //Array List olustururken sag tarafa(constructor) ArrayList yazmak zorundasiniz.
        //Ama sol tarafa ister "ArrayList", ister "List" yazin, ikisi de calisir.
        //List yazinca Hz.Adem'in Oglu demis oluruz
        //Array list yazinca Mustafa(herhangi bir insan)'nin oglu deriz.
        //Hangisi daha dogru?
        //==> Ihtiyaca gore bu tanimlama degisir. Ama ikisi de kullanilir.
        List<Character> initials= new ArrayList<>(); //initials bas harfler demek
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B'); //List'in icine tekrar ayni elemandan koyabiliriz

        //Bir List'te kac eleman oldugunu nasil anlariz?
        //Note: //Array--->length()
                //List--->size()

        int numOfElement = initials.size();
        System.out.println(numOfElement); //4

        //Bir List'ten istenen bir eleman nasil alinir?
        //get()-->indexdeki elemanı getirir
        char u = initials.get(2); //Character==> char auto-boxing yapti Java
        System.out.println(u); //M

        //Example 1: Verilen bir String List'teki elemanlarin toplam karakter sayisini bulan kodu yaziniz.
        List<String> cities= new ArrayList<>(); //initials bas harfler demek
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        //1.Yol: for-each loop Recommended(Tavsiye edilen)
        int sum = 0;

        for (String w : cities){
            sum = sum + w.length();
        }
        System.out.println(sum); //26

        //2.Yol: for loop
        int toplam = 0;
        for (int i=0; i<cities.size(); i++){
            toplam = toplam + cities.get(i).length();
        }
        System.out.println(toplam); //26

        //Bir List'teki istenen bir elemani nasil degistirebiliriz?
        //List'teki set() method'u, String'lerdeki replace() methodu ile ayni
        cities.set(0, "New York");
        System.out.println(cities); //[New York, Istanbul, Kayseri, Almaty]

        //Example 2: Maas List'i olusturunuz ve maaslara %20 zam yapiniz.
        List<Double> salary = new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);

        //1.Yol: for-each loop Recommended(Tavsiye edilen)
        int idx = 0; //for-each loop'ta index olmadigindan index konteyner'i olusturduk ve artisla sirayla isleme aldik
        for (Double w : salary){
            salary.set(idx, w*1.20);
            idx++;
        }
        System.out.println(salary); //[23400.3, 10200.9, 39000.6]

        //2.Yol: For-loop
        for (int i=0; i<salary.size(); i++){
            salary.set(i, salary.get(i)*1.20);
        }
        System.out.println(salary);




    }
}
