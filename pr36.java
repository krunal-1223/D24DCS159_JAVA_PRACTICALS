class MyThread extends Thread {
    public MyThread(String name) {
        super(name);  
    }

    public void run() {
      
        System.out.println(Thread.currentThread().getName() + 
                           " with priority " + Thread.currentThread().getPriority() + 
                           " is running.");
    }
}

public class pr36 {
    public static void main(String[] args) {
      
        MyThread first = new MyThread("FIRST");
        MyThread second = new MyThread("SECOND");
        MyThread third = new MyThread("THIRD");
        first.setPriority(3);  
        
        third.setPriority(7);  
        first.start();
        second.start();
        third.start();
    }
}
