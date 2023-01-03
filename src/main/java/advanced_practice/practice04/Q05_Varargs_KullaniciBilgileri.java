package advanced_practice.practice04;

public class Q05_Varargs_KullaniciBilgileri {

    //Ad, soyad, yaş ve bugüne dek yaşanılmış sehirler bilgilerini parametre olarak alıp yazdıran bir method oluşturunuz.
    //varargs ==> degisken argumanlar, array data tipinde kullanilir

    public static void main(String[] args) {

        bilgiler("Ali", "Can", 22, "Ankara", "Konya", "Erzurum", "Agri", "Diyarbakir", "Kayseri");
        System.out.println();
        bilgiler2("Ali", "Can", "22", "Ankara", "Konya", "Erzurum", "Agri", "Diyarbakir", "Kayseri");
        bilgiler2("Ahmet","Tan","33","Hamburg","Bremen", "Berlin");
    }
    //mantikli olan yol
    public static void bilgiler(String ad, String soyad, int yas, String... sehirler){
        System.out.println("ad = "+ ad);
        System.out.println("soyad = " + soyad);
        System.out.println("yas = " + yas);
        System.out.print("yasanilmis sehirler: ");

        for (String w : sehirler){

            System.out.print(w+ " ");
        }
    }

    public static void bilgiler2(String... bilgiler){
        for (int i=0; i<bilgiler.length; i++){
            if (i==0){
                System.out.println("Ad: "+ bilgiler[i]); //0 da olur
            }else if (i==1){
                System.out.println("Soyad: " + bilgiler[i]); //1 de olur
            } else if (i==2) {
                System.out.println("Yas: " + bilgiler[i]); //2 de olur
                System.out.print("Yasanilan Sehirler: ");
            }else{
                System.out.print(bilgiler[i] + " ");
            }
        }
    }


}
