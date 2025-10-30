package practice;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number1;
        double doubleNum;
        number1 = random.nextInt(1, 6);
        doubleNum = random.nextDouble(100.0, 1000.0);
        System.out.printf(number1 + "\nHere you go %,.2f ",  doubleNum);
    }
}
