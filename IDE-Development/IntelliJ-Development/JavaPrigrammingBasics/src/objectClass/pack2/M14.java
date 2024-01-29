package objectClass.pack2;



class I
{
    int x;
    String s1;
    @Override
    public boolean equals(Object obj) {
        return (obj instanceof I && (x == ((I)obj).x) && (s1.equals(((I)obj).s1)));
    }
}
public class M14 {
    public static void main(String[] args) {
        I obj1 = new I();
        obj1.x = 10;
        obj1.s1 = "hello";

        I obj2 = new I();
        obj2.x = 10;
        obj2.s1 = "hello";

        System.out.println(obj1.equals(obj2));

        I obj3 = new I();
        System.out.println(obj1.equals(obj3));
    }
}



