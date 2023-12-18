class AA
{
public static void main(String[] args) 
{
System.out.println("main begin");
int i = 1;
do
{
System.out.println("body begin:" + i);
System.out.println("body end:" + i);
i++;
}
while (i <= 5)
System.out.println("main end");
}
}

