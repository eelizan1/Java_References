/**
 * Created by eeliz_000 on 5/12/2017.
 */

/*
    Base class foe animals
 */
public class Animal {
    // fields or states of the animal
    private int brain;
    private int body;
    private int size;
    private int weight;
    private String name;

    // constructor
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // methods unique to all animals
    public void eat() {
        System.out.println("Animal.eat() is called:");
    }

    public void move() {
        System.out.println("Animal.move() is called");
    }
}
