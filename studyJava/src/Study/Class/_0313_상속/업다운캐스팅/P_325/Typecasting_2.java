package Study.Class._0313_상속.업다운캐스팅.P_325;

class A{
    int m = 3;
    void abc(){
        System.out.println("A 클래스");
    }
}
class B extends A{
    int n = 4;
    void bcd(){
        System.out.println("B 클래스");
    }
}

public class Typecasting_2 {
    public static void main(String[] args) {
        A aa = new A();
        System.out.println(aa.m);
        aa.abc();

        B bb = new B();
        System.out.println(bb.m);
        System.out.println(bb.n);
        bb.abc();
        bb.bcd();

        A ab = new B();
        System.out.println(ab.m);
        B bab = (B) ab;
        System.out.println(bab.n);
        System.out.println(((B) ab).n);
        ab.abc();
    }
}
