package ClollectionsClass;

import java.util.*;

public class IterablePractice {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 13, 14, 5, 16, 17, 28, 49, 66, 71, 15, 40, 0));
        /*In order to remove any element from
        the list we have to use iterator instead using loop.
        Loop can not remove element properly
         */
//        for (int i= 0;  i<list.size()-1 ; i++) {
//            if(list.get(i) < 6){
//                list.remove(i);
//            }
//        }
//        System.out.println(list);
        //Iterator properly remove elements from the list
        Iterator <Integer> it = list.iterator();
        while (it.hasNext()){
            Integer ele = it.next();//get next element
            if(ele < 12){
                it.remove();
            }
        }
        System.out.println(list);

        System.out.println("==============================");
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Banana"); // Adding a duplicate for demonstration
        stringList.add("Date");

//        String toRemoveString = "Date";
//        Iterator <String> iterator = stringList.iterator();
//        while (iterator.hasNext()){
//            String currentString = iterator.next();
//            if(currentString.equals(toRemoveString)){
//                iterator.remove();
//            }
//        }
//        System.out.println(stringList);


        System.out.println("==========================");
        //RemoveIf method can remove element without using complicated loops
        stringList.removeIf(element-> element.equals("Cherry"));
        stringList.removeIf(string -> string.startsWith("A"));
        stringList.removeIf(ele -> ele.equals("Date"));
        System.out.println(stringList);

//        System.out.println("=============================");
//        default boolean removeIf(Predicate<? super E> filter) {
//            Objects.requireNonNull(filter);
//            boolean removed = false;
//            final Iterator<E> each = iterator();
//            while (each.hasNext()) {
//                if (filter.test(each.next())) {
//                    each.remove();
//                    removed = true;
//                }
//            }
//            return removed;
//        }
    }
}
