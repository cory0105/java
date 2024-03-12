package StudyClass;
import StudyClass2.D;

public class A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(B.b); //Static으로 선언 되어 컴파일 전에 만들어져서 사용가능 but a의 경우 사용 불가
        System.out.println(C.b);
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(D.b);
    }
    class B{
        int a = 3;
        static int b = 5;
    }
}

