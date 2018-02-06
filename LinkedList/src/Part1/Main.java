package Part1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Enrico", 54.96);
        Customer customer2;
        customer2 = customer; // points to the same address, so any value changes will effect the original value
        customer.setBalance(12.18);
        System.out.println(customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i = 0; i < intList.size(); i++) {
            System.out.println(i);
        }

        intList.add(1, 2); // inserts 2 in index position 1

        /*
        * PROBLEM: IF YOU INSERT, ALL THE OTHER ITEMS AFTER NEED TO BE SHIFTED DOWN WHICH IS BAD FOR LARGE AMOUNTS OF DATA
        * ALTERNATIVE - LINKED LIST
        * */

        for(int i = 0; i < intList.size(); i++) {
            System.out.println(i);
        }

    }
}
