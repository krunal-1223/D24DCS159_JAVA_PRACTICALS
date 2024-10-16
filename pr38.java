import java.util.ArrayList;

public class pr38 {
    // List to store stack elements
    private ArrayList<Object> list;

    // Constructor to initialize the stack
    public pr38() {
        list = new ArrayList<>();
    }

    // Returns true if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Returns the number of elements in the stack
    public int getSize() {
        return list.size();
    }

    // Returns the top element without removing it
    public Object peek() {
        if (!isEmpty()) {
            return list.get(list.size() - 1);
        }
        return null; // Return null if the stack is empty
    }

    // Removes and returns the top element from the stack
    public Object pop() {
        if (!isEmpty()) {
            return list.remove(list.size() - 1);
        }
        return null; // Return null if the stack is empty
    }

    // Adds a new element to the top of the stack
    public void push(Object o) {
        list.add(o);
    }

    // Main method to demonstrate the stack functionalities
    public static void main(String[] args) {
        pr38 stack = new pr38();

        // Add elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Check the size of the stack
        System.out.println("Size of stack: " + stack.getSize()); // 3

        // Peek at the top element
        System.out.println("Top element: " + stack.peek()); // 3

        // Pop the top element
        System.out.println("Popped element: " + stack.pop()); // 3

        // Check the size of the stack after pop
        System.out.println("Size of stack after pop: " + stack.getSize()); // 2

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // false
    }
}
