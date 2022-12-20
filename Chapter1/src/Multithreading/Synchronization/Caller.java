package Multithreading.Synchronization;

public class Caller implements Runnable{
    String message;
    CallMe target;
    Thread t;
    public Caller(CallMe target, String message) {
        this.target = target;
        this.message = message;
        t = new Thread(this);
        t.start();
    }
    public void run() {
       target.call(this.message);
    }
}
