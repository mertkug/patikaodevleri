public class Main {
    static boolean isCounted(int[] counted, int value) {
        for (int i : counted) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    static int countFrequency(int[] list, int value) {
        int count = 0;

        for (int i : list) {
            if (i == value) {
                count++;
            }
        }

        return count;
    }

    static void printFrequencies(int[] list) {
        int[] counted = new int[list.length];
        int index = 0;

        System.out.println("Tekrar Sayilari");
        for (int i = 0; i < list.length; i++) {
            if (!isCounted(counted, list[i])) {
                int frequency = countFrequency(list, list[i]);
                System.out.println(list[i] + " sayisi " + frequency + " kere tekrar edildi.");
                counted[index++] = list[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        printFrequencies(list);
    }
}
