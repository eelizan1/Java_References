package Strings;

/**
 * Created by eeliz_000 on 3/25/2017.
 */
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String str = "Hello World";
        String num = "1 2 3 4 5 6 7 8";

        Scanner scan = new Scanner(str);

        // grabs first and second words but will get an error if you try to find a third
        // so use while loop
        System.out.println("The first word in the string is: " + scan.next());
        System.out.println("The second word in the string is: " + scan.next());

        // While loop
        // will search for words but when it doesn't find anympre white space or words it will end
        System.out.println("Words: ");
        while(scan.hasNext()) {
            System.out.println(scan.next());
        }

        System.out.println("Numbers: ");
        while(scan.hasNextInt()) {
            // pulls out a integers not strings
            System.out.println(scan.nextInt());
        }

    }
}
