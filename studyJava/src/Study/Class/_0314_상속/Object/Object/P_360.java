package Study.Class._0314_상속.Object.Object;

/*Object 클래스의 toString() 메서드*/

class A { //extends Object (컴파일러에 의해서 자동추가)
    int a=3;
    int b=4;
}
class B extends A{
    int a=3;
    int b=4;

    public String toString() {
        return "필드값(a, b) =" + this.a +" " +super.b;
    }
}
public class P_360 {
    public static void main(String[] args) {
        //#1. 객체 생성
        A a = new A();
        B b = new B();

        //#2. 메서드 호출
        System.out.printf("%x\n", a.hashCode()); //hashcode를 16진수로 표현
        System.out.println(a.toString()); //toString()메서드는 생략시 자동 추가
        System.out.println(b);
    }
}
