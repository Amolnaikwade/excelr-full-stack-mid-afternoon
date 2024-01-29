package objectClass.pack2;


class F
{
    int i;
    F(int i){
        this.i = i;
    }
    @Override
    public boolean equals(Object obj) {
        if( ! (obj instanceof F)) {
            return false;
        }
        F ref = (F) obj;
        return i == ref.i;
    }
}
public class M6 {
    public static void main(String[] args) {
        F f1 = new F(10);
        F f2 = new F(10);

    /*    A a1 = new A();
        a1.i = 10;*/

        System.out.println(f1.equals(f2));
       // System.out.println(f1.equals(a1));
    }
}

