package day15arrays;

public class Arrays04 {

    public static void main(String[] args) {

        // Example1: Bir Arrayin icinde herhangi bir elemanin olup olmadigini
        //           kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz

        int a[] = {0, 2, 3, 0, 12, 0}; //sifir uc kere tekrarlanmis demeli

        int num = 0; //kontrol edecegim sayi, sayiyi sirayla alicam 0'a esitse counter'i artiricam
        int counter = 0; //sayac

        for (int w: a){
            if (w==num){
                counter++;
            }
        }
        if (counter>0){  //o sayi var ise
            System.out.println(num + " array'de" + counter + " defa var"); //0 array'de 3 defa var
        }else{
            System.out.println(num + " array'de yok.");
        }


    }
}
