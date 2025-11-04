package practice;

import java.sql.Array;
import java.util.Arrays;

public class MultiDimensionArray {
    public static void main(String[] args) {
        int [][] arr2D = new int[3][];
        int[] arr1 = {1, 3, 12};
        int[] arr2 = {20,45,36};
        int[] arr3 = {56,12,99,3};
        arr2D[0]=arr1;
        arr2D[1]=arr2;
        arr2D[2]=arr3;

        //arr = {{1, 3, 12}, {20,45,36}, {56,12,99,3}};

        //print all array group needs to use deepToString
        System.out.println(Arrays.deepToString(arr2D));
        //print a array group
        System.out.println(Arrays.toString(arr1));
        //print a specific index array value
        System.out.println(arr2D[2][2]);

    }
}
