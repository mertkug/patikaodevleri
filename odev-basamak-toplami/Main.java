import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, tempNumber, basValue, result = 0;

        System.out.print("Sayi Giriniz: ");
        number = input.nextInt();

        tempNumber = number;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            result += basValue;
            tempNumber /= 10;
        }

        System.out.println("Basamak toplami: " + result);

        input.close();
    }
}
