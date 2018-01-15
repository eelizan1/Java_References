import java.util.*;
// changing the size of the array while preserving the data
public class ArrayResize {
    private static Scanner scan = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 integers");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 12 integers");
        getInput();
        printArray(baseData);
    }

    private static void getInput() {
        for(int i = 0; i < baseData.length; i++) {
            baseData[i] = scan.nextInt();
        }
    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // resizing the array
    private static void resizeArray() {
        int[] original = baseData; // save array

        baseData = new int[12]; // reinitialize first array
        for(int i = 0; i < original.length; i++) {
            baseData[i] = original[i]; // copy contents into new array
        }
    }
}
