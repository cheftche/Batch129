package day01variables;

public class MethodCreation01 {
    public static <String> void main(String[] args) {
        int sonuc = add(30, 50);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(3, 6);
        System.out.println(carpmaSonucu);

       int ucluSonuc = firstTwoMultiplyThirdAdd(2,5,8);
        System.out.println(ucluSonuc);

       double kupSonucu = ondalikSayininKupu(2.1);
        System.out.println(kupSonucu);

    }

    public static int add(int a, int b){
     return a+b;
    }

    protected static long multiply(int a, int b){
        return a*b;
    }

    private static int firstTwoMultiplyThirdAdd (int a, int b, int c){
        return a*b+c;
    }

   private static double ondalikSayininKupu (double a){
        return a*a*a;
   }

}

