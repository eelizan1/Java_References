/**
 * Created by eeliz_000 on 5/16/2017.
 */
public class Main {
    public static void main(String[] args) {
        /*
            since no constructor was defined,
            a default constructor with no parameters had been passed
        */
        Player player = new Player();
        /*
            Because the scope of these fields are set to public
            we are able to access the class's fields directly

            Also if we change a field name (ex. name to fullName)
            player.name will receive an error

            Every time you change the player class, you'll need to change
            the corresponding change in the Main class ... leads to complications
         */
        // manually set fields for default constructor
        player.name = "Enrico";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health: " + player.healthRemaining());

        damage = 11;
        /*
            LACK OF ENCAPSULATION: CAN ACCESS HEALTH DIRECTLY
            Made health = 200
         */
        player.health = 200;

        player.loseHealth(damage);
        System.out.println("Remaining health: " + player.healthRemaining());
        System.out.println("Remaining Lives: " + player.livesRemaining());
    }
}
