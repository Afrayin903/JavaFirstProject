package practice;
//Java program practice
/*This is a java print statement practice
class
* */
public class WoodenSpoon {
    public static void main(String[] args) {
        double num = 33.33;
        float num1 = 3.14f;
        char ch1 = '@';
        boolean result = 9>10;
        //implicit casting (primitive type)
        int a = 250;
        double b= a;
        //explicit casting
        double ab = 25.5;
        byte c = (byte) a;
        //print statement
        System.out.println("\tWooden spoon ");
        System.out.println();
        System.out.println(num + "\n" + num1 + "\n" + ch1 + " " + result);
    }
}
