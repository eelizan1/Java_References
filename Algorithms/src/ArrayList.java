/**
 * Created by eeliz_000 on 3/19/2017.
 *
 * Use GroceryList class
 */

import java.util.*;

public class ArrayList {
    private static Scanner scanner = new Scanner(System.in);
    // initialize the GroceryList class
    private static GroceryList list = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: " );
            choice = scanner.nextInt();
            scanner.nextLine();
            /*
            These methods will be written
                printInstructions,
                addItem,
                modifyItem,
                removeItem,
                searchForItem
             */

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    list.printList();
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

    public static void printInstructions(){
        System.out.println("\nPress: ");
        System.out.println("\t 0 - To modify choice options");
        System.out.println("\t 1 - To print list");
        System.out.println("\t 2 - To add to list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search an item from the list");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addItem() {
        System.out.print("Enter the grocery item to add: ");
        list.addGroceryItem(scanner.nextLine());
    }

    public static void removeItem() {
        System.out.print("Enter the grocery item to remove: ");
        int item = scanner.nextInt();
        scanner.nextLine();
        list.removeItem(item);
    }

    public static void modifyItem() {
        System.out.println("Enter item to modify");
        int item = scanner.nextInt();
        System.out.print("Enter replacement item: ");
        String replacement = scanner.nextLine();
        list.modifyList(item - 1, replacement);
    }

    public static void searchForItem() {
        System.out.print("Enter item to search: ");
        String item = list.findItem(scanner.nextLine());
        if(item != null){
            System.out.print("Found item at");
        } else {
            System.out.println(item + " is not found");
        }
    }
}
