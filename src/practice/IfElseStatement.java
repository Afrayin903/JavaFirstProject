package practice;

import java.util.Scanner;
//How to display emoji?
//Windows = Win + ;
//Mac = Control + Command + Space

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        boolean isStudent;
        String student;
        int score ;
        char grade;
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        name = (name.isEmpty())? "You didnt enter your name 😒" : "Hello, " + name + "!😊";
        System.out.println(name);
        System.out.println("Are you a student(false/true)?");
        isStudent = scanner.nextBoolean();
        student = (isStudent)? "Yes I'm 😊" : "No, I'm not 🙂";
        System.out.println(student);
        System.out.println("Enter your score: ");
        score = scanner.nextInt();
        grade = (score >= 90)? 'A' : (score >= 80)? 'B' : (score >=70 )? 'C' : (score >=60 )? 'D' : 'E';
        System.out.println(grade);
        /* if (score>=90){
            grade = 'A';
        } else if (score >= 80) {
            grade='B';
        } else if (score >=70) {
            grade='C';
        } else if (score >=60) {
            grade='D';
        }else {
            grade='E';
        }*/
        /* int score = 90;
       if(score >=0 && score <=100){
            if (score >=60){

                System.out.println("Passed");
            }else {
                System.out.println("failed");
            }
        }*/
        //ternary operator


    }
}
