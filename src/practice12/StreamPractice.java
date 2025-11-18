package practice12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        int [] arr =  {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> list = new ArrayList<>();
       //List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 13, 14, 20, 33, 27, 37, 56);
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 13, 14, 20, 33, 27, 37, 56));
        Arrays.stream(arr);
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Stream<Integer> stream = list.stream();

        //============ Commonly used intermediate operation ==============
        //   map(), filter(), distinct(), sorted(), limit()
        list.stream()
                .map(x -> x*x)
                .filter(x ->x>9)
                .distinct()
                .sorted()
                .limit(3)
                .forEach(System.out::println);
                //.forEach(x -> System.out.println(x));
        System.out.println("List = " +list);

        //=======================================================
        List <Integer> squares = list.stream()
                .map(s ->s/s * s)
                .collect(Collectors.toList());
        System.out.println("Squares = " + squares);

        int sum = list.stream()
                .map(s ->s/s * s)
                .reduce(0, (num1, num2)-> num1 + num2);
        System.out.println("Sum = " + sum);

        long count = list.stream()
                .map(s ->s/s * s)
                .count();
        System.out.println("Count = " + count);

        Integer firstValue = list.stream()
                .map(s ->s/s * s)
                .findFirst().get();
        System.out.println("firstValue = " + firstValue);

        boolean anyMatch = list.stream()
                .map(s ->s/s * s)
                .anyMatch(s ->s < 20);
        System.out.println("anyMatch = " + anyMatch);

        boolean allMatch = list.stream()
                .map(s ->s/s * s)
                .allMatch(s ->s < 29);
        System.out.println("All match = " + allMatch);
    }
}
