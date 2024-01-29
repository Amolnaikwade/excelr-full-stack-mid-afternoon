package objectClass;
class a{
    int i, j;
    a(int i, int j){
        this.i = i;
        this.j = j;
    }
}
public class M1 {
    public static void main(String[] args) {
        a b1 = new a(10, 20);
        System.out.println(b1);
    }

}

