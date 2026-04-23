public class Main {
    static boolean isContains(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    static int[] findRepeatedEvenNumbers(int[] list) {
        int[] repeated = new int[list.length];
        int index = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j] && list[i] % 2 == 0) {
                    if (!isContains(repeated, list[i])) {
                        repeated[index++] = list[i];
                    }
                }
            }
        }

        return repeated;
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {3, 7, 2, 2, 4, 8, 8, 9, 10, 10, 11, 12};
        int[] repeated = findRepeatedEvenNumbers(list);

        System.out.println("Tekrar eden cift sayilar:");
        printArray(repeated);
    }
}
