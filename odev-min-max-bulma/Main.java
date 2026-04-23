import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int adet, sayi, enBuyuk = 0, enKucuk = 0;

        System.out.print("Kac tane sayi gireceksiniz: ");
        adet = input.nextInt();

        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". Sayiyi giriniz: ");
            sayi = input.nextInt();

            if (i == 1) {
                enBuyuk = sayi;
                enKucuk = sayi;
            }

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        System.out.println("En buyuk sayi: " + enBuyuk);
        System.out.println("En kucuk sayi: " + enKucuk);

        input.close();
    }
}
