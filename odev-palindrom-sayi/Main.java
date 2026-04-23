import java.util.Scanner;

public class Main {
    static boolean isPalindrome(int sayi) {
        int temp = sayi;
        int tersSayi = 0;
        int sonBasamak;

        while (temp != 0) {
            sonBasamak = temp % 10;
            tersSayi = (tersSayi * 10) + sonBasamak;
            temp /= 10;
        }

        return sayi == tersSayi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;

        System.out.print("Bir sayi giriniz: ");
        sayi = input.nextInt();

        if (isPalindrome(sayi)) {
            System.out.println(sayi + " palindrom sayidir.");
        } else {
            System.out.println(sayi + " palindrom sayi degildir.");
        }

        input.close();
    }
}
