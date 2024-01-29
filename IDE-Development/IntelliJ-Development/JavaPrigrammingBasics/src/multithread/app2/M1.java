package multithread.app2;
class Resourse
{
    synchronized void water()
    {
        Thread t1 =  Thread.currentThread();
        for(int i = 1; i<= 50; i++)
        {
            System.out.println("from water: " + "consumed by " + t1.getName());
        }
    }
}
class oneUser extends Thread
{
    Resourse resourse;
    oneUser(Resourse resourse)
    {
        this.resourse = resourse;

    }
    public void run()
    {
        resourse.water();
    }
}
class twoUser extends Thread
{
    Resourse resourse;
    twoUser(Resourse resourse)
    {
        this.resourse = resourse;

    }
    public void run()
    {
        resourse.water();
    }
}
public class M1
{
    public static void main(String[] args)
    {
        Resourse r1 = new Resourse();
        oneUser U1 = new oneUser(r1);
        twoUser U2 = new twoUser(r1);

        U1.start();
        U2.start();

        r1.water();
    }
}
