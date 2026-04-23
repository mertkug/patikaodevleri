import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, a = 0, b = 1, c;

        System.out.print("Eleman sayisini giriniz: ");
        n = input.nextInt();

        System.out.print(n + " Elemanli Fibonacci Serisi : ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }

        input.close();
    }
}
