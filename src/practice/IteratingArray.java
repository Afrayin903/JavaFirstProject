package practice;

public class IteratingArray {
    public static void main(String[] args) {
        int [] numbers = {10, 30, 12,17,84,78, 03, 67, 33};

        for (int i = 0; i<=numbers.length-1; i++){
            System.out.print(" " + numbers[i]);
        }
        System.out.println("\n ==============================");

        for (int i = numbers.length-1; i >=0 ; i--) {
            System.out.print(" " + numbers[i]);
        }

        System.out.println("\n ==============================");

        for (int number: numbers) {
            System.out.print(" " + number);
        }
    }
}
