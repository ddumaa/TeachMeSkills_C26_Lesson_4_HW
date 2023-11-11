package homework;


public class HW3 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        for (int i = 0; i < 5; i++) {
            int a = 0;
            int b = 100;
            array1[i] = a + (int) (Math.random() * b);
            array2[i] = a + (int) (Math.random() * b);
        }
        int array1Sum = 0;
        int array2Sum = 0;
        for (int i = 0; i < 5; i++) {
            array1Sum += array1[i];
            array2Sum += array2[i];
        }
        System.out.println("Array1 = " + array1Sum + " " + "Array2 = " + array2Sum);
        if (array1Sum > array2Sum){
            System.out.println("Array 1 is larger than array 2");
        } else if (array1Sum == array2Sum) {
            System.out.println("Array 1 and Array 2 are equal");
        } else {
            System.out.println("Array 1 changes array 2");
        }
    }
}
