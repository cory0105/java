package Study.Class._0313_상속.업다운캐스팅.P_322;

class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class Typecasting_1 {
    public static void main(String[] args) {
        A ac = (A) new C(); // 업캐스팅(자동)
        B bc = (B) new C(); // 업캐스팅(자동)

        B bb = new B();
        A a = (A) bb; // 업캐스팅(자동)

        A aa = new A();
        // B b = (B) aa; // 다운캐스팅 불가능
        // C c = (C) aa; // 다운캐스팅 불가능

        A ab = new B();

        if(ab instanceof B){
            B b = (B) ab; // 다운캐스팅(수동)
        } else if (ab instanceof C){
            C c = (C) ab; // 다운캐스팅(수동) 불가능
            System.out.println("t");
        } else {
            System.out.println("둘 다 아님");
        }


        B bd = new D();
        D d = (D) bd; // 다운캐스팅(수동)

        A ad = new D();
        B b1 = (B) ad; // 다운캐스팅(수동)
        D d1 = (D) ad; // 다운캐스팅(수동)
    }
}
