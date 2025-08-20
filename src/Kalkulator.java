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
        System.out.println("Dobrodošli u kalkulator verzija 1.1!");

        int zbir = Operacije.saberi(5, 3);
        int razlika = Operacije.oduzmi(5, 3);
        int proizvod = Operacije.pomnozi(5, 3);
        double kolicnik = Operacije.podeli(10, 2);

        System.out.println("Sabiranje: 5 + 3 = " + zbir);
        System.out.println("Oduzimanje: 5 - 3 = " + razlika);
        System.out.println("Množenje: 5 * 3 = " + proizvod);
        System.out.println("Deljenje: 10 / 2 = " + kolicnik);
    }
}
  