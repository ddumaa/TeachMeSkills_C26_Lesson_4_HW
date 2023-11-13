package homework;

import java.util.Arrays;
import java.util.Scanner;

/*Checking the input number for a limitation.
Creating two arrays.
Writing random numbers to the first array.
Writing even numbers to the second array and output.*/

public class HWadditional4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size from 5 to 10");
        int input = scanner.nextInt();
        if (input < 5 || input > 10) {
            System.out.println("Enter correct input parameters");
            return;
        }

        int [] array1 = new int[input];

        int odd = 0;
        for (int i = 0; i < input; i++) {
            int a = 0;
            int b = 100;
            array1[i] = a + (int) (Math.random() * b);
            if (array1[i] %2 != 0){
                odd++;
            }
        }

        int [] array2 = new int[array1.length-odd];
        int position = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] %2 == 0) {
                array2[position] = array1[i];
                position++;
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
