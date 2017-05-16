/**
 * Created by eeliz_000 on 5/15/2017.
 */
public class startPattern2 {
    public static void main(String[] args) {
        for(int i = 1; i <=4; i++) {
            for(int j = 1; j <=4; j++) {
                // condition
                if(i >= j)
                    System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
