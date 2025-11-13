package practice9;

import java.util.function.Predicate;

public class PredicateClass1 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = a -> a % 2 == 0;
        boolean result = isEven.test(51);
        System.out.println(result);

        System.out.println("---------------------------");

        Predicate <String> isPalindrome = (str)->{
            String reverse = "";
            for (int i = str.length()-1; i >=0; i--) {
                reverse += str.charAt(i);

            }
            System.out.println(reverse);
            return str.equalsIgnoreCase(reverse);
        };
      boolean result2 = isPalindrome.test("BNB");
      System.out.println(result2);
   }

}
