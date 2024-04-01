package Study.Generic._0401;

public class GenericMethodExtends {
    public static void main(String[] args) {
        A a = new A();
        a.method1(2.3);

        B b = new B();
        b.method2(new MyInterface() { // 익명 이너 클래스 사용한 경우
            @Override
            public void print() {
                System.out.println("print() 구현");
            }
        });

        b.method2(new C());
    }
}

class A{
    public <T extends Number> void method1(T t){
        System.out.println(t.intValue());
    }
}

interface MyInterface{
    public abstract void print();
}

class B{
    public <T extends MyInterface> void method2(T t){
        t.print(); // 사용자가 정의한 MyInterface의 자식만 제네릭 T 위치에 올 수 있음. 이렇게 하므로써 메서드도 사용할 수 있음
    }
}

class C implements MyInterface{ // 인터페이스 구현체

    @Override
    public void print() {
        System.out.println("print() 구현2");
    }
}