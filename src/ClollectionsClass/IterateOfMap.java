package ClollectionsClass;

import java.util.LinkedHashMap;
import java.util.Map;

public class IterateOfMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        //map: does not maintain insertion order, allows one null and multiple null value
        map.put(10, "Arthur");
        map.put(20, "George");
        map.put(3, "Jack");
        map.put(40, "Emma");
        map.put(5, "Isabella");
        map.put(6, "Shay");


        /*Iterating by keys.
        * keySet(): returns all the keys of map (Set)*/
       for (Integer eachKey : map.keySet()){
           System.out.print(" " + eachKey);
       }
        /*Iterating by value.
          Value(): returns all the values of map (collection)*/
        System.out.println("\n===============================");
        for (String eachValue : map.values()){
            System.out.print(" " + eachValue);
        }

        System.out.println("\n===============================");
        /*Iterating by entries.
                entrySet(): returns all entries of map (set)
        */
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
