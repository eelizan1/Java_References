/**
 * Created by eeliz_000 on 3/15/2017.
 *
 * Searching algorithm that uses divides and conquer by halves
 * Data MUST be sorted first!
 *
 * Time Complexity: O(logn)
 */

import java.util.*;

public class BinarySearch {
    public static boolean binarySearchRecursive(int[] array, int x, int left, int right) {
        if (left > right) {
            return false;
        }

        int mid = (left + right) / 2;
        if (array[mid] == x) {
            return true;
        }
        return false;
    }

    public static boolean binarySearchRecursive(int[] array, int x) {
        return binarySearchRecursive(array, x, 0, array.length - 1);
    }

    public static void main (String[] args) {

    }

}
