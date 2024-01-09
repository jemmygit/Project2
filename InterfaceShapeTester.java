package Project2;

public class InterfaceShapeTester {
    public static void main(String[] args) {
        InterfaceShape.Circle circle = new InterfaceShape.Circle(2.0);
        System.out.println("Circle - Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());


        InterfaceShape.Circle.Square square = new InterfaceShape.Circle.Square(2.0);
        System.out.println("Square - Area: " + square.calculateArea() + ", Perimeter: " + square.calculatePerimeter());
    }
}
