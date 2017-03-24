/**
 * Created by eeliz_000 on 3/24/2017.
 */
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.Map;

public class BasicHashMap {
    // declare hashmap
    // String associates with a boolean value
    // Key: String, Value: Boolean
    static HashMap<String, Boolean> map = new HashMap<>();

    public static void main (String[] args) {
        // put method adds a key value pair to the map
        map.put("Kenny", true);
        map.put("Joe", false);

        // get values
        // returns the boolean value
        map.get("Kenny");

        // check if key exits
        if(map.containsKey("kenny")) {
            System.out.println("It contains");
        } else
            System.out.println("does not contains");

        // checks if it contains value
        if(map.containsValue(Boolean.FALSE)) {
            System.out.println("It contains");
        } else
            System.out.println("does not contains");

        for(String s : map.keySet()) {
            System.out.println(4);
        }

        for(Boolean b : map.values()) {
            System.out.println(4);
        }
        // loops like an array list
        // returns keys and values
        // method Entry
        for(Map.Entry kv : map.entrySet()) {
            System.out.println(4);
        }

        for(Map.Entry<String, Boolean> entry : map.entrySet()) {
            String key = entry.getKey();
            Boolean value = entry.getValue();
            System.out.println("Key: " + key + "| " + "Value " + value);
        }

        // removes from map
        map.remove("kenny");
        // get size
        map.size();
    }

}
