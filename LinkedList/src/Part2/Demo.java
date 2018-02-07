package Part2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> places = new LinkedList<String>();
        addInOrder(places, "Sydney");
        addInOrder(places, "Melbourne");
        addInOrder(places, "Brisbane");
        addInOrder(places, "Perth");
        addInOrder(places, "Canberra");
        addInOrder(places, "Adelaide");
        addInOrder(places, "Darwin");
        printList(places);
        visit(places);
//        places.add("Sydney");
//        places.add("Melbourne");
//        places.add("Brisbane");
//        places.add("Perth");
//        places.add("Canberra");
//        places.add("Adelaide");
//        places.add("Darwin");
//
//        printList(places);
//
//        // add new item at index 1
//        places.add(1, "Alice Springs");
//        // remove item at position 4
//        places.remove(4);
    }

    private static void printList(LinkedList<String> list) {
        // use an iterator to loop through the list
        Iterator<String> i = list.iterator();
        // while there's a next item
        while(i.hasNext()) {
            // show current record
            System.out.println(i.next());
        }
        System.out.println("===============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        /*
        * Key methods:
        * .next() - returns the next element in the iteration
        * .hasNext() - returns true if the iteration has more values
        * */

        // use a list iterator - used for insertion
        ListIterator<String>stringListIterator = linkedList.listIterator();
        // note: the list iterator isn't point to the first entry so must use the .next() on line 44
        while(stringListIterator.hasNext()) {
            // returns a number
            // 0 - actually match, so don't add anything
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included");
                return false;
            } else if(comparison > 0) {
                // new city should appear before this one
                // ex. Brisbane -> Adelaide
                // but need to go to previous because .next() has already advanced to the next item
                stringListIterator.previous(); // go back
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0) {
                // move on to next city
                // already moves on cuz of .next()
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true; // track direction
        ListIterator<String> listIterator = cities.listIterator();

        // test to see if there are no cities
        if(cities.isEmpty()) {
            System.out.println("No Cities in the itenerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next(); // sets up to go in the right direction
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of list");
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }

        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
        "1 - go to next city\n" +
        "2 - go tp previous city\n" +
        "3 - print menu options");
    }
}
