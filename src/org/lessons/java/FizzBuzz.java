package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti numeri vuoi stampare?");
        int numbersQuantity = scanner.nextInt();

        if (numbersQuantity <= 0 || numbersQuantity > 1000) {
            System.out.println("Il numero inserito non è valido. Devi inserire un numero compreso tra 1 e 1000");
            return;
        }

        for (int i = 1; i <= numbersQuantity; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
