/*
 * Created by eeliz_000 on 5/25/2017.
 *
 * Demonstrates method overloading
 */
public class Main {
    public static void main(String[] args) {
        // prints 500 but returns 500 * 1000 into returnedScore
        int returnedScore = calculateScore("Enrico", 500);
        System.out.println(returnedScore);
        // using over loaded method option
        calculateScore(200);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points ");
        return score * 1000;
    }

    // Overloading - using the same variable names but using a different number of parameters
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points ");
        return score * 1000;
    }

    // overloaded method with no parameters
    public static int calculateScore() {
        System.out.println("No player name, no score");
        return 0;
    }
}
