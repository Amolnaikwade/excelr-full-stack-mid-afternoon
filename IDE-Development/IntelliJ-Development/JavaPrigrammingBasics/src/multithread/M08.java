package multithread;

public class M08
{
    public static void main(String[] args)
    {
        //executed by main thread
        Thread t1 = Thread.currentThread();
        //reading default properties of main thread
        System.out.println(t1.getName());
        System.out.println(t1.isDaemon());
        System.out.println(t1.getId());
        System.out.println(t1.getPriority());
    }
}
