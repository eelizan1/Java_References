/**
 * Created by eeliz_000 on 3/20/2017.
 *
 * Read from File
 */
import java.util.*;
import java.io.*;
public class readFile {

    private Scanner x;

    public void opepnFile() {
        try {
            x = new Scanner(new File("E://MyFiles//School//Java References//Basics//src//text.txt"));
        } catch (Exception e) {
            System.out.println("Could not open file");
        }
    }

    public void readFile(){
        while(x.hasNext()) {
            // assigns 20
            String a = x.next();

            // assigns Bucky
            String b = x.next();

            // assigns Roberts
            String c = x.next();

            System.out.printf("%s %s %s\n", a,b,c);
        }
    }

    public void closeFile() {
        x.close();
    }
}
