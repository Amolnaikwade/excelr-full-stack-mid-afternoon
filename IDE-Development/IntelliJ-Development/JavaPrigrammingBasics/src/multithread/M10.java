package multithread;

public class M10
{
    public static void main(String[] args)
    {
        Thread t1 = Thread.currentThread();
        System.out.println("before change name");
        System.out.println(t1.getName());
        t1.setName("AMOL");
        System.out.println("after change name");
        System.out.println(t1.getName());

    }
}
