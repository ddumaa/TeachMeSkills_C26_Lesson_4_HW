package homework;

import java.util.Arrays;
import java.util.Scanner;

//searching and removing a number from an array, method 2 (in the form in which this is possible)

public class HW1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to search and delete");
        int a = scanner.nextInt();
        int[] numbers = {7, 8, 15, 24, 32, 10, 48, 36};
        int[] arrayNew = new int[numbers.length];
        Arrays.sort(numbers);
        int out = Arrays.binarySearch(numbers, a);
        for (int i = 0; i < numbers.length; i++) {
            if (Math.signum(out) == -1){
                for (int j = 0; j < numbers.length; j++) {
                    arrayNew[i] = numbers[i];
                } if (i<1) System.out.println("Number not found in array");
            } else if (numbers[i] != numbers[out]) {
                arrayNew[i] = numbers[i];
            }
        }
        System.out.println(Arrays.toString(arrayNew));
    }
}
