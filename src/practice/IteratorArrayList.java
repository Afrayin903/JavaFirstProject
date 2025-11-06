package practice;

import java.util.ArrayList;

public class IteratorArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        for (int i =0; i<list.size(); i++){
            System.out.print(" " + list.get(i));
        }
        System.out.println("\n=======================");
        for (int i=list.size()-1; i>=0; i--){
            System.out.print(" " + list.get(i));
        }
        //list.fori keyword to populate for loop
    }
}
