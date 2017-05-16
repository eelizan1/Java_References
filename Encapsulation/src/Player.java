/*
 * Created by eeliz_000 on 5/16/2017.
 * Demonstrates without the use of Encapsulation
 */
public class Player {
    // notice the public scope
    public String name;
    public int health;
    public String weapon;
    public int lives = 5;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
            // reduce number of lives remaining for the player
            lives--;
        }
    }

    public int healthRemaining(){
        return this.health;
    }

    public int livesRemaining(){
        return this.lives;
    }
}
