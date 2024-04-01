package Study.Generic._0401;

public class GenericExtends2 {
    public static void main(String[] args) {
        Test test = new Test();
        // case1 : Goods<E>
        test.method1(new Goods<E>()); // 가능
//        test.method1(new Goods<F>()); // 불가능
        // case2 : Goods<?>
        test.method2(new Goods<E>());
        test.method2(new Goods<F>());
        test.method2(new Goods<G>());
        test.method2(new Goods<H>());

        // case3 : Goods<? extends F>
//        test.method3(new Goods<E>());
        test.method3(new Goods<F>());
        test.method3(new Goods<G>());
        test.method3(new Goods<H>());

        // case4 : Goods<? super G>
        test.method4(new Goods<E>());
        test.method4(new Goods<F>());
        test.method4(new Goods<G>());
//        test.method4(new Goods<H>());
    }
}
// 제네릭 클래스를 메서드의 입력매개변수(=파라미터)로 사용하는 경우의 문법
class Test{
    void method1(Goods<E> g){} // T를 사용할 수 없음. 구체적인 클래스 명시
    void method2(Goods<?> g){} // 어떤 클래스던 가능
    void method3(Goods<? extends F> g){} // B와 B의 자식클래스 가능
    void method4(Goods<? super G> g){} // B와 B의 부모클래스 가능
}

class E{}
class F extends E{}
class G extends F{}
class H extends G{}
class Goods<T> {
    private T t;
    public T get() {
        return t;
    }
    public void set(T t) {
        this.t = t;
    }

}