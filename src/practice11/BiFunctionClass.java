package practice11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionClass {
    public static void main(String[] args) {
        //merge two array into a list then print out
       BiFunction <int [], int [], List<Integer>> merge = (a, b) -> {
           List <Integer> list = new ArrayList<>();
           for (int arr1 : a) {
               list.add(arr1);
           }
           for (int arr2 : b){
               list.add(arr2);
           }
           return list;
       };
         int [] array1 = {10, 20, 60};
         int [] array2 = {3, 89, 76,1023};
        List <Integer> mergedNum= merge.apply(array1, array2);
        System.out.println(mergedNum);
    }
}
