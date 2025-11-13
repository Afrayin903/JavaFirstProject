package practice11;

import java.util.function.BiPredicate;

public class BiPredicateClass {
    public static void main(String[] args) {
        BiPredicate<int [], Integer> contain = (arr, number)->{
            boolean result = false;
            for (int each : arr) {
                if(each == number) {
                    result = true;
                    break;
                }
            }
            return result;
        };
        int [] arr = {16,20,34, 37};
        boolean r = contain.test(arr, 29);
        System.out.println(r);
    }
}
