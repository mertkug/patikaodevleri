import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi, toplam = 0, adet = 0;
        double ortalama;

        System.out.print("Sayi giriniz: ");
        sayi = input.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }

        if (adet == 0) {
            System.out.println("Ortalama hesaplanamadi");
        } else {
            ortalama = toplam / (double) adet;
            System.out.println("Ortalama: " + ortalama);
        }

        input.close();
    }
}
