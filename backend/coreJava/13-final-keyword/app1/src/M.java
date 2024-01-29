class M
{
    public static void main(final String[] args)
    {
     args = new String[20];
      args = null;
       String[] s2 =  new String[10];
       args = s2;
        System.out.println("done");
    }
}
/*
 error: final parameter args may not be assigned
     args = new String[20];
     ^
m.java:6: error: final parameter args may not be assigned
      args = null;
      ^
m.java:8: error: final parameter args may not be assigned
       args = s2;
       ^
3 errors
*/