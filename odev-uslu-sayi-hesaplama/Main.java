import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int taban, us, sonuc = 1;

        System.out.print("Taban degerini giriniz: ");
        taban = input.nextInt();

        System.out.print("Us degerini giriniz: ");
        us = input.nextInt();

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        System.out.println("Sonuc: " + sonuc);

        input.close();
    }
}
