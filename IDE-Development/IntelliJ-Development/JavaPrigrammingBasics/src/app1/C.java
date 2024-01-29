package app1;
import java.util.EnumSet;
enum D
{
    abc, xyz, test;
}
enum E
{
    CON1, CON2, CON3;
}
public class C
{
    public static void main(String[] args)
    {
        EnumSet<D> set = EnumSet.of(D.abc, D.xyz, D.test);
        for(D en : set)
        {
            System.out.println(en);
        }
        System.out.println("----------------------");
        EnumSet<E> set1 = EnumSet.of(E.CON1, E.CON2, E.CON3);
        {
            for(E en : set1)
            System.out.println(en);
        }
    }
}
