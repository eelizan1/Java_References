/**
 * Created by eeliz_000 on 3/16/2017.
 *
 * Demonstration of the Selection Sort Algorithm
 *
 * Time Complexity:
 *      Best: Ω(n^2)
 *      Average: Θ(n^2)
 *      Worst: Θ(n^2)
 */
import java.util.Arrays;

public class SelectionSort {

    public static void main (String[] args) {

        int[] array = {2, 7, 8, 9, 12};
        System.out.println(Arrays.toString(selectionsort(array)));

    }

    public static int[] selectionsort(int[] array) {
        for(int i = 0; i < array.length - 2; i++) {
            int minIndex = i;
            for(int j = i + 1; j < array.length - 1; j++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                    int tmp = array[minIndex];
                    array[minIndex] = array[i];
                    array[i] = tmp;
                }
            }
        }
        return array;
    }
}
