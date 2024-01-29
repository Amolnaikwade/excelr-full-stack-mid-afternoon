package multithread.app2;
class Shared
{
    void test1()
    {
        Thread t1 = Thread.currentThread();
        System.out.println("this is from non-synchronized block" + t1.getName());
        System.out.println("this is from non-synchronized block" + t1.getName());
        System.out.println("this is from non-synchronized block" + t1.getName());
        synchronized(this)//mutex(mutually exclusive)
        {
            for(int i=0; i<= 50 ; i++)
            {
                System.out.println("from test1: " + i + " by " + t1.getName());
            }
        }
    }

}
class Thread33 extends Thread{
    Shared s1;
    Thread33(Shared s1)
    {
        this.s1 = s1;

    }
    public void run()
    {
        s1.test1();
    }
}
class Thread44 extends Thread{
    Shared s1;
    Thread44(Shared s1)
    {
        this.s1 = s1;

    }
    public void run()
    {
        s1.test1();
    }
}

public class M4
{
    public static void main(String[] args)
    {
        Shared s1 = new Shared();

        Thread33 t1 = new Thread33(s1);
        Thread44 t2  = new Thread44(s1);

        t1.start();
        t2.start();

        s1.test1();
    }
}
