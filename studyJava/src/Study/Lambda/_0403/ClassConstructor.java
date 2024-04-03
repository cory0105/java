package Study.Lambda._0403;

interface CC{
    MyClass method();
}
interface CC2{
    MyClass method(int k);
}
class MyClass{
    int k;
    MyClass(){
        System.out.println("기본 생성자");
    }
    MyClass(int k){
        System.out.println("매개변수 생성자" + k);
        this.k=k;
    }
}
public class ClassConstructor {
    public static void main(String[] args) {
        // 함수 인터페이스 메서드가 외부클래스를 리턴하는 경우
        // 메서드 내에서 외부클래스의 생성자를 잉용하여 객체를 생성해야 함
        CC a1 = new CC() {
            @Override
            public MyClass method() {
                return new MyClass();
            }
        };
        CC a2 = () -> new MyClass(3); // 람다식 단축형 1
        CC a3 = MyClass::new; // 람다식 단축형 2
        a2.method();
        a3.method();

        CC2 cc2 = (int k) -> new MyClass(k);
        CC2 cc21 = MyClass::new;
        cc21.method(3);
    }
}
