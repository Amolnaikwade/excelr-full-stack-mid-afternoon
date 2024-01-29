package multithread.app2;
class shared
{
    synchronized void test1()
    {
        Thread t1 = Thread.currentThread();
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("from test1: " + i + " by " + t1.getName());
        }
    }
        synchronized void test2()
        {
            Thread t2 = Thread.currentThread();
            for(int i = 11 ; i<= 20 ; i++)
            {
                System.out.println("from test1: " + i + " by " + t2.getName());
            }
        }
        synchronized void test3()
        {
            Thread t3 = Thread.currentThread();
            for(int i = 21; i<= 30; i++)
            {
                System.out.println("from test1: " + i + " by " + t3.getName());
            }
        }

}
class Thread1 extends Thread{
    shared s1;
    Thread1(shared s1)
    {
        this.s1 = s1;
    }
    public void run()
    {
        s1.test1();
    }
}
class Thread2 extends Thread{
shared s2;
Thread2(shared s2)
{
    this.s2 = s2;
}
        public void run()
        {
           s2.test2();
        }
}
public class M2
{
public static void main(String[] args)
{
    shared s1 = new shared();
    Thread1 t1 = new Thread1(s1);
    Thread1 t2 = new Thread1(s1);
    t1.start();
    t2.start();

    s1.test3();

}
}
