package practice;

public class PrintFPractice {
    public static void main(String[] args) {
        //printf()= is a method used to format output
        //%[flags][width][.precision][specifier-character]
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;
        //use lower case s for string when using printf
        System.out.printf("Hello %s\n",  name);
        //use lower case c for character when using printf
        System.out.printf("Your name starts with a %c\n", firstLetter);
        //use lower case d for integer when using printf
        System.out.printf("You are %d years old\n", age);
        //use lower case f for integer when using printf
        System.out.printf("You are %f inches tall\n", height);
        //use lower case d for integer when using printf
        System.out.printf("Employed %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);
       /* + = output a plus
          , = comma grouping separator
          ( = negative numbers are enclosed in ()
          space = display a minus if negative, space if positive
        */
        double price1 = 9000.99;
        double price2 = 100000.15;
        double price3 = -54000.01;
        double price4 = 51.03;
        //plus, comma, parenthesis
        System.out.printf("%,+.3f, ", price1);
        System.out.printf("%,+.3f, ", price2);
        System.out.printf("%,+(.3f\n", price3);
        System.out.printf("% .2f\n", price4);

        //[with]
        /* 0 = zero padding
           number = right justified padding
           negative number = left justified padding
        */
        int id1 =1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;
        //0 = zero padding
        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);
        //number = right justified padding
        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);
        //negative number = left justified padding
        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);




    }




}
