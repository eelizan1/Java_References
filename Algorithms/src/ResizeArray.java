/**
 * Created by eeliz_000 on 3/19/2017.
 *
 * Resizes the array ny adding more values while preserving the orignal values
 * Drawback: To time consuming
 *
 */
import java.util.*;

public class ResizeArray {
    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 integers: ");
        getInput();
        printArray(baseData);
        System.out.println("Enter 12 integers: ");
        getInput();
        printArray(baseData);
    }

    // get data to console and save to array
    private static void getInput(){
        for(int i = 0; i < baseData.length; i++){
            baseData[i] = s.nextInt();
        }
    }
    // prints array contents
    private static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }


    private static void resizeArray(){
        // makes a copy of baseData array
        int[] original = baseData;

        // assigns 12 elements (2 more than original) to new array
        // then takes each original element and stores it into new array copy
        baseData = new int[12];
        for(int i = 0; i < original.length; i++){
            // copys original data
            baseData[i] = original[i];
        }
    }
}
