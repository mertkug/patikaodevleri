import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double boy, kilo, vki;

        System.out.print("Lutfen boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        vki = kilo / (boy * boy);

        System.out.println("Vucut Kitle Indeksiniz: " + vki);
    }
}
