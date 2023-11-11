package homework;

import java.util.Arrays;
import java.util.Scanner;

public class HWadditional7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int sizeArray = scanner.nextInt();
        int[] array1 = new int[sizeArray];
        for (int i = 0; i < array1.length; i++) {
            int a = 0;
            int b = 100;
            array1[i] = a + (int) (Math.random() * b);
        }
        //bubble sort array
        for (int j = array1.length-1 ; j>0 ; j--){
            for (int i = 0; i < j ; i++) {
                if (array1[i] > array1[i + 1]) {
                int dlc = array1[i];
                array1[i] = array1[i + 1];
                array1[i + 1] = dlc;
                }
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}
