package Arrays;

/**
 * Created by eeliz_000 on 4/2/2017.
 */
public class Array {
    private int[] arr = {1, 5, 3, 8, 10};
    public static void main(String[] args) {

    }

    public int delete(int[] arrary) {
        int key = 3;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key)
                break;
            for(int j = i; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];

            }
        }
    }
}
