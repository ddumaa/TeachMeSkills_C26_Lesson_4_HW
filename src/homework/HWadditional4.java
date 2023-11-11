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
        int [] array2 = new int[input];
        for (int i = 0; i < input; i++) {
            int a = 0;
            int b = 100;
            array1[i] = a + (int) (Math.random() * b);
            if(array1[i] %2 == 0){
                array2[i] = array1[i];
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
