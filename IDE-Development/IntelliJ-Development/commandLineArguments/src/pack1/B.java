package pack1;

public class B
{
    public static void main(String[] args)
    {
        for (String str : args)
        {
            System.out.println(str);
        }
        System.out.println("done: " + args);

        System.out.println("Total number of argument that you have passed: " + args.length);
    }
}