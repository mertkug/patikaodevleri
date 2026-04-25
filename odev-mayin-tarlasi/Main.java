import java.util.Scanner;

public class Main {
    static int readSize(Scanner input, String label) {
        int value;

        while (true) {
            System.out.print(label);
            value = input.nextInt();

            if (value >= 2) {
                return value;
            }

            System.out.println("Matris boyutu en az 2 olmalidir. Tekrar giriniz.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row = readSize(input, "Satir sayisini giriniz : ");
        int col = readSize(input, "Sutun sayisini giriniz : ");

        MineSweeper game = new MineSweeper(row, col, input);
        game.play();

        input.close();
    }
}
