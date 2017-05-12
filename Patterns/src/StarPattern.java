/**
 * Created by eeliz_000 on 5/12/2017.
 */
import java.util.Scanner;

public class StarPattern {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of stars");
        int num = scan.nextInt();
        int size = num;
        for(int i = 1; i <= size; i++)
        {
            for(int j = size; j >= 1; j--) {
                if(j > i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
