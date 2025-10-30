package practice;

public class PalindromeNumber {
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to reversedNumber
            number /= 10; // Remove the last digit from the original number
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        int num1 = 121;
        int num2 = 12345;
        int num3 = 787;

        System.out.println(num1 + " is a palindrome: " + isPalindrome(num1)); // Output: true
        System.out.println(num2 + " is a palindrome: " + isPalindrome(num2)); // Output: false
        System.out.println(num3 + " is a palindrome: " + isPalindrome(num3)); // Output: true
    }
}
