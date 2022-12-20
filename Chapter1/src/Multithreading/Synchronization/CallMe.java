package Multithreading.Synchronization;

public class CallMe {
   synchronized void call(String msg) {
        System.out.println("[" );
       System.out.println(msg);
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
