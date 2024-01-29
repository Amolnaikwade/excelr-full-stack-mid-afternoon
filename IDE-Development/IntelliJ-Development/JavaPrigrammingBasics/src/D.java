public class D
{
    public static  void main(String[] args)
    {
        StringBuffer sb1 = new StringBuffer();
        sb1.append("amol");
        StringBuffer sb2 = new StringBuffer();
        sb2.append("amol");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
    }

}
