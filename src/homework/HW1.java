package homework;

import java.util.Arrays;
import java.util.Scanner;

//searching and removing a number from an array (in the form in which this is possible)

public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to search and delete");
        int a = scanner.nextInt();
        int[] numbers = {7, 8 ,15, 24, 32, 10, 48, 36};
        Arrays.sort(numbers);
        //System.out.println(Arrays.toString(numbers));
        int out = Arrays.binarySearch(numbers, a);
        if (Math.signum(out) == -1){
            System.out.println("Number not found in array");
        } else if (numbers[out] == a){
            numbers[out] = 0;
            System.out.println("Number removed");
            //System.out.println(Arrays.toString(numbers));
        }
    }
}
