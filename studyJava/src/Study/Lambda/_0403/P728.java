package Study.Lambda._0403;

interface A{
    void method1(); // 입력 x, 리턴 x
}
interface B{
    void method2(int a); // 입력 o, 리턴 x
}
interface C{
    int method2(); // 입력 x, 리턴 o
}
interface D{
    double method4(int a, double b); // 입력 o, 리턴 o
}

public class P728 {
    public static void main(String[] args) {
        // 익명 이너 클래스
        A a0 = new A(){
            public void method1(){
                System.out.println("pattern 1");
            }
        };
        a0.method1();

        // 람다식 단축형
        A a = () -> System.out.println("Pattern 1");
        a.method1();

        B b = (int x) -> System.out.println("patter 2 : " + x);
        B b1 = (x) -> System.out.println("patter 2 : " + x);
        B b2 = x -> System.out.println("patter 2 : " + x); // 매개변수가 하나인 경우만 소괄호 삭제
        b2.method2(5);

        C c = () -> {return 3;}; // 리턴이 있으므로 중괄호 필요
        C c1 = () -> 3; // 리턴을 생략하려면 중괄호도 같이 생략
        System.out.println(c1.method2());

        D d = (int x, double y) -> {return x + y;};
        D d1 = (int x, double y) -> x + y;
        D d2 = (x, y) -> x + y;
        System.out.println(d2.method4(10,5.5));
    }
}
