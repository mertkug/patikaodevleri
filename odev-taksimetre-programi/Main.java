import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km, tutar;

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = input.nextDouble();

        tutar = 10 + (km * 2.20);
        tutar = tutar < 20 ? 20 : tutar;

        System.out.println("Toplam Tutar = " + tutar + " TL");
    }
}
