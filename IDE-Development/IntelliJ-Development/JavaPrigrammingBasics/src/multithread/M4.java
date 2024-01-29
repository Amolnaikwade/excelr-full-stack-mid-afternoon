package multithread;
class E implements Runnable
{
    @Override
    public void run() {
        for(int i = 201; i <= 300; i++)
        {
            System.out.println("first child: " + i);
        }
    }
}
class F implements Runnable
{
    public void run()
    {
        for(int i = 401; i<= 501; i++)
        {
            System.out.println("second child: " + i);

        }
    }

}
public class M4
{
    public static void main(String[] args) {
        //while creating object to C thread is not creating
        C c1 = new C();
        //once we create an object to C, create an object to Thread
        //by supplying reference of C to the constructor of Thread.
        //Thread class has some constructors among them one is taking runnable type.
        //c1 is a C type and it is runnable type.
        Thread t1 = new Thread(c1);//creating child thread
        t1.start();

        D d1 = new D();
        Thread t2 = new Thread(d1);//creating child thread
        t2.start();

        for(int i = 1; i <= 100; i++)
        {
            System.out.println("main thread: " + i);
        }
    }
}
