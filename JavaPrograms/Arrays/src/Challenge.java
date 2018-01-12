import java.util.Scanner;

public class Challenge {
    /*
        Create a program using arrays that sorts a list of integers in descending order

     */
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        print(myIntegers, myIntegers.length);
        System.out.println();
        int[] sorted = sort(myIntegers);
        print(sorted, sorted.length);

    }

    // input values
    public static int[] getIntegers(int capacity) {
        System.out.println("Enter " + capacity + " values. \r");
        int[] values = new int[capacity];

        for(int i = 0; i < values.length; i++) {
            values[i] = scan.nextInt();
        }
        return values;
    }
    // print array
    private static void print(int[] array, int length) {
        for(int i =0 ;i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // sort array method
    private static int[] sort(int[] array) {
        // sorted array
        int[] sortedArray = new int[array.length];

        // create the copy of array
        for(int i = 0;i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        // sorting the array
        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            // if for loop isn't done sorting all the numbers, flag stays true
            // note* "sortedArray.length - 1" because of "sortedArray[i + 1]" on line 50
            for(int i = 0; i < sortedArray.length - 1; i++) {
                // if the current element is less than the next element, then swap
                if(sortedArray[i] < sortedArray[i + 1]) {
                    // swap - bubble sort (time complexity of 0n
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1]; // current is now the i + 1
                    sortedArray[i + 1] = temp; // i + 1 is now current
                    flag = true; //
                }
            }
        }
        return sortedArray;
    }
}
