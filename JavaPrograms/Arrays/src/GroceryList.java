import java.util.ArrayList;

// grocery list class

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    // adds an element
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    // print arrayList with .get() and .size()
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }
    }

    // modify new item
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    // remove items
    public void removeGroceryItem(int position) {
        String item = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
       // boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        // returns -1 if not found
        if(position >= 0) {
            return groceryList.get(position); // returns string
        }
        return null;
    }
}
