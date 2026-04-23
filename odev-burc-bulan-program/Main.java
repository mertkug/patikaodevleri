import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ay, gun;
        String burc = "";

        System.out.print("Dogdugunuz ayi giriniz: ");
        ay = input.nextInt();

        System.out.print("Dogdugunuz gunu giriniz: ");
        gun = input.nextInt();

        if (ay == 1) {
            burc = gun <= 21 ? "Oglak" : "Kova";
        } else if (ay == 2) {
            burc = gun <= 19 ? "Kova" : "Balik";
        } else if (ay == 3) {
            burc = gun <= 20 ? "Balik" : "Koc";
        } else if (ay == 4) {
            burc = gun <= 20 ? "Koc" : "Boga";
        } else if (ay == 5) {
            burc = gun <= 21 ? "Boga" : "Ikizler";
        } else if (ay == 6) {
            burc = gun <= 22 ? "Ikizler" : "Yengec";
        } else if (ay == 7) {
            burc = gun <= 22 ? "Yengec" : "Aslan";
        } else if (ay == 8) {
            burc = gun <= 22 ? "Aslan" : "Basak";
        } else if (ay == 9) {
            burc = gun <= 22 ? "Basak" : "Terazi";
        } else if (ay == 10) {
            burc = gun <= 22 ? "Terazi" : "Akrep";
        } else if (ay == 11) {
            burc = gun <= 21 ? "Akrep" : "Yay";
        } else if (ay == 12) {
            burc = gun <= 21 ? "Yay" : "Oglak";
        } else {
            System.out.println("Gecersiz ay girdiniz");
        }

        if (!burc.equals("")) {
            System.out.println("Burcunuz: " + burc);
        }

        input.close();
    }
}
