package multithread.app2;
class Shared1
{
    synchronized static void test1()
    {
        Thread t1 = Thread.currentThread();
        for(int i=0; i<= 50; i++)
        {
            System.out.println("from test1: " + i + " by " + t1.getName());
        }
    }
}
class Thread12 extends Thread{
    public void run()
    {
        Shared1.test1();
    }
}
class Thread13 extends Thread{
    public void run()
    {
        Shared1.test1();
    }

}
public class M5
{
    public static void main(String[] args)
    {
        Thread12 t1 = new Thread12();
        t1.start();
        Thread13 t2 = new Thread13();
        t2.start();
        Shared1 s1;
        Shared1.test1();
    }
}
