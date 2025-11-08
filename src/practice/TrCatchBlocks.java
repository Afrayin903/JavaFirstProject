package practice;

import javax.sound.midi.Soundbank;

public class TrCatchBlocks {
    public static void main(String[] args) {
        try {
            System.out.println(9/0);
        }catch (ArithmeticException e){
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }finally {//finally block always get executed except put System.exit() in catch block
            System.out.println("Finally block always get execute");
        }
        System.out.println("Continue move");
    }
}
