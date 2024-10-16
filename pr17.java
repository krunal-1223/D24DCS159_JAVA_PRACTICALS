
class Parent {

    void printMessage() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {

    void printChildMessage() {
        System.out.println("This is child class");
    }
}

public class pr17 {
    public static void main(String[] args) {

        Parent parentObject = new Parent();
        parentObject.printMessage();
        Child childObject = new Child();
        childObject.printChildMessage();
    }
}
