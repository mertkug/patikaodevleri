import java.util.Scanner;

public class Main {
    static int findClosestSmaller(int[] list, int number) {
        int closest = Integer.MIN_VALUE;

        for (int i : list) {
            if (i < number && i > closest) {
                closest = i;
            }
        }

        return closest;
    }

    static int findClosestGreater(int[] list, int number) {
        int closest = Integer.MAX_VALUE;

        for (int i : list) {
            if (i > number && i < closest) {
                closest = i;
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int number;

        System.out.print("Girilen Sayi : ");
        number = input.nextInt();

        System.out.println("Girilen sayidan kucuk en yakin sayi : " + findClosestSmaller(list, number));
        System.out.println("Girilen sayidan buyuk en yakin sayi : " + findClosestGreater(list, number));

        input.close();
    }
}
