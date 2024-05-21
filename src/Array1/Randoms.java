package Array1;

import java.util.Random;

public class Randoms {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        System.out.println("Every element at an even index:");
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.println(numbers[i]);
        }
        System.out.println("\nEvery even element:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
        System.out.println("\nAll elements in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        System.out.println("\nOnly the first and last element:");
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length - 1]);
    }
}
