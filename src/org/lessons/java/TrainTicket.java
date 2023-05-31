package org.lessons.java;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double euroPerKm = 0.21;
        double discountUnder18 = 0.2;
        double discountOver65 = 0.4;

        System.out.println("Inserisci il numero di km da percorrere");
        int km = scanner.nextInt();

        System.out.println("Inserisci l'età del passeggero");
        int age = scanner.nextInt();

        double totalPrice = calculatePrice(km, age, euroPerKm, discountUnder18, discountOver65);

        System.out.println("Il prezzo totale è: " + "€" + totalPrice);
    }

    public static double calculatePrice(int km, int age, double euroPerKm, double discountUnder18, double discountOver65) {
        double basePrice = km * euroPerKm;

        // Sconto per minorenni
        if (age < 18) {
            basePrice -= basePrice * discountUnder18;
        }

        // Sconto per over 65
        else if (age >= 65) {
            basePrice -= basePrice * discountOver65;
        }

        return basePrice;
    }
}
