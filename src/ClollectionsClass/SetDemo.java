package ClollectionsClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10, 0, 15, 19,23,40));//no guarantee insertion order.
        hashSet.add(null);//only allow one null value
        System.out.println(hashSet);//No duplicate element

        Set<Integer> treeSet = new TreeSet<>();//No duplicate
        treeSet.addAll(Arrays.asList(10, 0, 15, 19,23,40));//
        //treeSet.add(null);//Not allow add null value
        System.out.println(treeSet);//Sorted

    }
}
