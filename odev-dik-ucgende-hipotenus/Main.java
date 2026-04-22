import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c, hipotenus, u, alan;

        System.out.print("1. dik kenari giriniz: ");
        a = input.nextDouble();

        System.out.print("2. dik kenari giriniz: ");
        b = input.nextDouble();

        hipotenus = Math.sqrt((a * a) + (b * b));

        System.out.println("Hipotenus = " + hipotenus);

        System.out.print("1. kenari giriniz: ");
        a = input.nextDouble();

        System.out.print("2. kenari giriniz: ");
        b = input.nextDouble();

        System.out.print("3. kenari giriniz: ");
        c = input.nextDouble();

        u = (a + b + c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Ucgenin alani = " + alan);
    }
}
