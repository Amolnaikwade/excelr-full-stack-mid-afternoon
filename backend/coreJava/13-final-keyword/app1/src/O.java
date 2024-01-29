class O
{
    final int i = 10;

    public static void main(String[] args)
    {
        O o1 = new O();
       o1.i = 20;
        System.out.println(o1.i);
    }
}
/*
 error: cannot assign a value to final variable i
       o1.i = 20;
         ^
1 error
*/