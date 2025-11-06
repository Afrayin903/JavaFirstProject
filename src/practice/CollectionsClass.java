package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30, 20, 37, 56, 20, 75, 21, 4, 20, 8, 34, 12, 66, 37, 17, 55));
        System.out.println(list);
        Collections.sort(list);
        System.out.println("\n" + list);
        //Max, min methods in collections
        Integer num = Collections.max(list);
        Integer num2 = Collections.min(list);
        System.out.println("Max number: " + num + "\nMinimum: " + num2);
        //swap method in Collection interface
        Collections.swap(list, 0, list.size()-1);
        System.out.println(list);
        //Reverse method in Collection interface
        Collections.reverse(list);
        System.out.println(list);
        //frequency method in Collection interface. Count duplicated elements appearance
        Integer frequency = Collections.frequency(list, 20);
        System.out.println(frequency);
    }

}

