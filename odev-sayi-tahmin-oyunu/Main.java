import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int generateNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    static boolean isInvalidGuess(int selected) {
        return selected < 0 || selected > 99;
    }

    static void printGuessHint(int selected, int number) {
        System.out.println("Hatali bir sayi girdiniz !");
        if (selected > number) {
            System.out.println(selected + " sayisi, gizli sayidan buyuktur.");
        } else {
            System.out.println(selected + " sayisi, gizli sayidan kucuktur.");
        }
    }

    public static void main(String[] args) {
        int number = generateNumber();

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.print("Lutfen tahmininizi giriniz : ");
            selected = input.nextInt();

            if (isInvalidGuess(selected)) {
                System.out.println("Lutfen 0-100 arasinda bir deger giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Cok fazla hatali giris yaptiniz. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatali girisinizde hakkinizdan dusulecektir.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, dogru tahmin ! Tahmin ettiginiz sayi : " + number);
                isWin = true;
                break;
            } else {
                printGuessHint(selected, number);
                wrong[right++] = selected;
                System.out.println("Kalan hakki : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz !");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }

        input.close();
    }
}
