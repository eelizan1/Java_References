/**
 * Created by eeliz_000 on 5/12/2017.
 */
public class binSearch {
    public static void main(String[] args) {
        int[] array = {2, 6, 13, 21, 36, 47, 63, 81, 97};
        System.out.println(search(13, array));

    }
    static int search(int value, int []arr) {
        int size = arr.length;
        int start = 0;
        int end = size - 1;
        int mid;
        while(start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == value)
                return mid;
            else if (value < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
