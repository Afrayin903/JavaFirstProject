package practice3;

import practice3.Shape;

public class Square extends Shape {
    public double side;

    public Square(double side) {
        this.side = side;
    }

    public double area(){
        return side * side;
    }

    public double perimeter(){
        return side * 4;
    }
}
