package practice8;

import practice3.Shape;

import java.util.ArrayList;
import java.util.Arrays;

public class TestGenerics {
    public static void main(String[] args) {
        Integer [] integers = {12, 17, 33, 28, 87, 43, 76};
        Double [] decimals = {10.4, 55.28, 43.76, 89.02};
        String [] names = {"Animal", "Human", "Water", "Air", "Fire" };
        Shape triangle;
        Shape [] shapes = {null, null};

        Generics.printEach(integers);

        System.out.println("=====================");
        ArrayList<Double> scores = new ArrayList<>(Arrays.asList(10.8, 55.2, 43.06, 89.92));
        Generics.printEach(scores);

        System.out.println("=====================");
        Generics <Double> obj = new Generics<>();
        obj.printEach2(scores);
        System.out.println("---------------------");
        obj.printEach2(decimals);

        System.out.println("=====================");
        //We can also apply generic type to the interfaces

    }
}
