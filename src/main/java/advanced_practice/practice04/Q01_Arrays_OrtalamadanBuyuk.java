package advanced_practice.practice04;

public class Q01_Arrays_OrtalamadanBuyuk {

    //Verilen bir Array'in elementlerinin ortalamasından büyük elementleri yazdıran bir kod yazınız.

    public static void main(String[] args) {

        int[] arr = {5, 9, 15, 1, 0, 11, 3};
        double toplam = 0;

        for (int w : arr) {
            toplam += w; //butun elemanlari tek tek koy ve ekle, topla
        }
        System.out.println("toplam = " + toplam);//44
        double ortalama = toplam / arr.length;
        System.out.println("Ortalama:" + ortalama);//6
        System.out.printf("%.2f",ortalama); //yukaridakini kusurati yuvarlayip yazdirmak icin kullanilir*
        System.out.print("Ortalamadan buyuk elementler: ");

        for (int w : arr) {
            if (w > ortalama) {
                System.out.print(w); //9 15 11
            }
        }
        //double ile integer matematik islemine girdiginde java kapsami buyuk olani alir yani double


    }
}