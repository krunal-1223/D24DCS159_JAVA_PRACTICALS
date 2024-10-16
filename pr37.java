import java.util.LinkedList;

class Buffer {
    private final int capacity;
    private final LinkedList<Integer> list = new LinkedList<>();

    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int value) throws InterruptedException {
       
        while (list.size() == capacity) {
            wait();
        }
       
        list.add(value);
        System.out.println("Produced: " + value);
     
        notify();
    }

    
    public synchronized int consume() throws InterruptedException {
        
        while (list.isEmpty()) {
            wait();
        }
       
        int value = list.removeFirst();
        System.out.println("Consumed: " + value);
       
        notify();
        return value;
    }
}

class Producer extends Thread {
    private final Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        int value = 0;
        while (true) {
            try {
                
                buffer.produce(value++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        while (true) {
            try {
              
                buffer.consume();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class pr37 {
    public static void main(String[] args) {
        
        Buffer buffer = new Buffer(5);
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        producer.start();
        consumer.start();
    }
}
