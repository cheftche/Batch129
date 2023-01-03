package day13whileloopdowhileloop;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        //1)while-loop (once sarti sagladigini kontrol eder sonra calisir)
        int i=1;

        while (i<1){
            System.out.println("Sen bir do while loopsun...");  //while body hic calismadi
            i++;                                                //while-loop'da Zero Execution mumkundur.
        }

        //2)do-while-loop (once calisir sonra sarti kontrol eder)
        int k=1;

        do {
            System.out.println("Sen bir do while loopsun...");  //do-while body calisti
            k++;                                                //do-while kullandiginizda loop body en az 1 kere calisir
        }while (k<1);                                           //do while da "zero execution" mumkun degildir











    }
}
