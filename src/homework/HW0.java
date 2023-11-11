package homework;

import java.util.Arrays;
import java.util.Scanner;

//Checking for the presence of a number in an array

public class HW0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to search");
        int a = scanner.nextInt();
        int[] numbers = {7, 8, 15, 24, 32, 10, 48};
        Arrays.sort(numbers);
        int out = Arrays.binarySearch(numbers, a);
        if (Math.signum(out) == -1){
            System.out.println("Number not found in array");
        } else if (numbers[out] == a) {
            System.out.println("Number found in array");
        }
    }
}
