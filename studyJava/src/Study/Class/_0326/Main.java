package Study.Class._0326;

public class Main {
    public static void main(String[] args) {
        ChildA a = new ChildA();
        a.abc();
        a.bcd();
        ChildA b = new ChildA();
        System.out.println(a.a);
        a.a = 5;
        System.out.println(a.a);
        b.a = 9;
        System.out.println(a.a);
        System.out.println(b.a);
        System.out.println(A.a);
        System.out.println(B.a);
        System.out.println();

        ChildA a3 = new ChildA();
        ChildA a4 = new ChildA();
        ChildA a5 = new ChildA();

        A a2 = new A(){
            @Override
            public void abc() {
                System.out.println("익명 이너클래스");
            }
        };
        a2.abc();
    }
}
