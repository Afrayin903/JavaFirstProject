package practice8;

import java.util.List;

public class Generics <E> {
    public static <T> void printEach ( T [] array){
        for (T each : array) {
            System.out.println(each);
        }


    }

    public static <T> void printEach (List<T> list){
        for (T each : list) {
            System.out.println(each);
        }
    }
    public void printEach2 ( E [] array){
        for (E each : array) {
            System.out.println(each);
        }


    }

    public void printEach2 (List<E> list){
        for (E each : list) {
            System.out.println(each);
        }
    }
}
