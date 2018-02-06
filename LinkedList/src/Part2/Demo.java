package Part2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> places = new LinkedList<String>();
        places.add("Sydney");
        places.add("Melbourne");
        places.add("Brisbane");
        places.add("Perth");
        places.add("Canberra");
        places.add("Adelaide");
        places.add("Darwin");

        printList(places);

        // add new item at index 1
        places.add(1, "Alice Springs");
        // remove item at position 4
        places.remove(4);
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
        // use a list iterator - used for insertion
        ListIterator<String>stringListIterator = linkedList.listIterator();
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
    }
}
