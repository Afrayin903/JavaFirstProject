package practice9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateClass2 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,0,10,11,12,13,14,15,16,17,18));
        Predicate <Integer> oddNum = num-> num % 2 != 0;
        boolean result = list.removeIf(oddNum);
        System.out.println(result + "\nEven numbers: " + list);
    }
}
