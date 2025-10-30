package practice;

import java.util.Arrays;

public class ArraysUtility {


    public static void main(String[] args) {
        //toString(): converts array object to String, returns String
        String [] names = {"Kahar", "Anker", "Afrayin", "Nihat", "Nargiz"};
        System.out.println(Arrays.toString(names));

        //sort(): sorts the array in ascending order
        int[] numbers = {5, 2, 4, 6, 8, 0};
        Arrays.sort(numbers);
        System.out.println("Sorted " + Arrays.toString(numbers));

        //equal(): compares two array objects if they have same elements in same order
        char [] arr1 = {'a', 'b', 'c'};
        char [] arr2 = {'a', 'c', 'b'};
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));

        //copyOf(array, newLength): copies the specified array elements and sets new length, returns new array
        int [] scores = {70,90,50,80,95};
        int [] scores2 = Arrays.copyOf(scores, 8);
        System.out.println(Arrays.toString(scores2));
        //copyOfRange(array, begIndex, endIndex)
        int [] scores3 = Arrays.copyOfRange(scores, 2, 3);
        System.out.println(Arrays.toString(scores3));
    }
}
