class IncrementValue extends Thread { 
    private int value;

    public IncrementValue(int value) {
        this.value = value;
    }

    public void run() {
        try {
            Thread.sleep(1000);  
            value++; 
            System.out.println("Value after increment: " + value);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class pr35 {
    public static void main(String[] args) {
        int initialValue = 5; 
        IncrementValue thread = new IncrementValue(initialValue);
        thread.start();  
    }
}
