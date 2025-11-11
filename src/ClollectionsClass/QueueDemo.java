package ClollectionsClass;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue <Integer> queue1 = new PriorityQueue<>();//Allow duplicate multiple element
        queue1.addAll(Arrays.asList(10, 3, 17, 34, 21));//Retrieve element can not be use index
        System.out.println(queue1);//Does not maintain insertion order.

        Queue <Integer> queue12 = new ArrayDeque<>();
        queue12.addAll(Arrays.asList(10, 3, 17, 34, 21));
        System.out.println(queue12);

        Queue <Integer> queue13 = new LinkedList<>();//reference use Queue cant linked-list can't access get() method only way to access it down-casting
        queue13.addAll(Arrays.asList(10, 3, 17, 34, 21));
        System.out.println(queue13);

        //for example
        System.out.println(((LinkedList) queue13).get(2));

        queue1.poll();//elements size reduce
        queue12.poll();
        queue13.poll();
        System.out.println("\nPriorityQueue: " +queue1+ "\narrayDequeue " +queue12+ "\narrayList " +queue13);


    }
}
