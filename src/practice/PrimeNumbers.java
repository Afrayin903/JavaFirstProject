package practice;
/*A prime number in Java, as in mathematics,
is a whole number greater than 1 that has only two distinct positive divisors: 1 and itself.*/
public class PrimeNumbers {
    public static boolean isPrime(int n) {
        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            return false;
        }
        // 2 is the only even prime number
        if (n == 2) {
            return true;
        }
        // Even numbers greater than 2 are not prime
        if (n % 2 == 0) {
            return false;
        }
        // Check for divisibility by odd numbers from 3 up to the square root of n
        // We only need to check up to the square root because if a number has a divisor
        // greater than its square root, it must also have a divisor smaller than its square root.
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false; // Found a divisor, so it's not prime
            }
        }
        return true; // No divisors found, so it's prime
    }

    public static void main(String[] args) {
        int number1 = 29;
        int number2 = 30;
        int number3 = 1;
        int number4 = 2;

        System.out.println(number1 + " is prime: " + isPrime(number1)); // true
        System.out.println(number2 + " is prime: " + isPrime(number2)); // false
        System.out.println(number3 + " is prime: " + isPrime(number3)); // false
        System.out.println(number4 + " is prime: " + isPrime(number4)); // true
    }
}
