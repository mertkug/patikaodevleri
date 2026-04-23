import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi, temp, tersSayi = 0, sonBasamak;

        System.out.print("Bir sayi giriniz: ");
        sayi = input.nextInt();

        temp = sayi;

        while (temp != 0) {
            sonBasamak = temp % 10;
            tersSayi = (tersSayi * 10) + sonBasamak;
            temp /= 10;
        }

        if (sayi == tersSayi) {
            System.out.println(sayi + " palindrom sayidir.");
        } else {
            System.out.println(sayi + " palindrom sayi degildir.");
        }

        input.close();
    }
}
