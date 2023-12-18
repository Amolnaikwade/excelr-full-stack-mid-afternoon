class Y
{
        static int i = test1();
        static int j = test2();
        static
        {
                System.out.println("sib begin:" + i + ", " + j);
                main(null);
                System.out.println("sib end:" + i + ", " + j);
                i += 1;
                j += 1;
        }
        static int test1()
        {
                System.out.println("test1 begin:" + i + ", " + j);
                main(null);
                System.out.println("test1 end:" + i + ", " + j);
                i += j + 2;
                j += i + 1;
                return i + j + test2();
        }
        static int test2()
        {
                System.out.println("test2 begin:" + i + ", " + j);
                i += j + 5;
                j += i + 4;
                main(null);
                System.out.println("test2 end:" + i + ", " + j);
                i += j + 4;
                j += i + 5;
                return i + j + 10;
        }
        public static void main(String[] args) 
        {
                System.out.println("main :" + i + ", " + j);
                i += j + i;
                j += i + j;
        }
}

