import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tutar, kdvOrani, kdvTutari, kdvliTutar;

        System.out.print("Tutari giriniz: ");
        tutar = input.nextDouble();

        kdvOrani = (tutar >= 0 && tutar <= 1000) ? 0.18 : 0.08;
        kdvTutari = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutari;

        System.out.println("KDV'siz Fiyat = " + tutar);
        System.out.println("KDV Orani = " + kdvOrani);
        System.out.println("KDV Tutari = " + kdvTutari);
        System.out.println("KDV'li Fiyat = " + kdvliTutar);
    }
}
