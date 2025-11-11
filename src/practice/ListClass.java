package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ListClass {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(14);
        list.add(22);
        list.add(51);
        list.add(14);
        list.add(14);


        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
        int ele = list.indexOf(22);
        System.out.println(ele);
        int ele2 = list.lastIndexOf(14);
        System.out.println(ele2);
        //replace an element
        list.set(1, 18);
        System.out.println(list);
        list.set(2, 22);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.clear();
        System.out.println(list);

        System.out.println("=============================================");
        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Kahar");
        list2.add("Anker");
        list2.add("Afrayin");
        list2.add("Saffat");
        list2.add("America");

        boolean ele3 = list2.contains("Afrayin");
        System.out.println(ele3);
        boolean ele4 = list2.equals(list);
        System.out.println(ele4);
        boolean ele5 = list2.isEmpty();
        System.out.println(ele5);
        boolean ele6 = list2.containsAll(Arrays.asList("Kahar", "Anker", "Afrayin"));
        System.out.println(ele6);
        boolean ele7 = list2.addAll(Arrays.asList("Kamar", "Kasim", "Gulnur"));
        System.out.println(list2);
        System.out.println(ele7);
        boolean ele8 = list2.removeAll(Arrays.asList("Kamar", "Kasim", "Gulnur"));
        System.out.println(list2);
        System.out.println(ele8);
        //retainAll method remove un-matching elements from the ArrayList
        list2.retainAll(Arrays.asList("Kahar", "Anker", "Afrayin"));
        System.out.println(list2);






    }
}
