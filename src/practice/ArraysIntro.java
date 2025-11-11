package practice;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        //Create a variable named numbers that can have 5 integers
        //int [] numbers1 = new int[]{20, 40, 60, 80, 100}; ways to express array
        int [] numbers1 = new int[5];
        numbers1[0] = 20;
        numbers1[1] = 40;
        numbers1[2] = 60;
        numbers1[3] = 80;
        numbers1[4] = 100;

        int [] numbers2 = {4, 40, 20, 7,51};
        System.out.println(Arrays.toString(numbers1) + "\n" + Arrays.toString(numbers2));
    }
}
