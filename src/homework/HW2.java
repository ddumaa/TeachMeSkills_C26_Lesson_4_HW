package homework;

import java.util.Arrays;
import java.util.Scanner;

//We create an array of a given size, fill it with random numbers,
//and display the largest, smallest, and average number from the array.

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int input = scanner.nextInt();
        int[] arrayMy = new int[input];
        for (int i = 0; i < input; i++) {
            int a = 0;
            int b = 100;
            arrayMy[i] = a + (int) (Math.random() * b);
        }
        Arrays.sort(arrayMy);
        int lengthArray = arrayMy.length - 1;
        System.out.println("largest value in the array: " + arrayMy[lengthArray]);
        System.out.println("smallest value in the array: " + arrayMy[0]);
        System.out.println("average value in array: " + arrayMy[lengthArray / 2]);
    }
}
