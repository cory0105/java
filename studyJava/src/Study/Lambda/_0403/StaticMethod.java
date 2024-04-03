package Study.Lambda._0403;

interface AAA{
    void methodAAA();
}
class BBB{ // 외부 라이브러리 클래스
    static void methodB(){
        System.out.println("외부클래스의 정적 메서드");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        // 외부클래스 메서드가 static이므로 외부클래스를 객체화할 필요가 없으므로
        // new 키워드로 생성하는 부분이 필요없음
        AAA a0 = () -> {BBB.methodB();};
        AAA a1 = BBB::methodB;
        a1.methodAAA();
    }
}
