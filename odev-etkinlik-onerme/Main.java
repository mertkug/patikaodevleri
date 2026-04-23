import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sicaklik;

        System.out.print("Sicaklik degerini giriniz: ");
        sicaklik = input.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirsiniz");
        }

        if (sicaklik >= 5 && sicaklik < 15) {
            System.out.println("Sinemaya gidebilirsiniz");
        }

        if (sicaklik >= 15 && sicaklik <= 25) {
            System.out.println("Piknik yapabilirsiniz");
        }

        if (sicaklik > 25) {
            System.out.println("Yuzmeye gidebilirsiniz");
        }

        input.close();
    }
}
