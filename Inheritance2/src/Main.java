public class Main {
    public static void main(String[] args) {
        // base animal object
        Animal animal = new Animal("Animal1", 1, 1, 5, 5);
        // dog object using Animal constructor
        Dog dog1 = new Dog("Malamute", 8, 20, 2, 4, 1, 2, "silky");
        dog1.eat();
       // dog1.walk();
        dog1.run();

    }
}
