package multithread.app2;
class shared1
{
   Thread t1 = Thread.currentThread();
   synchronized void test1()
   {
       for(int i= 1 ; i<= 50; i++)
       {
           System.out.println("from test1: " + i  + " by " + t1.getName());
       }
   }
   synchronized  void test2()
   {
       Thread t1 = Thread.currentThread();

       for(int i = 1 ; i<= 100; i++)

       {
           System.out.println("from test2: " + i  + " by " + t1.getName());
       }
   }
}
    class Thread11 extends Thread{
    shared1 s1;
    Thread11(shared1 s1)
    {
        this.s1 = s1;
    }
    public void run()
    {
        s1.test2();
    }

    }
    class Thread22 extends Thread
    {
        shared1 s1;
        Thread22(shared1 s1)
        {
            this.s1=s1;
        }
        public void run()
        {
            s1.test2();
        }
    }
public class M3
{
    public static void main(String[] args)
    {
        shared1 s1 = new shared1();
        shared1 s2 = new shared1();
        shared1 s3 = new shared1();

        Thread11 t1 = new Thread11(s1);
        Thread22 t2 = new Thread22(s2);

        t1.start();
        t2.start();

        s3.test2();

    }

}
