import java.util.Arrays;

/**
 * Created by eeliz_000 on 3/16/2017.
 */
public class InsertionSort {
    public static void main(String[] args) {

        int[] array = {2, 7, 8, 9, 12};
        System.out.println(Arrays.toString(insertionsort(array)));

    }

    public static int[] insertionsort(int[] array) {
        // want to access ALL elements so length - 1
        for(int i = 0; i < array.length - 1; i++) {
            // save element of index i
            int current = array[i];
            // then start accessing array starting from the previous index of i
            int j = i - 1;
            // now compare elements of the array 1 by 1 with the current element going to the left
            // It'll check if the current element is less than these elements
            // Do this until you have reached the left most end OR when j is greater than the current element
            while(j >= 0 && array[j] > current) {
                // while true keep shifting j to the right
                array[j+1] = array[j];
                // reduce value of j by 1
                j = j - 1;
            }
            // while loop ends once current > j
//            array[j + 1] = current;
//            array[j + 1] = current
//            example: [2, 5, ___, 8, 12]
//            current = 7
//            j is pointing to 5, so add 1 (array[j + 1] = current)
//            to fill spot
        }

        return array;
    }

}
