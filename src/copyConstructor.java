//class copyConstructor {
    class A {
        int a;
        String b;
        A()
        {
            a=10; b="myname";
            System.out.println(a+ " "+b);
        }
        A (A ref)
        {
        a=ref.a;
        b=ref.b;
            System.out.println("copied data:");
            System.out.println(a+ " " +b);
        }
    }
    class B
    {
        public static void main(String[] args) {
            A r= new A();
            A r2=new A(r);
        }
    }


