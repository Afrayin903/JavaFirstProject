package practice7;

import java.time.DayOfWeek;
import java.time.LocalDate;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Day day1 = Day.TUESDAY;
        System.out.println(day1);

        //in order to print all day we use value() method
        Day [] days = Day.values();
        System.out.println(Arrays.toString(days));


        //How to use switch method for enum day
        // Get the current date
        LocalDate today = LocalDate.now();
        DayOfWeek day = today.getDayOfWeek();
        switch (day){
            case MONDAY -> System.out.println("Today is Monday");
            case TUESDAY -> System.out.println("Today is Tuesday");
            case WEDNESDAY -> System.out.println("Today is Wednesday");
            case THURSDAY -> System.out.println("Today is Thursday");
            case FRIDAY -> System.out.println("Today is Friday");
            case SATURDAY -> System.out.println("Today is Saturday");
            default -> System.out.println("Today is Sunday");
        }

    }
}
