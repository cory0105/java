package Test;

class A{
}
class B extends A{

}
public class class_object {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A aa = new A();
        if (a.toString()==aa.toString()){
            System.out.println("o");
        } else {
            System.out.println("x");
        }
        System.out.println(a);
        System.out.println(aa);
    }
}
