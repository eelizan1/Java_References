/*
 * Created by eeliz_000 on 5/12/2017.
 * Basic implementation of inheritance
 */
public class Main {
    public static void main(String[] args){
        // animal constructor
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        // dog constructor
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");

        // dog using animal functions
        // eat and move defined in animal class
        dog.eat();
        dog.move();
    }
}
