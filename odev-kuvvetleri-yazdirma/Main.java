import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;

        System.out.print("Sayi giriniz: ");
        sayi = input.nextInt();

        System.out.println("4'un kuvvetleri:");
        for (int i = 1; i <= sayi; i *= 4) {
            System.out.println(i);
        }

        System.out.println("5'in kuvvetleri:");
        for (int i = 1; i <= sayi; i *= 5) {
            System.out.println(i);
        }

        input.close();
    }
}
