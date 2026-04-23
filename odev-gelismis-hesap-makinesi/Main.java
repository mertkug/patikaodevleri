import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    static void plus() {
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayi : ");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuc : " + result);
    }

    static void minus() {
        System.out.print("Kac adet sayi gireceksiniz : ");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi : ");
            number = scan.nextInt();
            if (i == 1) {
                result = number;
            } else {
                result -= number;
            }
        }

        System.out.println("Sonuc : " + result);
    }

    static void times() {
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayi : ");
            number = scan.nextInt();

            if (number == 1) {
                break;
            }

            if (number == 0) {
                result = 0;
                break;
            }

            result *= number;
        }

        System.out.println("Sonuc : " + result);
    }

    static void divided() {
        System.out.print("Kac adet sayi gireceksiniz : ");
        int counter = scan.nextInt();
        double number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi : ");
            number = scan.nextDouble();

            if (i != 1 && number == 0) {
                System.out.println("Boleni 0 giremezsiniz.");
                return;
            }

            if (i == 1) {
                result = number;
            } else {
                result /= number;
            }
        }

        System.out.println("Sonuc : " + result);
    }

    static void power() {
        System.out.print("Taban degeri giriniz : ");
        int base = scan.nextInt();
        System.out.print("Us degeri giriniz : ");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuc : " + result);
    }

    static void factorial() {
        System.out.print("Sayi giriniz : ");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuc : " + result);
    }

    static void mod() {
        System.out.print("Ilk sayiyi giriniz : ");
        int n1 = scan.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        int n2 = scan.nextInt();

        System.out.println("Sonuc : " + (n1 % n2));
    }

    static void rectangle() {
        System.out.print("Kisa kenari giriniz : ");
        int shortEdge = scan.nextInt();
        System.out.print("Uzun kenari giriniz : ");
        int longEdge = scan.nextInt();

        System.out.println("Alan : " + (shortEdge * longEdge));
        System.out.println("Cevre : " + (2 * (shortEdge + longEdge)));
    }

    public static void main(String[] args) {
        int select;
        String menu = "1- Toplama Islemi\n"
                + "2- Cikarma Islemi\n"
                + "3- Carpma Islemi\n"
                + "4- Bolme Islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve Cevre Hesabi\n"
                + "0- Cikis Yap";

        do {
            System.out.println(menu);
            System.out.print("Lutfen bir islem seciniz : ");
            select = scan.nextInt();

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    System.out.println("Cikis yapildi.");
                    break;
                default:
                    System.out.println("Yanlis bir deger girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);

        scan.close();
    }
}
