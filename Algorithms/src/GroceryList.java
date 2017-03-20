import java.util.ArrayList;

/**
 * Created by eeliz_000 on 3/19/2017.
 *
 * Demonstrates the ArrayList
 * Methods: .size(), .get(). add(), .set(), .remove
 */
public class GroceryList {
    // ArrayList is actually a class and can have its own constructor
    private ArrayList<String> groceryList = new ArrayList<String>();

    // function to add a value to the arrayList
    public void addGroceryItem(String item) {
        // built in add function
        groceryList.add(item);
    }

    public void printList() {
        // .size() returns how many elements are in the array list
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        // .get() accesses the list to print
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    // update or replace an item in the list
    public void modifyList(int position, String newItem){
        groceryList.set(position, newItem);
        // note: use position + 1 because of 0 based index
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void removeItem(int position) {
        // get item first
        String theItem = groceryList.get(position);
        groceryList.remove(position);

        // note: remove will adjust array
        // milk, cheese, bread
        // remove(cheese)
        // milk, bread
    }

    // to find an item in the list
    public String findItem(String item) {
        // .contains is faster than looping through one by one
        // returns a boolean value
        //boolean exits = groceryList.contains(item);

        //indexOf
        // return -1 if not there, returns >=0 if there
        int position = groceryList.indexOf(item);
        if(position > 0) {
            return groceryList.get(position);
        }
            return null;
    }
}
