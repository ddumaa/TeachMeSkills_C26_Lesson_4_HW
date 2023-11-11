package homework;

import java.util.Arrays;

//Creating an array and filling it
//Replacing odd numbers with 0

public class HWadditional5 {
    public static void main(String[] args) {
        int[] arrays1 = new int[10];
        for (int i = 0; i < arrays1.length; i++) {
            int a = 0;
            int b = 100;
            arrays1[i] = a + (int) (Math.random() * b);
        }
        System.out.println(Arrays.toString(arrays1));
        for (int i = 0; i < arrays1.length ; i++) {
            if (arrays1[i] % 2 != 0) {
                arrays1[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arrays1));
    }
}
