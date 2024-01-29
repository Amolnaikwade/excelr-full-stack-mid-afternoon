package app1;
import java.util.EnumSet;
 enum B
{
 ABC, XYZ, TEST;
}
class A
{
 public static void main(String[] args)
 {
  EnumSet<B> set = EnumSet.of(B.ABC, B.XYZ, B.TEST);
  for (B b1 : set)
  {
   System.out.println(b1);
  }
 }
}