/*
 * Created by eeliz_000 on 5/23/2017.
 */
public class DeskPhone implements ITelephone {

    private long myNumber;
    private boolean isRinging;

    public DeskPhone(long myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void poweOn() {
        System.out.println("No action taken, desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing" + phoneNumber + " on desk phone" );
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
