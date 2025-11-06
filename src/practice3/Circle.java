package practice3;

public class Circle {
    public double radius;
    public static double pi = 3.14;
    public static double high;
    public static String name;
    public static char gender;


    static {
      high = 5.10;
      name = "Kahar";
      gender = 'M';

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calcArea(){
        return radius * radius * pi;
    }

    public double calcPerimeter(){
        return 2 * radius * pi;
    }

    public static void printPI(){
        System.out.println(pi);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
