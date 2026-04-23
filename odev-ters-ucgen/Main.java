import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int basamak;

        System.out.print("Basamak Sayisi : ");
        basamak = input.nextInt();

        for (int i = basamak; i >= 1; i--) {
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
