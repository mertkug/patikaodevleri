import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row;
    int col;
    int mineCount;
    int openedCellCount;
    String[][] mineMap;
    String[][] playerMap;
    Scanner input;
    Random random;

    MineSweeper(int row, int col, Scanner input) {
        this.row = row;
        this.col = col;
        this.input = input;
        this.random = new Random();
        this.mineCount = (row * col) / 4;
        this.openedCellCount = 0;
        this.mineMap = new String[row][col];
        this.playerMap = new String[row][col];
        initializeMaps();
        placeMines();
    }

    void initializeMaps() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mineMap[i][j] = "-";
                playerMap[i][j] = "-";
            }
        }
    }

    void placeMines() {
        int placedMine = 0;

        while (placedMine < mineCount) {
            int randomRow = random.nextInt(row);
            int randomCol = random.nextInt(col);

            if (!mineMap[randomRow][randomCol].equals("*")) {
                mineMap[randomRow][randomCol] = "*";
                placedMine++;
            }
        }
    }

    void printMap(String[][] map) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean isValidCoordinate(int selectedRow, int selectedCol) {
        return selectedRow >= 0 && selectedRow < row && selectedCol >= 0 && selectedCol < col;
    }

    boolean isAlreadySelected(int selectedRow, int selectedCol) {
        return !playerMap[selectedRow][selectedCol].equals("-");
    }

    int countNeighborMines(int selectedRow, int selectedCol) {
        int count = 0;

        for (int i = selectedRow - 1; i <= selectedRow + 1; i++) {
            for (int j = selectedCol - 1; j <= selectedCol + 1; j++) {
                if (isValidCoordinate(i, j) && !(i == selectedRow && j == selectedCol)) {
                    if (mineMap[i][j].equals("*")) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    boolean isWin() {
        return openedCellCount == (row * col) - mineCount;
    }

    void openCell(int selectedRow, int selectedCol) {
        int mineAround = countNeighborMines(selectedRow, selectedCol);
        playerMap[selectedRow][selectedCol] = String.valueOf(mineAround);
        openedCellCount++;
    }

    void play() {
        int selectedRow;
        int selectedCol;

        System.out.println("Mayinlarin Konumu");
        printMap(mineMap);
        System.out.println("===========================");
        System.out.println("Mayin Tarlasi Oyununa Hosgeldiniz !");

        while (true) {
            printMap(playerMap);
            System.out.print("Satir Giriniz : ");
            selectedRow = input.nextInt();
            System.out.print("Sutun Giriniz : ");
            selectedCol = input.nextInt();

            if (!isValidCoordinate(selectedRow, selectedCol)) {
                System.out.println("Gecersiz koordinat girdiniz, tekrar deneyin.");
                continue;
            }

            if (isAlreadySelected(selectedRow, selectedCol)) {
                System.out.println("Bu koordinat daha once secildi, baska bir koordinat girin.");
                continue;
            }

            if (mineMap[selectedRow][selectedCol].equals("*")) {
                System.out.println("Game Over!!");
                System.out.println("===========================");
                break;
            }

            openCell(selectedRow, selectedCol);

            if (isWin()) {
                System.out.println("Oyunu Kazandiniz !");
                printMap(playerMap);
                System.out.println("===========================");
                break;
            }

            System.out.println("===========================");
        }
    }
}
