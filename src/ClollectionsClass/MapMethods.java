package ClollectionsClass;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedhashmap = new LinkedHashMap<>();
        //Linked hashmap: maintain insertion order, allows one null and multiple null value
        linkedhashmap.put(10, "Arthur");
        linkedhashmap.put(20, "George");
        linkedhashmap.put(3, "Jack");
        linkedhashmap.put(40, "Emma");
        linkedhashmap.put(null, null);

        LinkedHashMap<Integer, String> linkedhashmap2 = new LinkedHashMap<>();
        linkedhashmap2.put(23, "Ramadan");

        System.out.println("Size of the map " + linkedhashmap.size() + "\nkey and value: " + linkedhashmap
                + "\nGet an element using key: " + linkedhashmap.get(3) + "\nReplaced value: "
                + linkedhashmap.replace(10, "Arthur", "Cameron")
                + "\nRemove an element value: " + linkedhashmap.remove(20)
                + "\nChecks if the given key is contained in the map: " + linkedhashmap.containsKey(27)
                + "\nChecks if the given value is contained in the map: " + linkedhashmap.containsValue("Jack")
                + "\nChecks if the map equals to given map: " + linkedhashmap.equals(linkedhashmap2));
        linkedhashmap.clear();//clearing all element key and value
        System.out.println(linkedhashmap);


    }
}
