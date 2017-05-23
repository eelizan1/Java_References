/**
 * Created by eeliz_000 on 5/23/2017.
 */
public class Gearbox {
    private boolean clutchIsIn;

//    public void operateClutch(String inOrOut) {
//        // if "in" then clutchIsIn is set to true
//        this.clutchIsIn = inOrOut.equalsIgnoreCase("in");
//    }

    /*
       What an interface actually is, is a commitment or contract that the method signatures
       that those variables in the interface constants defined will not change

       Prevents breaking code if you change the Gearbox class while other classes with different method types
    */
    public void operateClutch(boolean inOrOut) {
        this.clutchIsIn = inOrOut;
    }
}
