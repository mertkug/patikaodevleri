public class Main {
    static double harmonicAverage(int[] numbers) {
        double harmonicSeries = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            harmonicSeries += 1.0 / numbers[i];
        }

        return numbers.length / harmonicSeries;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(harmonicAverage(numbers));
    }
}
