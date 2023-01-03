package practice.mentorodevler;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {

    /* TASK:
     tas >makas
     makas >kagit
     kagit >tas
Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
While dongumuzun icerisinde kullanicidan aldigimiz secimi "secim" isimli degiskene atiyoruz.
Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.
 */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            int userScore = 0;
            int computerScore = 0;
            while (userScore < 5 && computerScore < 5) {
                // Kullanıcıdan seçimini al
                System.out.println("Taş icin 0, Kagit icin 1 Makas icin 2 yaziniz ");
                System.out.println("Her oyun 1 puan, 5 puana ulasan kazanir");
                int userChoice = input.nextInt();
                Random rand = new Random();

                // Bilgisayarın seçimini rastgele belirle
                int computerChoice = rand.nextInt(3);

                // Secimlere gore o elin kazananini belirle
                if ((userChoice == 0 && computerChoice == 2) ||
                        (userChoice == 1 && computerChoice == 0) ||
                        (userChoice == 2 && computerChoice == 1)) {
                    System.out.println("Kullanıcı 1 puan aldiniz!");
                    System.out.println();
                    userScore++;

                } else if (userChoice == computerChoice) {
                    System.out.println("Berabere kaldınız, kimse puan alamadi!");

                } else {
                    System.out.println("Bilgisayar 1 puan aldi!");
                    System.out.println();
                    computerScore++;

                }
                System.out.println("Skor: Kullanıcı " + userScore + " - Bilgisayar " + computerScore);
                System.out.println();

                // Oyunun kazananını belirle
                if (userScore == 5) {
                    System.out.println("Oyunu kullanıcı kazandı. Tebrikler...!");
                    System.out.println("Oyun bitti. Cikmak icin Q'ya basin");
                    System.out.println("Bastan baslamak icin X'e basin");
                } else if (computerScore == 5) {
                    System.out.println("Oyunu bilgisayar kazandı!");
                    System.out.println("Oyun bitti. Cikmak icin Q'ya basin");
                    System.out.println("Bastan baslamak icin X'e basin");
                }

            }
            //Oyuna devam etmek isteyip istemedigini soruyoruz
            String sonTus = input.next().toUpperCase();
            if (sonTus.equalsIgnoreCase("Q")) {
                break;
            } else if (sonTus.equalsIgnoreCase("X")) {
                continue;
            }
        }
    }


}













