package practice;
/*Exception: two types of exception checked(happen during the compile time)
and unchecked(happen during the run time)*/

import java.io.FileInputStream;

public class Exceptions {

    public static void main(String[] args) {
        Integer [] arr = {10, 20, 30};
        //System.out.println(arr[20]);//unchecked exception(IndexOutOfBoundException)
        String str = null;
        //System.out.println(str.toUpperCase());//unchecked exception (nullPointerException)

        System.out.println("========================");
        //Checked exception happen during the compile time (Unhandled exception: java.lang.InterruptedException)
        //Thread.sleep(3000);
        //FileInputStream fileInputStream = new FileInputStream("file path");//Checked exception(Unhandled exception: java.io.FileNotFoundException)
    }
}
