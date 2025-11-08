package practice;
interface A{
    //Can have static, abstract and default methods
    //Can not have constructor
    //Can have only static veritable (final by default)
    //Access modifier: only allows public by default
    //Multi inheritance is allowed
    static int SSN = 230090099;
    final int id = -9809877;
    public int a =1;
    abstract void method1();
    public static void method2(){
        System.out.println("Static method");
    };
    public default void method3(){
        System.out.println("default method");
    }
}

abstract class B extends AbstractClass_Vs_Interface{
    //Multiple inheritance is not allowed
    //Can have constructor
    //Can have instance, static and abstract methods
    //Class can not be final
    //Can have instance, static and final(has to initialize) Variables
    //Can have all type of access modifiers
    public String name;
    public static int birthDate;
    public static final int ssn = 1234566778;
    public final double PI= 3.14;
    public B(String name) {
        this.name = name;
    }
    abstract void method1();
    public String method2(){
        return "Hahar";
    }
    public static final String method3(){
        System.out.println("static and final method");
        return "Hahar";
    }
}
public class AbstractClass_Vs_Interface {

    public static void main(String[] args) {

    }
}
