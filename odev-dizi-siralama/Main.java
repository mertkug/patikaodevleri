import java.util.Scanner;

public class Main {
    static int[] readArray(Scanner input, int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemani : ");
            arr[i] = input.nextInt();
        }

        return arr;
    }

    static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void printArray(int[] arr) {
        System.out.print("Siralama : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();

        System.out.println("Dizinin elemanlarini giriniz :");
        int[] arr = readArray(input, n);
        sortArray(arr);
        printArray(arr);

        input.close();
    }
}
