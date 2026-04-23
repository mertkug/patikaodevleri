import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanici Adiniz : ");
            userName = input.nextLine();

            System.out.print("Parolaniz : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz!");

                do {
                    System.out.println("1-Para yatirma\n2-Para Cekme\n3-Bakiye Sorgula\n4-Cikis Yap");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktari : ");
                            int deposit = input.nextInt();
                            balance += deposit;
                            break;
                        case 2:
                            System.out.print("Para miktari : ");
                            int withdraw = input.nextInt();
                            if (withdraw > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= withdraw;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar gorusmek uzere.");
                            break;
                        default:
                            System.out.println("Hatali secim yaptiniz.");
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabiniz bloke olmustur lutfen banka ile iletisime geciniz.");
                } else {
                    System.out.println("Kalan Hakkiniz : " + right);
                }
            }
        }

        input.close();
    }
}
