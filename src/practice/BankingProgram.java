package practice;
import java.util.Scanner;
public class BankingProgram {
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*Java Banking program for beginners
          Declare Variables
          Display Menu
          Get and process users choice*/

        double balance = 0;
        boolean isRunning = true;
        int choice;
        while (isRunning){
            System.out.println("*****************************");
            System.out.println("Banking program");
            System.out.println("*****************************");
            System.out.println("1.Show balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("5.Invalid Selection");
            System.out.println("*****************************");
            System.out.println("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }
        //Exit Message
        System.out.println("The Banking program ended.\nTHANK YOU. \nHave a nice day!");
        scanner.close();
    }
    //Show balance()
    static void showBalance(double balance){
        System.out.println("*****************************");
        System.out.printf("$%.2f\n", balance);
    }
    //Deposit()
    static double deposit (){
       double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();
        /* if(amount < 0) {
            //throw new IllegalArgumentException("Amount can't be negative");
            System.out.println("Amount can't be negative");
        }
        return amount
        */
        System.out.println(amount < 0 ? "Amount can't be negative" : amount);
        return amount;
        //amount < 0 ? console.log("Amount can't be negative") : amount;
    }
    //Withdraw
    static double withdraw (double balance){
       double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();
        if(amount > balance){
            System.out.println("Insufficient Funds");
            return 0;
        }else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }else {
            return amount;
        }
    }

}
