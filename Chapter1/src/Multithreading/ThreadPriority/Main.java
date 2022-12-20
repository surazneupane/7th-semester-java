package Multithreading.ThreadPriority;

public class Main {

    public static void main(String[] args) {

        PrintNumber printNumber1 = new PrintNumber(0, 99);
        PrintNumber printNumber2 = new PrintNumber(100, 199);
        PrintNumber printNumber3 = new PrintNumber(200, 220);

        //both have initial priority of 5
        //java provides min priority 1 and max to 10
        System.out.println(printNumber1.getName()+"-> Priority ->"+printNumber1.getPriority());
        System.out.println(printNumber2.getName()+"-> Priority ->"+printNumber2.getPriority());
        System.out.println(printNumber3.getName()+"-> Priority ->"+printNumber3.getPriority());


        printNumber1.setPriority(Thread.MAX_PRIORITY);
        printNumber2.setPriority(Thread.NORM_PRIORITY);
        printNumber3.setPriority(Thread.MIN_PRIORITY);

        System.out.println(printNumber1.getName()+"-> Priority ->"+printNumber1.getPriority());
        System.out.println(printNumber2.getName()+"-> Priority ->"+printNumber2.getPriority());
        System.out.println(printNumber3.getName()+"-> Priority ->"+printNumber3.getPriority());

    }
}
