import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, i = 1, ebob = 1, ekok;

        System.out.print("1. sayiyi giriniz: ");
        n1 = input.nextInt();

        System.out.print("2. sayiyi giriniz: ");
        n2 = input.nextInt();

        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        ekok = (n1 * n2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);

        input.close();
    }
}
