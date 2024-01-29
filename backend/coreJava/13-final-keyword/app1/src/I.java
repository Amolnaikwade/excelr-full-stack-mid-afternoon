class I
{
    public static void main(String[] args)
    {
        final int[] x = new int[10];
        x = null;
        x = new int[20];
    }
}
/*
: error: cannot assign a value to final variable x
        x = null;
        ^
i.java:7: error: cannot assign a value to final variable x
        x = new int[20];
        ^
2 errors
*/