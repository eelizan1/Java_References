/**
 * Created by eeliz_000 on 5/16/2017.
 */
public class EnhancedMain {
    public static void main(String[] args) {
        EnhancedPlayer player = new EnhancedPlayer("Enrico", 50, "Sword");
        // because you can't access directly, you use getHealth
        // now there's no way to change the health variable
        System.out.println("Initial health is: " + player.getHealth());
    }
}
