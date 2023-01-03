package day18lists;

import java.util.*;

public class Lists02 {

    public static void main(String[] args) {

        //Example 1: Bir tane Integer List olusturunuz. (Interview Sorusu)
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 9, 11] ==> 12,11

        List<Integer> nums = new ArrayList<>(); //[12, 23, 9, 11]
        nums.add(12);
        nums.add(23);
        nums.add(9);
        nums.add(11);

        Collections.sort(nums); // [9, 11 ,12, 23] siralama yaptik

        int minDiff = nums.get(1) - nums.get(0); //2. eleman ile 1. elemanin farkina baktik 11-9=2

        //farklari karsilastir kucugunu al yapicaz for ile
        for (int i=1; i<nums.size(); i++){ //farki bulmak icin ikinci elemandan birinci elemani cikaririz o yuzden index 1den basladik
            minDiff = Math.min(minDiff, nums.get(i)-nums.get(i-1)); // 2 ile 11 'den (1-1) yani 0.index yani 9'u cikarinca 2 karsilastirir kucugunu konteynera koyar
        }
        System.out.println(minDiff); //1

        for(int i=1; i<nums.size(); i++){
            if(nums.get(i)-nums.get(i-1) == minDiff) {
                System.out.println(nums.get(i-1) + " and " + nums.get(i)); //11 and 12
            }
        }
    }
}
