package objectClass.pack2;

class J
{
    int x;
    String s1;
    public boolean equals(Object obj) {
        boolean flag = (obj instanceof J) &&
                (x == ((J)obj).x) &&
                (
                        s1 == null?
                                (((J)obj).s1 == null ? true : false) :
                                (((J)obj).s1 == null ? false : s1.equals(((J)obj).s1))
                );
        return flag;
    }
}
public class M15 {
    public static void main(String[] args) {
        J j1 = new J();
        j1.x = 10;
        J j2 = new J();
        J j3 = new J();
        j3.x = 10;
        System.out.println(j1.equals(j2));
        System.out.println(j1.equals(j3));
        System.out.println(j2.equals(j3));
        System.out.println(j3.equals(j1));
        System.out.println(j3.equals(j2));
        System.out.println(j2.equals(j1));
    }
}

