package practice.practice06;

public class Arrays2 {

//Bir Stringdeki sesli harflerin sayisini bulan kodu yaziniz
//           a - e - i - o - u - A - E - I - O - U
   /* public static void main(String[] args) {
        String str="Java ogrenince para kazanmak ne kolay, ogrenmeyince nekadar zor";
        str=str.toLowerCase();
        String harfler[] = str.split("");
        System.out.println(Arrays.toString(harfler));//[j, a, v, a,  , o, g, r, e, n, i, n, c, e,  , p, a, r, a,  , k, a, z, a, n, m, a, k,  , n, e,  , k, o, l, a, y, ,,
        // , o, g, r, e, n, m, e, y, i, n, c, e,  , n, e, k, a, d, a, r,  , z, o, r]
        int counter =0;
        //iter==for each loop
        for (String w : harfler) {

            switch (w){
                case "a":
                case "e":
                case "o":
                case "u":
                case "i":
                    counter++;
            }
        }//for each
        System.out.println(counter);
    }
}

// INTERWIEW QUESTIONS
    // [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz[2,3,12,0,0,0]
    public static void main(String[] args) {
        int original []={0, 2, 3, 0, 12, 0};

        int yeni[] =new int[original.length];//[0,0,0,0,0,0]

        int idx=0;
        for (int i = 0; i < original.length ; i++) {//original array icin calisti

            if(original[i] != 0){
                yeni[idx]=original[i];
                idx++;//bir sonraki indexe gecer
            }
        }
        System.out.println(Arrays.toString(yeni));



// Bir Arrayin icinde herhangi bir elemanin olup olmadigini
    // kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz

    public static void main(String[] args) {
        int arr []={5,1,5,-3};
        int eleman=-90;
        int sayac=0;

        for (int w : arr) {
            if(w==eleman){
                sayac++;
            }//if
        }//for
        if(sayac>0){
            System.out.println(eleman+" Arrayde "+sayac+" defa var");
        }else
            System.out.println(eleman+" Arrayde yok");
    }
*/
}