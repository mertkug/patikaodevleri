import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        double toplam = 0;

        System.out.print("Sayi giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            toplam += 1.0 / i;
        }

        System.out.println("Harmonik seri toplami: " + toplam);

        input.close();
    }
}
