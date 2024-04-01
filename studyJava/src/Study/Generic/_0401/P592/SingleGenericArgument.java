package Study.Generic._0401.P592;

public class SingleGenericArgument {
    public static void main(String[] args) {
//        MyClass myClass = new MyClass(); // 보통의 생성단계
        MyClass<String> mc1 = new MyClass<String>(); // 제네릭의 생성단계
        mc1.set("안녕"); // 생성단계에서 자료형을 결정했기 때문에 입력단계에서 특정 자료형만 받음
        System.out.println(mc1.get());
        MyClass<Integer> mc2 = new MyClass<Integer>();
        mc2.set(100);
        System.out.println(mc2.get());
    }
}

class MyClass<T>{
    public T t;
    public T get() {
        return t;
    }
    public void set(T t) {
        this.t = t;
    }
}