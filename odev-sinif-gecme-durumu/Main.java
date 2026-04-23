import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matematik, fizik, turkce, kimya, muzik, toplam = 0, dersSayisi = 0;
        double ortalama;

        System.out.print("Matematik notunuz: ");
        matematik = input.nextInt();
        if (matematik >= 0 && matematik <= 100) {
            toplam += matematik;
            dersSayisi++;
        }

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            dersSayisi++;
        }

        System.out.print("Turkce notunuz: ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            dersSayisi++;
        }

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            dersSayisi++;
        }

        System.out.print("Muzik notunuz: ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            dersSayisi++;
        }

        if (dersSayisi == 0) {
            System.out.println("Gecerli not girilmedi");
        } else {
            ortalama = toplam / (double) dersSayisi;
            System.out.println("Ortalamaniz: " + ortalama);

            if (ortalama >= 55) {
                System.out.println("Sinifi Gecti");
            } else {
                System.out.println("Sinifta Kaldi");
            }
        }

        input.close();
    }
}
