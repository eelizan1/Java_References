import java.util.*;

public class GroceryMain {
    private static Scanner scan = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions(); // how to use the grocerylist
        // loop until user wants to exits
        while(quit) {
            System.out.println("Enter your choice");
            choice = scan.nextInt();
            // clear input buffer;
            scan.nextLine();
            // user choices
            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
    private static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options,");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search an item from the list");
        System.out.println("\t 6 - To exit the application");
    }

}
