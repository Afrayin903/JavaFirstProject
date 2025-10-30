package practice;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        //Compound interest calculator
        Scanner scanner = new Scanner(System.in);
        double principle;
        double rate;
        int timesCompound;
        int years;
        double amount;
        System.out.println("Enter the principal amount: ");
        principle = scanner.nextDouble();

        System.out.println("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() /100;

        System.out.println("Enter the # of times compounded per year: ");
        timesCompound = scanner.nextInt();

        System.out.println("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principle * Math.pow(1 + rate / timesCompound, timesCompound * years);

        System.out.printf("The amount after %d years is $%.2f", years, amount);

        scanner.close();
    }
}
