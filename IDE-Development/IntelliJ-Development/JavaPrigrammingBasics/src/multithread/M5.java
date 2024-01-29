package multithread;
class G extends Thread
{
    @Override
    public void run()
{
    for(int i =1 ;i<=100; i++)
    {
        System.out.println(getName()+ ": " + i);

    }
}
}
public class M5
{
    public static void main(String[] args)
    {
        G g1 = new G();
        g1.start();
        G g2 = new G();
        g2.start();
        for(int i= 501 ; i<= 600 ; i++)
        {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
