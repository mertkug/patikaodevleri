import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, r;
        int nFaktoriyel = 1, rFaktoriyel = 1, farkFaktoriyel = 1;
        int kombinasyon;

        System.out.print("n degerini giriniz: ");
        n = input.nextInt();

        System.out.print("r degerini giriniz: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            nFaktoriyel *= i;
        }

        for (int i = 1; i <= r; i++) {
            rFaktoriyel *= i;
        }

        for (int i = 1; i <= (n - r); i++) {
            farkFaktoriyel *= i;
        }

        kombinasyon = nFaktoriyel / (rFaktoriyel * farkFaktoriyel);

        System.out.println("C(" + n + "," + r + ") = " + kombinasyon);

        input.close();
    }
}
