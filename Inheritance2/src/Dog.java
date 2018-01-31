/*
* DOG CLASS INHERITS FROM ANIMAL CLASS
* TO INHERIT NEED TO USE 'EXTENDS' AND THE CONSTRUCTOR WITH THE KEYWORD 'SUPER'
* */
public class Dog extends Animal{
    // unique characteristics for dogs
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // constructor that uses Animal constructor with unique Dog properties
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // constructor from Animal class
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    // overrides animal.eat()
    private void chew() {
        System.out.println("Dog.chew() called");
    }

    // override a method that is in the Animal class
    // this allows a method to be unique to Dog
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        // the private dog method
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
    }

    public void run() {
        System.out.println("Dog.run() called");
    }
}
