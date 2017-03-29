package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;

/**
 * Created by eeliz_000 on 3/25/2017.
 * Encapsulate the location data
 * Map will be used to store data from an external source
 *
 * USES STRING.SPLIT
 */
public class Locations3 implements Map<Integer, Location> {
    // A map to store the locations
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) throws IOException {
        // Write data out to a file
        try(FileWriter locFile = new FileWriter("locations.txt");
            FileWriter dirFile = new FileWriter("directions.txt")) {
            for(Location location : locations.values()) {
                locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
                for(String direction : location.getExits().keySet()) {
                    dirFile.write(location.getLocationID() + "," + direction + "," + location.getExits().get(direction) + "\n");
                }
            }
        }
    }

    // static block is exectued once and that's when the locations class is loaded
    // So all the data will be available by the time we're able to execute any methods in the class
    // As a result, we can create a main method to write out the locations and exits data to files
    // Using File Writer object
    static {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader("locations_big.txt"));
            // delimiter is used to let scanner know our information is seperated by a comma
            scanner.useDelimiter(",");
            while(scanner.hasNextLine()) {
                // hold location data
                int location = scanner.nextInt();
                // skips over comma to move over to the next section
                scanner.skip(scanner.delimiter());
                // hold description data
                String description = scanner.nextLine();
                // for testing purposes
                System.out.println("Location: " + location + " : " + "Description: " + description);

                // create location object for data values
                Map<String, Integer> tempExit = new HashMap<>();
                // creates a new location object with data values
                locations.put(location, new Location(location, description, tempExit));

            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(scanner != null) {
                scanner.close();
            }
        }

        // Now read the exits
        try {
            // reads direction text file but uses buffer reader
            // buffer reader is much faster
            scanner = new Scanner(new BufferedReader(new FileReader("directions_big.txt")));
            scanner.useDelimiter(",");
            // while loop scans the file
            while(scanner.hasNextLine()) {

                /*
                    USES string.split();
                 */
                // start by reading the entire line
                String input = scanner.nextLine();
                // create string array that gets every one of the fields in that line
                // use split like the delimiter
                String[] data = input.split(",");
                // location stored in first array element
                int loc = Integer.parseInt(data[0]);
                String direction = data[1];
                int destination = Integer.parseInt(data[2]);

                System.out.println(loc + " : " + direction + " : " + destination);

                // Store in map object
                Location location = locations.get(loc);
                location.addExit(direction, destination);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // close scanner if it's open
            // null is closed
            if(scanner != null) {
                scanner.close();
            }
        }





//        Map<String, Integer> tempExit = new HashMap<String, Integer>();
//        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",null));
//
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("W", 2);
//        tempExit.put("E", 3);
//        tempExit.put("S", 4);
//        tempExit.put("N", 5);
//        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));
//
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("N", 5);
//        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));
//
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("W", 1);
//        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));
//
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("N", 1);
//        tempExit.put("W", 2);
//        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));
//
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("S", 1);
//        tempExit.put("W", 2);
//        locations.put(5, new Location(5, "You are in the forest",tempExit));


    }

    //returns how many locations
    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return null;
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
