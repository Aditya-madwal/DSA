import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
        // student : marks
        HashMap<String, Integer> map1 = new HashMap<>();

        // insertion in hasmap :
        map1.put("aditya", 87);
        map1.put("ayush", 90);
        map1.put("rahul", 78);
        map1.put("riya", 96);
        map1.put("aditya", 88); // inserting already existing item will just update the previous item.

        System.out.println(map1);

        // to check if key present in the map :

        System.out.println(map1.containsKey("aditya"));

        // to get the value at some key :

        System.out.println(map1.get("aditya"));

        System.out.println(map1.get("shubham")); // prints null since no shubham is in the map

        // some basic operations on map :

        // map1.clear(); // clears the whole map
        // System.out.println(map1);

    }
}
