package day19listsvarargs;

public class Varargs01 {

    /*
    Varargs'lar method olustururken parametre sayisinda bize esneklik saglar
    Varargs'lar method olustururken "parametre" sayisinda bize esneklik saglar
    Method'un parantezleri icine yazilanlara "parametre" denir
    Method'u cagirirken kullanilan sayilara da "argument" denir.

    Note: Bir method'da 1'den fazla Varargs Parametre kullanilamaz cunku ikincisi "Unreachable Code" olur (yada Unused Code)
    Note: Varargs, Varargs'lar disindaki parametrelerle kullanilabilir ama Varargs her zaman son parametre olmalidir
    //(dipsiz kuyu old.doldurulamaz, ikinciyi unreachable code yapar)
    Non primitivelerin adreslerini ve wrapper class(String, Integer) koyulabilir
     */

    public static void main(String[] args) {

        //VarArgs ==> Variable Arguments acilimi bu, arkada array gibi calisir ama array degildir

        addTwoNumbers(3, 5);

        addThreeNumbers(4, 7,2);

        add(4, 5, 6, 7, 8, 9); //icindekiler ==> Argument       hic, tek, coklu eleman hepsiyle calisir
    }

    //Iki sayiyi toplayan method olusturun
    public static void addTwoNumbers(int a, int b){ //main method static oldugundan onun icine koydugumuz method da static olmali
        System.out.println(a+b); //8
    }

    //Uc sayiyi toplayan method olusturun
    public static void addThreeNumbers(int a, int b, int c){ // bu parantez icindekiler parametre
        System.out.println(a+b+c);
    }

    //Istediginiz sayida sayiyi toplamak icin bir method olusturunuz***
    public static void add(int... a){ // ... ==> varargs demek  (data tipi... varargs ismi)

        int sum = 0;

        for (int w : a){
            sum = sum + w;
        }
        System.out.println(sum); //39


    }

}
