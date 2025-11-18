package practice12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOperations {
    public static void main(String[] args) {
        //distinct(): returns the distinct elements in the stream after eliminating the duplicates
        List<Integer> list1 = Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3);
        list1 = list1.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list1);

        //skip(n): returns the elements in the stream after skipping the first n elements
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list2 = list2.stream().skip(7).collect(Collectors.toList());
        System.out.println(list2);

        //limit: returns first n elements in the stream
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list3 = list3.stream().limit(5).collect(Collectors.toList());
        System.out.println(list3);

        //map(Function): used for transforming the elements in the stream by applying the specified Function
        List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list4 = list4.stream().map(s -> {
            if (s % 2 != 0) return s * 2;
            else return s;
        }).collect(Collectors.toList());
        System.out.println(list4);

        //filter(Predicate): used for filtering the elements in the stream by applying the specified Predicate condition
        List<Integer> list5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list5 = list5.stream().filter(p -> (p % 3 == 0)).collect(Collectors.toList());
        System.out.println(list5);

        //sorted(); used for sorting the elements in the stream
        List<Integer> list6 = Arrays.asList(11, 2, 31, 4, 51, 6, 17, 18, 29);
        list6 = list6.stream().sorted().collect(Collectors.toList());
        System.out.println(list6);

        //peek(Consumer): returns the elements in the stream after performing the specified operation on each element of the stream
        List<Integer> list7 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15);
        list7 = list7.stream().filter(p -> p % 5 == 0).peek(System.out::println).collect(Collectors.toList());
        System.out.println(list7);

    /*Task:
           1. Eliminate duplicates
           2. Find the string that starts with "J" ONLY
           3. Convert them all to uppercase
           4. Store them into a new list
    */
        List<String> words = Arrays.asList("Java", "JavaScript", "Python", "Java", "C#", "JavaScript", "Python", "JSON", "JSON");
        List<String> newList = words.stream().distinct().filter(p ->p.startsWith("J")).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(newList);
    }
}
