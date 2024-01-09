package Project2;
/*
Create an Interface 'Shape' with undefined methods as calculateArea and
calculatePerimeter. Create 2 classes Circle & Square that implements
functionality defined in the Shape Interface. Test your code.
 */
public class InterfaceShape {

    //Create an Interface 'Shape' with undefined methods
    // as calculateArea and calculatePerimeter.
    // Create 2 classes Circle & Square that implements functionality
    // defined in the Shape Interface. Test your code.
    interface Shape {
        double calculateArea();

        double calculatePerimeter();
    }

    static class Circle implements Shape {
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return radius * radius * Math.PI;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }

        static class Square implements Shape {
            private double side;

            public Square(double side) {
                this.side = side;
            }

            @Override
            public double calculateArea() {
                return side * side;
            }

            @Override
            public double calculatePerimeter() {
                return 4 * side;
            }
        }
    }
}