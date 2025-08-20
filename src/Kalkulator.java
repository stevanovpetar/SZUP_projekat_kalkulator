/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Petar
 */
public class Kalkulator {
    public static void main(String[] args) {
        System.out.println("Dobrodošli u kalkulator!");
        int zbir = saberi(5, 3);
        int razlika = oduzmi(5, 3);
        int proizvod = pomnozi(5, 3);
        double kolicnik = podeli(10, 2);

        System.out.println("Sabiranje: 5 + 3 = " + zbir);
        System.out.println("Oduzimanje: 5 - 3 = " + razlika);
        System.out.println("Množenje: 5 * 3 = " + proizvod);
        System.out.println("Deljenje: 10 / 2 = " + kolicnik);
    }

    public static int saberi(int a, int b) {
        return a + b;
    }

    public static int oduzmi(int a, int b) {
        return a - b;
    }

    public static int pomnozi(int a, int b) {
        return a * b;
    }

    public static double podeli(int a, int b) {
        if (b == 0) {
            System.out.println("Greška: deljenje sa nulom nije moguce!");
            return 0;
        }
        return (double) a / b;
    }
}

