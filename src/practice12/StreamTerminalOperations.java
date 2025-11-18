package practice12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminalOperations {
    public static void main(String[] args) {
        /*collect(), count(), forEach(), max(), anyMatch(),
        toArray(), reduce(), min(), allMatch() amd nonMatch()
         */
        /*collection(Collector): Collect all the elements of the stream
         and returns them as a specified type of collection */
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list1=list1.stream().filter(p ->p%2==0).collect(Collectors.toList());
        System.out.println(list1);

        //toArray(): Collects all the elements of the stream and returns them as an array
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        arr = Arrays.stream(arr).filter(p ->p>4).map(p->p*10).toArray();
        System.out.println(Arrays.toString(arr));

        // count(): returns the count of elements of the stream, returns type is long
        Long num = Stream.of(1, 2, 3, 4, 5, 6, 7).count();
        System.out.println(num);
        Long totalElement = Stream.of("Java", "JavaScript", "Python", "Java", "C#", "JavaScript", "Python", "JSON", "JSON")
                .filter(p->p.startsWith("J")).count();
        System.out.println(totalElement);

        // reduce(initialIdentity, BinaryOperator): combine the elements of stream and returns them as a single value
        int [] array = {4, 5, 6, 7, 8, 9};
        int sum = Arrays.stream(array).reduce(0, (x, y)->x+y);
        System.out.println(sum);

        String [] words = {"Andy", " is", " Python", " Developer", };
        String val =Arrays.stream(words).reduce("", (a, b)->a + b);
        System.out.println(val);

        //forEach(Consumer): iterates all the elements of the stream
        List<Integer> list2 = Arrays.asList(1, 2, 4, 5, 6, 8);
        list2.stream().filter(p->p>5).forEach(System.out::println);

        //min(): returns the min value of the stream
        List<Integer> list3 = Arrays.asList(1, 2, 4, 5, 6, 8, 11);
        Integer min = list3.stream().min(Integer::compareTo).get();
        System.out.println(min);

        //max(): returns the maximum value of the stream
        List<Integer> list4 = Arrays.asList(1, 2, 4, 5, 6, 8, 11);
        Integer max = list4.stream().max(Integer::compareTo).get();
        System.out.println(max);

        //allMatch(Predicate): Checks if all the elements in the stream matches with the specified predicate
        List<Integer> list5 = Arrays.asList(1, 2, 4, 5, 6, 8, 11);
        boolean result = list5.stream().allMatch(p ->p >0);
        System.out.println(result);

        //anyMatch(Predicate): Checks if any element in the stream matches with the specified predicate
        List<Integer> list6 = Arrays.asList(1, 2, 4, 5, 6, 8, 10, 12, 13);
        boolean result2 = list6.stream().anyMatch(p -> p % 10 == 0);
        System.out.println(result2);

        //nonMatch(Predicate): Checks if no element in the stream matches with the specified predicate
        List<Integer> list7 = Arrays.asList(1, 2, 4, 5, 6, 8, 11);
        boolean result3 = list7.stream().noneMatch(p -> p % 7 != 0 );
        System.out.println(result3);







    }
}
