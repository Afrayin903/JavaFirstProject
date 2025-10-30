package practice;
//Fibonacci numbers 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

public class Fibonacci {
    public static void main(String[] args) {
       int n = 10; // Number of Fibonacci terms to generate
        long firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // Calculate the next term
            long nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println("\n===========================================");
        int n2 = 9; // The nth Fibonacci number to find
        System.out.println("The " + n2 + "th Fibonacci number is: " + fibonacci(n2));
    }
    public static long fibonacci(int n2) {
        if (n2 <= 1) {
            return n2;
        }
        return fibonacci(n2 - 1) + fibonacci(n2 - 2);
    }
}
