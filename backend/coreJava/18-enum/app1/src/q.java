package app1;

class q
{
    enum En
    {
        C1, C2, C3, C4;
    }
}
class R
{
    public static void main(String[] args)
    {
        //En should be refered through Q
        //its like inner class
        q.En e1 = q.En.C4;
        q.En e2 = q.En.C2;
        System.out.println(e1);
        System.out.println(e2);
    }
}
