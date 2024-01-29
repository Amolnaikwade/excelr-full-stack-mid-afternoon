class L
{
    public static void main(final String[] args)
    {
        args[0]  = "abc";
        System.out.println(args);
    }
}
/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        at L.main(l.java:5)
		*/