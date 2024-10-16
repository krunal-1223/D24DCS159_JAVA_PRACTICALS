
class Shape {
    void printShape() {
        System.out.println("This is shape");
    }
}
class Rect extends Shape {
    void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}
class Circle extends Shape {
    void printCircle() {
        System.out.println("This is circular shape");
    }
}
class Squ extends Rect{
    void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

public class pr20 {
    public static void main(String[] args) {

        Squ squareobj = new Squ();
        squareobj.printShape();
        squareobj.printRectangle();
    }
}
