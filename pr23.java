
interface Shape {
    String getColor();

    default void describeShape() {
        System.out.println("This is a shape.");
    }
}
class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void describeShape() {
        System.out.println("Circle with radius " + radius + " and color " + color + ".");
    }
}

class Sign {
    private Shape shape;
    private String text;

    public Sign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    public void displaySign() {
        System.out.println("Sign: " + text);
        shape.describeShape();
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0, "Green");
        Sign sign = new Sign(circle, "Welcome!");

        sign.displaySign();
    }
}
