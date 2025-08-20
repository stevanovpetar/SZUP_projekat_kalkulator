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
        int rezultat = saberi(5, 3);
        System.out.println("Sabiranje: 5 + 3 = " + rezultat);
    }

    public static int saberi(int a, int b) {
        return a + b;
    }
}
