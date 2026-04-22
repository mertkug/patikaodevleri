import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matematik, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik notunuz: ");
        matematik = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Turkce notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();

        System.out.print("Muzik notunuz: ");
        muzik = input.nextInt();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6.0;
        String durum = ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println("Ortalamaniz: " + ortalama);
        System.out.println(durum);
    }
}
