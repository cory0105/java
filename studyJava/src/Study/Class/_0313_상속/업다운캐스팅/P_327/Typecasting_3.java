package Study.Class._0313_상속.업다운캐스팅.P_327;

class A{}
class B extends A{}

public class Typecasting_3 {
    public static void main(String[] args) {
        A aa = new A();
        A ab = new B();

        System.out.println(aa instanceof A); // O
        System.out.println(ab instanceof A); // O

        System.out.println(aa instanceof B); // X
        System.out.println(ab instanceof B); // O

        if (aa instanceof B){
            B b = (B) aa;
            System.out.println("aa를 B로 캐스팅했습니다.");
        } else {
            System.out.println("aa는 B 타입으로 캐스팅이 불가능!!!"); // O
        }
        if (ab instanceof B){
            B b = (B) ab;
            System.out.println("ab를 B로 캐스팅했습니다."); // O
        } else {
            System.out.println("ab는 B 타입으로 캐스팅이 불가능!!!");
        }
        if ("안녕" instanceof String){
            System.out.println("\"안녕\"은 String 클래스입니다."); // O
        }
    }
}
