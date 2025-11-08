package practice6;
//Sub class has to be a concrete.
public class AbstractClassSubClass extends AbstractClass {
    public int age;
    public double height;

    @Override
    public String name() {
        return "Age is " + age + "height is " +height;
    }
}
