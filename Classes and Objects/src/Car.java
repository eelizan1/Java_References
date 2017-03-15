/**
 * Created by eeliz_000 on 3/13/2017.
 */

/*
Access Modifiers:
public means unrestricted to the class
private - no other class can access
*/

public class Car {
    // create fields for class
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

   /*
    Getters and Setters
    */

    // public method tp update the model
    // setter method
    // this should be public so instances of the class can use this method to act on the private class variables
    public void setModel(String model) {
        // 'this' refers to the field model of the class
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("turbo")){
            this.model = model;
        } else
            this.model = "unknown";
    }

    public String getModel() {
        return this.model;
    }

}
