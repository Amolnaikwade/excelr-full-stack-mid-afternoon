class T
{
        int i;
        void test()
        {
                System.out.println("test:" + this.i);
                this.i = 20;
        }
        public static void main(String[] args) 
        {
                T t1 = new T();
                t1.i = 10;
                System.out.println("main1:" + t1.i);
                t1.test();
                System.out.println("main2:" + t1.i);
        }
}

