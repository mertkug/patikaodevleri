import java.util.Scanner;

public class Main {
    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int base, exponent;

        System.out.print("Taban degeri giriniz : ");
        base = input.nextInt();

        System.out.print("Us degerini giriniz : ");
        exponent = input.nextInt();

        System.out.println("Sonuc : " + power(base, exponent));

        input.close();
    }
}
