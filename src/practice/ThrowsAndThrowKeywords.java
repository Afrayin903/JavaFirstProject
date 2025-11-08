package practice;
//Throws keyword: Used for compile time exception (Checked), declare at method signature
//Throw keyword: Used for manually throwing and exception

import java.util.Scanner;

public class ThrowsAndThrowKeywords {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Handling compile time exceptions");
        Thread.sleep(3000);//checked exception handled by throws keyword(compile time)
        try {
            Thread.sleep(3000);//checked exception handled by try catch block(compile time)
            //System.out.println(100/0);//unchecked exception also can handle by try catch
        }catch (InterruptedException e){
           e.printStackTrace();
        }
        throwKeyWord();
    }

    public static void throwKeyWord() {

        System.out.println("Hello everyone\n");
        int age = new Scanner(System.in).nextInt();

        if(age < 18 || age > 67) {
            throw new ArithmeticException("Invalid age: " + age);//Run time exception (unchecked exception)
        }else {
            System.out.println("age = " + age);
        }
    }
}
