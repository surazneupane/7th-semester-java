package Multithreading.ThreadPriority;

public class PrintNumber extends Thread {
    private int to;
    private int from;
    PrintNumber(int from,int to)
    {
        this.to=to;
        this.from=from;

    }
    public void run()
    {

        for(int i=from;i<=to;i++)
        {

            System.out.printf("%d ", i);

        }
        System.out.println();
    }

}
