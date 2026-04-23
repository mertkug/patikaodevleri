import java.util.Scanner;

public class Main {
    static void pattern(int number, int temp, boolean isDecreasing) {
        System.out.print(temp + " ");

        if (temp == number && !isDecreasing) {
            return;
        }

        if (isDecreasing) {
            if (temp <= 0) {
                pattern(number, temp + 5, false);
            } else {
                pattern(number, temp - 5, true);
            }
        } else {
            pattern(number, temp + 5, false);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("N Sayisi : ");
        number = input.nextInt();

        pattern(number, number, true);

        input.close();
    }
}
