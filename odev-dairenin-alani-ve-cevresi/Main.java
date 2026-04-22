import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r, a, pi = 3.14, alan, cevre, dilimAlani;

        System.out.print("Yaricapi giriniz: ");
        r = input.nextDouble();

        System.out.print("Merkez acisini giriniz: ");
        a = input.nextDouble();

        alan = pi * r * r;
        cevre = 2 * pi * r;
        dilimAlani = (pi * (r * r) * a) / 360;

        System.out.println("Dairenin alani = " + alan);
        System.out.println("Dairenin cevresi = " + cevre);
        System.out.println("Daire diliminin alani = " + dilimAlani);
    }
}
