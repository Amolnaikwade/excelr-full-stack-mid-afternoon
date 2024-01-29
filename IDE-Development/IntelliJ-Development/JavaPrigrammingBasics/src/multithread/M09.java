package multithread;
class S extends Thread
{
    public void run()
    {
        System.out.println(getName());
        System.out.println(isDaemon());
        System.out.println(isAlive());
        System.out.println(getPriority());
        System.out.println(getId());
    }

}
public class M09
{
    public static void main(String[] args)
    {
        S ref = new S();
        ref.start();
    }
}
