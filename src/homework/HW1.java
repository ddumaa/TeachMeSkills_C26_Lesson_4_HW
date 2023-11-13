package homework;

import java.util.Arrays;
import java.util.Scanner;

//searching and removing a number from an array (in the form in which this is possible)

public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to search and delete");
        int a = scanner.nextInt();
        int[] numbers = {7, 8, 15, 24, 8, 10, 7, 15};

        Arrays.sort(numbers);
        int out = Arrays.binarySearch(numbers, a);
        int sum = 0;

        if (Math.signum(out) == -1){
            System.out.println("Number not found in array");
            return;
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] == a){
                    sum++;
                }
            }
        }
        int [] arrayNew = new int[numbers.length-sum];
        int position = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != a) {
                arrayNew[position] = numbers[i];
                position++;
            }
        }
        System.out.println(Arrays.toString(arrayNew));
    }
}
