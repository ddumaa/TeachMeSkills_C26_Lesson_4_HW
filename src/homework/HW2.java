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
        System.out.println(Arrays.toString(arrayMy));
        System.out.println("largest value in the array: " + arrayMy[lengthArray]);
        System.out.println("smallest value in the array: " + arrayMy[0]);

        //looking for the number in the center of the array
        int middle2 = arrayMy[lengthArray / 2];
        //looking for the position of the number
        int position = Arrays.binarySearch(arrayMy, middle2);
        //calculate the average between min and max
        int middle = (arrayMy[lengthArray] - arrayMy[0]) / 2 + arrayMy[0];
        //variable for the result
        int middlepostionresult;

        //loop to find the average in an array
        for (int i = 0; i < arrayMy[lengthArray]; i++) {
            //we check whether the real average is greater than or equal to the number in position
            //and also less than or equal to the number in position +1
            if (middle >= arrayMy[position] && middle <= arrayMy[position+1]){
                //we clarify the difference in values between the average and display the nearest average
                if ((arrayMy[position] - middle) < (arrayMy[position+1] - middle)){
                    middlepostionresult = position;
                }else{
                    middlepostionresult = position + 1;
                }
                System.out.println("average value in array: " + arrayMy[middlepostionresult]);
                break;
            //change position to find the nearest average
            } else if (middle > arrayMy[position]){
                position++;
            } else if (middle < arrayMy[position]) {
                position--;
            }
        }
    }
}
