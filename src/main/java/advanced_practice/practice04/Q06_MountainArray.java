package advanced_practice.practice04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q06_MountainArray {

    /*
 Bir Array'in Mountain Array olup olmadigini kontrol eden bir kod yazýnýz.
 Mountain Array: Element degerleri bir noktaya kadar sürekli artip o noktadan sonra sürekli azalan Array.
  */

    public static void main(String[] args) {

        int[]  arr = {-999,1, 2, 5, 7, 9, 22, 8, 3, 1, -100};

        //Array'i List'e cevir (uzerinde daha rahat islem yapabilmek icin) cevirmek zorunda degiliz artanlari ve azalanlari ayri iki liste koyabiliriz direk
        List<Integer> list = new ArrayList<>();
        for (int w : arr){
            list.add(w);
        }

        //Max degeri bul
        int max = list.get(0);
        for (int w : list){
            if (w>max){
                max = w;
            }
        }
        System.out.println("max: " +max); //22

        //List 1:
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == max) {
                break;
            }
            list1.add(list.get(i));
        }
        System.out.println("list1 = " + list1); //list1 = [-999, 1, 2, 5, 7, 9]

        //List 2:
        List<Integer> list2 = new ArrayList<>();
        for (int i=0; i<list.size(); i++){
            if (i<list.indexOf(max)){
                continue;
            }
            list2.add(list.get(i));
        }
        System.out.println("list2 = " + list2); // list2 = [22, 8, 3, 1, -100]

        //Yedekleyip sirala yontemi
        List<Integer> list1Copy = new ArrayList<>(list1);
        List<Integer> list2Copy = new ArrayList<>(list2);

        Collections.sort(list1Copy);
        Collections.sort(list2Copy);
        Collections.reverse(list2Copy);

        System.out.println("list1Copy = " + list1Copy); //list1Copy = [-999, 1, 2, 5, 7, 9]
        System.out.println("list2Copy = " + list2Copy); //list2Copy = [22, 8, 3, 1, -100]

        //Kontrol
        if (list1.equals(list1Copy) && list2.equals(list2Copy)){
            System.out.println("Mountain Array"); //Mountain Array
        }else {
            System.out.println("Mountain Array degil");
        }






    }
}
