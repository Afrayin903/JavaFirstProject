package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class IteratorArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        for (int i =0; i<list.size(); i++){
            System.out.print(" " + list.get(i));
        }
        System.out.println("\n=======================");
        for (int i=list.size()-1; i>=0; i--){
            System.out.print(" " + list.get(i));
        }
        //list.fori keyword to populate for loop
        //for each loop
        System.out.println("\n==========================");
        //Type list.for automatically get foreach loop
        for (Integer each : list) {
            System.out.print(" "+each);
        }
        System.out.println("\n=============================");
        //RemoveIf(Predicate): Remove elements from the list if they are not matching with condition.
        list.removeIf(each -> each<10);
        System.out.println(list);

        System.out.println("\n================================");
        //removeIf method tests on string
        ArrayList <String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Kahar", "Kasim", "Kamar", "Anker", "Afrayin", "Gulnur"));
        names.removeIf(p->p.startsWith("K"));
        System.out.println(names);

    }
}
