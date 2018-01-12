import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] myIntArray = new int[10];
////        myIntArray[5] = 50; // 50 at element 6
////
////        double[] myDoubleArray = new double[10];
////        System.out.println(myIntArray[5]);
//        for(int i =0; i < 10; i++) {
//            myIntArray[i] = i * 10;
//        }

    int[] myIntegers = getIntegers(5);
    print(myIntegers, myIntegers.length);
    System.out.println();
    System.out.println("Average: " + getAverage(myIntegers));

    }
    private static void print(int[] array, int length) {
        for(int i =0 ;i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // returns an int array after values are inputed from scanner
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " values. \r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            values[i] = scan.nextInt();
        }
        return values;
    }

    // return double type since average may not be whole number
    private static double getAverage(int[] array) {
        double average;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = (double) sum/array.length;
        return average;
    }
}
