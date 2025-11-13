package practice10;

import java.util.function.Consumer;

public class ConsumerPractice {
    public static void main(String[] args) {
        Consumer <int []> printEach = ints -> {
            for (int each : ints) {
                System.out.println(each);
            }
        };
        int [] numbers = {10, 20, 40, 50};
        printEach.accept(numbers);
    }
}
