
class Rectangle {
    double length;
    double breadth;
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void printArea() {
        System.out.println("Area: " + (length * breadth));
    }
    void printPerimeter() {
        System.out.println("Perimeter: " + (2 * (length + breadth)));
    }
}
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

public class pr19{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle:");
        rect.printArea();
        rect.printPerimeter();
        Square square = new Square(4.0);
        System.out.println("\nSquare:");
        square.printArea();
        square.printPerimeter();
    }
}
