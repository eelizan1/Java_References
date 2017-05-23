/*
 * Created by eeliz_000 on 5/23/2017.
 * Interface - Specifies methods that a particular class that
 * implements the interface must implement
 *
 * Interface itself is abstract which means no actual code for any of the methods.
 * You only supply the actual method names and parameters
 *
 * The actual code still goes in the actual class that you're creating
 *
 * Idea: To provide a common behavior that can be used by several classes by having them all implement the
 * same interface
 *
 * It's really a way to standardize the way a particular set of classes is used
 *
 * What an interface actually is, is a commitment or contract that the method signatures
 * that those variables in the interface constants defined will not change
 */

public class Main {
    public static void main(String[] args) {
        ITelephone phone;
        phone = new DeskPhone(678517470);
        phone.poweOn();
        phone.callPhone(123456);
        phone.answer();


    }
}
