package practice;
/*Casting IS A relationship(means A has to extends B or parent subclass relationship).
There are two type of casting upcasting(done implicitly)
and down-casting(done explicitly)*/

import practice3.Rectangle;
import practice3.Shape;
import practice3.Square;

public class ReferenceTypeCasting {
    Shape ref = new Rectangle();//upcasting

    Rectangle rectangle = new Rectangle();
    Shape ref2 = rectangle;//upcasting (implicit)


    Shape ref3 = new Square(12);//upcasting
    Square square = new Square(12);
    Shape ref4 = square;//upcasting

   /*Reference type rectangle does not have is a relationship with square,
    therefor casting does not work for them*/

    Square square2 = (Square) ref3;//down-casting explicit cast
    Rectangle rectangle2 = (Rectangle) ref;//down-casting

}
