package Study.Generic._0401.P605;

public class GenericExtends {
    public static void main(String[] args) {
//        D<A> d = new D<A>(); // A클래스는 D의 제네릭T의 범위안에 없음
        D<B> d = new D<>();
        D<C> d1 = new D<>();
        D d2 = new D(); // <B>를 생략한 문법 D<B> d4 = new D<>();
        
        d.set(new B());
        d.set(new C());
//        d1.set(new B());
        d1.set(new C());
        d2.set(new B());
        d2.set(new C());
    }
}

class A{}
class B extends A{}
class C extends B{}
class D<T extends B> { // D가 B를 상속하는 건 아님!!!!
    // <T>는 모든 클래스가 올 수 있으나 / <T extends B> 는 B와 B의 자식만 올 수 있음(A는 안되고 B,C는 가능)
    private T t;
    public T get() {
        return t;
    }
    public void set(T t) {
        this.t = t;
    }
}