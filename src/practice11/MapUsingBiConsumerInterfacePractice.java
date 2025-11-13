package practice11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapUsingBiConsumerInterfacePractice {
    public static void main(String[] args) {
        Map <Integer, String> map = new HashMap<>();
        map.put(1, "Bilal");
        map.put(2, "Ali");
        map.put(3, "John");
        map.put(4, "Adam");
        map.put(5, "Tursinay");

        map.forEach((k, s)->{
            if(k % 2 == 0){
                System.out.println(s);
            }
        });
    }
}
