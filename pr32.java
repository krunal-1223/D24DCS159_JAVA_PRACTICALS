
class myThread extends Thread{
    public void run(){
        System.out.println("Extending the Thread");
        System.out.println("Hello world");
//        for(int i=0;i<=10;i++){
//            if(i%2==0) {
//                System.out.println(i);
//            }
//        }
    }
}
class R_unnable implements Runnable{
    public void run(){
        System.out.println("Implementing runnable interface");
        System.out.println("Hello world");
//        for(int i=0;i<=10;i++){
//            if(i%2!=0) {
//                System.out.println(i);
//            }
//        }
    }
}
public class pr32{
    public static void main(String[] args){
        myThread t=new myThread();
        t.start();

        R_unnable r= new R_unnable();
        Thread n=new Thread(r);
        n.start();
       // t.start();
    }
}

