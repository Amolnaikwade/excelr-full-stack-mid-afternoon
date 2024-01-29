package multithread.app2;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;

/*class Shared21
{
    synchronized void test1(Shared obj)
    {
        Thread t1 = Thread.currentThread();
        System.out.println("test1 begin by " + t1.getName() +  " : " + t1.getId());
        //Util.sleep(1000);
        obj.test2(this);
        System.out.println("test1 end by " + t1.getName()+  " : " + t1.getId());

    }
    synchronized void test2(Shared obj)
    {
        Thread t1 = Thread.currentThread();
        System.out.println("test2 begin by " + t1.getName() +  " : " + t1.getId());
        //Util.sleep(1000);
        obj.test1(this);
        System.out.println("test2 end by " + t1.getName() +  " : " + t1.getId());
    }
}
/*
class Util
{
	static void sleep(long millis)
	{
		try
		{
			Thread.sleep(millis);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}*/
/*

class Thread1 extends Thread
{
    Shared s1, s2;
    Thread1(Shared s1, Shared s2)
    {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public void run()
    {
        s1.test1(s2);
    }
}
class Thread2 extends Thread
{
    Shared21 s1, s2;
    Thread2(Shared21 s1, Shared21 s2)
    {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public void run()
    {
        s2.test2(s1);
    }
}
public class M7
{
    public static void main(String[] args)
    {
        Shared21 s1 = new Shared21();
        Shared21 s2 = new Shared21();

        Thread1 t1 = new Thread1(s1, s2);
        t1.start();

        //Util.sleep(100);

        Thread2 t2 = new Thread2(s1, s2);
        t2.start();


        //Util.sleep(2000);
        //getThreadMXBean() - a ThreadMXBean object for the Java virtual machine.
        ThreadMXBean tmx = ManagementFactory.getThreadMXBean();
        long[] ids = tmx.findDeadlockedThreads();

        if(ids != null)
        {
            System.out.println("Threads are under dead lock");
            //toString(long[] a) Returns a string representation of the contents of the specified array.
            System.out.println("dead locked thread ids: " + Arrays.toString(ids));
        }
        else
        {
            System.out.println("no threads are under dead lock: " + ids);
        }
    }
}
*/
/*
 * demonstration of dead lock
 * always avoid calling of synchronized method from another synchronized method.
   by using different reference variable.
 */