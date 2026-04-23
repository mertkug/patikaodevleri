import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mesafe, yas, yolculukTipi;
        double tutar, yasIndirimi = 0, indirimliTutar, toplamTutar;

        System.out.print("Mesafeyi km turunden giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Yasinizi giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yon , 2 => Gidis Donus ): ");
        yolculukTipi = input.nextInt();

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatali Veri Girdiniz !");
        } else {
            tutar = mesafe * 0.10;

            if (yas < 12) {
                yasIndirimi = tutar * 0.50;
            } else if (yas <= 24) {
                yasIndirimi = tutar * 0.10;
            } else if (yas > 65) {
                yasIndirimi = tutar * 0.30;
            }

            indirimliTutar = tutar - yasIndirimi;

            if (yolculukTipi == 2) {
                toplamTutar = (indirimliTutar - (indirimliTutar * 0.20)) * 2;
            } else {
                toplamTutar = indirimliTutar;
            }

            System.out.println("Toplam Tutar = " + toplamTutar + " TL");
        }

        input.close();
    }
}
