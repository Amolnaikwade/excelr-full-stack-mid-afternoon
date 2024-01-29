package multithread;
class U extends Thread
{
    public void run()
    {
        System.out.println("run start");
        for(int i=100; i<= 110; i++)
        {
            System.out.println(i);
            Util.sleep(5000);
        }
        System.out.println("run end");
    }
}
public class M25
{
    public static void main(String[] args)
    {
        U obj = new U();
        obj.start();
        System.out.println("main start");
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i);
            Util.sleep(5000,500);
        }
        System.out.println("main end");
    }
}
