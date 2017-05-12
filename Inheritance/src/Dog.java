/*
 * Created by eeliz_000 on 5/12/2017.
 */
public class Dog extends Animal {
    // fields specific to dog class
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // make sure to have a dog constructor that calls the animal class
    // same as animal class - initializes the base characteristics of an animal
//    public Dog(String name, int brain, int body, int size, int weight) {
//        // super - to call the constructor that is for the class that we're extending from
//        super(name, brain, body, size, weight);
//    }

    // Creating the constructor with animal fields
    // you can omit them in the arguments and add the dog fields
        public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // super - to call the constructor that is for the class that we're extending from
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    // method unique to dog
    private void chew() {
        System.out.println("Dog.chew() called");
    }

    // you override parent class methods - create a version of that same method that exists in the parent class
    // but make it unique for the child class
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
}
