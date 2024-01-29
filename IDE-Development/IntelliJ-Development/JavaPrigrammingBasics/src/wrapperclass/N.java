package wrapperclass;

public class N
{
    static void test(double i)
    {
        System.out.println("from double");
    }
    static void test(Integer i)
    {
        System.out.println("from Integer");
    }
    public static void main(String[] args)
    {
        int i = 20;
        test(i);
    }
}
