package app2;
interface s
{
    int i = 0;
    void test1();
}
enum v implements s
{
  CON1, CON2, CON3;
  public void test1()
  {
      System.out.println("from test1");
  }
  public int test2()
  {
      return i;
  }
}
public class Z
{
    public static void main(String[] args)
    {
        v v1 = v.CON1;
        v1.test1();
        System.out.println(v1.test2());
    }
}
