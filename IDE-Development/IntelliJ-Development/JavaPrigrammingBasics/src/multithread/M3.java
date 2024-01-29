package multithread;

 class C extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 100; i++)
        {
            System.out.println(" 1 thread: " + i);

        }
    }
}
class D extends Thread
{
    public void run()
    {
        for (int i = 200; i <= 300; i++)
        {
            System.out.println(" 2 thread: " + i);

        }
    }
}
public class M3
{
    public static void main(String[] args)
    {
        C c1 = new C();
        c1.start();
        D d1 = new D();
        d1.start();
        for(int i = 300; i<=400; i++)
        {
            System.out.println("main tread: "+ i);
        }
    }
}
