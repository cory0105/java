package Study.Class._0313_상속.오버라이딩;

class A{
    char a = 'a';
    static char b = 'a';
    void c(){
        System.out.println("a");
    }
    static void d(){
        System.out.println("a");
    }
}
class B extends A{
    char a = 'b';
    static char b = 'b';
    void c(){
        System.out.println("b");
    }
    static void d(){
        System.out.println("b");
    }
}

public class 필드 {
    public static void main(String[] args) {
        A ab = new B();

        System.out.println(ab.a); // 필드 - 부모
        System.out.println(ab.b); // static 필드 - 부모
        ab.c(); // 메소드 - 자식 - 오버라이딩
        ab.d(); // static 메소드 - 부모
    }
}
