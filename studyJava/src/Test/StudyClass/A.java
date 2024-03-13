package Test.StudyClass;
import Test.StudyClass2.D;

public class A {
    public static void main(String[] args) {
        C num = new C();
        System.out.println(B.b); //Static으로 선언 되어 컴파일 전에 만들어져서 사용가능 but a의 경우 사용 불가
        System.out.println(C.b);
        System.out.println(num.a);
        System.out.println(num.b);
        System.out.println(D.b);
        System.out.println(num.getC()); //private으로 선언 되어 getter로 읽어야 함
        System.out.println(C.getD()); //private static으로 선언되어
    }
    class B{
        int a = 3;
        static int b = 5;
    }
}

