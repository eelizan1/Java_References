/*
 * Created by eeliz_000 on 5/16/2017.
 * Use of correct encapsulation
 */
public class EnhancedPlayer {
    private String name;
    // default health
    private int health = 100;
    private String weapon;
    private int lives = 5;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        // validation to only accept health between 1 - 100
        // if validation fails, then default given health is 100
        if(health > 0 && health <=100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
            // reduce number of lives remaining for the player
            lives--;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

}
