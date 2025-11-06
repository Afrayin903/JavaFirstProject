package practice;

public class WrapperClasses {
    public static void main(String[] args) {
        //primitives
        byte a = 2;
        short b = 3;
        int c = 4;
        long d = 5;

        //Object type (Wrapper class object)
        Byte e = a; // Primitives converts to wrapper class object is call auto boxing
        Short f = b;
        Integer h = c;
        Long l = d;
        //Wrapper class converts to primitives is call unboxing
        //Parse methods: Converting string to the primitives, returns primitive
        String ab = "123";
        int bc = Integer.parseInt(ab);
        System.out.println(bc);

        //valueOf methods: Converting string to the wrapper class object, returns wrapper class object
        String dc = "5.4";
        Double cd = Double.valueOf(dc);
        System.out.println(cd);


    }
}
