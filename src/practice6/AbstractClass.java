package practice6;
/*
* Abstract method has no implementation (has no body), but can has signature
* Abstract method has to be overriding, otherwise it is useless
* Abstract method can not be final, static and private
* Abstract method can only be created within abstract class or in an interface
* Abstract class can not be instantiated
* Abstract class can have final, static, private instance var and method, and also have instance and static initializer
* */
public abstract class AbstractClass {
    public abstract String name();
    String gender;
    public final static String birthDate = "09/04/1975";
    public final static int SSN;

    public AbstractClass(String gender) {
        this.gender = gender;
    }

    public void eat() {
        System.out.println("Saver is eating");
    }
    {
      gender = "Male";
    }
    static {
        SSN = 987299394;
    }

}
