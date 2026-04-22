import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, secim;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci degeri girin: ");
        n1 = input.nextInt();
        System.out.print("Ikinci degeri girin: ");
        n2 = input.nextInt();

        System.out.println("1-Toplam islemi\n2-Cikarma islemi\n3-Carpma islemi\n4-Bolme islemi");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Sonuc: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Sonuc: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Sonuc: " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Bir sayi 0 ile bolunemez");
                } else {
                    System.out.println("Sonuc: " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Gecersiz secim");
        }

        input.close();
    }
}
