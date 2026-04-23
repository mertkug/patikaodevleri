import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password, newPassword, answer;

        System.out.print("Kullanici adinizi giriniz: ");
        userName = input.nextLine();

        System.out.print("Sifrenizi giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giris yaptiniz");
        } else if (userName.equals("patika")) {
            System.out.print("Sifrenizi sifirlamak ister misiniz? ");
            answer = input.nextLine();

            if (answer.equals("evet")) {
                System.out.print("Yeni sifrenizi giriniz: ");
                newPassword = input.nextLine();

                if (newPassword.equals("java123")) {
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                } else {
                    System.out.println("Sifre olusturuldu");
                }
            } else {
                System.out.println("Sifre sifirlanmadi");
            }
        } else {
            System.out.println("Bilgileriniz yanlis");
        }

        input.close();
    }
}
