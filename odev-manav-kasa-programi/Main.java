import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armut, elma, domates, muz, patlican, toplam;

        System.out.print("Armut Kac Kilo ? :");
        armut = input.nextDouble();

        System.out.print("Elma Kac Kilo ? :");
        elma = input.nextDouble();

        System.out.print("Domates Kac Kilo ? :");
        domates = input.nextDouble();

        System.out.print("Muz Kac Kilo ? :");
        muz = input.nextDouble();

        System.out.print("Patlican Kac Kilo ? :");
        patlican = input.nextDouble();

        toplam = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5.00);

        System.out.println("Toplam Tutar : " + toplam + " TL");
    }
}
