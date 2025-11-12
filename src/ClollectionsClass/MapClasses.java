package ClollectionsClass;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        Map<Integer, String> hashmap = new HashMap<>();
        //hashmap: does not maintain insertion order, allows one null and multiple null value
        hashmap.put(10, "Arthur");
        hashmap.put(20, "George");
        hashmap.put(3, "Jack");
        hashmap.put(40, "Emma");
        hashmap.put(5, "Isabella");
        hashmap.put(6, "Shay");
        hashmap.put(70, "Sophia");
        System.out.println(hashmap);

        Map<Integer, String> linkedhashmap = new LinkedHashMap<>();
        //Linked hashmap: maintain insertion order, allows one null and multiple null value
        linkedhashmap.put(10, "Arthur");
        linkedhashmap.put(20, "George");
        linkedhashmap.put(3, "Jack");
        linkedhashmap.put(40, "Emma");
        linkedhashmap.put(5, "Isabella");
        linkedhashmap.put(6, "Shay");
        linkedhashmap.put(null, null);
        System.out.println(linkedhashmap);

        Map<Integer, String> treemap = new TreeMap<>();
        //Treemap sorted order, does not null key and value and not synchronized
        treemap.put(10, "Arthur");
        treemap.put(20, "George");
        treemap.put(3, "Jack");
        treemap.put(40, "Emma");
        treemap.put(5, "Isabella");
        treemap.put(6, "Shay");
        //treemap.put(null, null);//get a null pointer exception
        System.out.println(treemap);
        Map<Integer, String> hashtable = new Hashtable<>();
        //Hashtable does not maintain insertion order, does not allow any null key and null value
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Isabella");
        hashtable.put(6, "Shay");
        //hashtable.put(null, null);//Get null pointer exception
        System.out.println(hashtable);
    }
}
