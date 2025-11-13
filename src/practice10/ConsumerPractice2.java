package practice10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsumerPractice2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Max", "John", "Kelly", "Adam"));
        names.forEach((p) ->{
            if(p.startsWith("K")){
                System.out.println(p);
            }
        });
    }
}
