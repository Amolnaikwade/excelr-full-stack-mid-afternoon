package multithread;
class Y extends Thread
{
    public void run()
    {
        System.out.println("run end");
        for(int i=1 ; i<= 10; i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException ex)
            {
                ex.printStackTrace();
            }
        }
        System.out.println("run end");
    }
}
public class M24
{
    public static void main(String[] args)
    {
       Y obj = new Y();
       obj.start();
       System.out.println("main end");
    }
}
