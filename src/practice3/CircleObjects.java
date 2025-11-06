package practice3;

public class CircleObjects {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(15);
        //Static member only one copy that shared by objects within a class
        System.out.println(circle1.radius);
        System.out.println(circle2.calcArea());
        System.out.println(circle3.calcPerimeter());
        double a = Circle.pi;
        System.out.println(a);
        System.out.println("=============================");
        System.out.println("Name is " + Circle.name + " height " + Circle.high + " gender " + Circle.gender);
    }
}
