/**
 * Created by eeliz_000 on 5/23/2017.
 */
public interface ITelephone {
    // creating "signatures'
    void poweOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
