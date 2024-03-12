package Study.Class;

public class Class_0311_cunstructor {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println();
        A a2 = new A(3);
        A a3 = new A(1,3);
    }
}

class A{
    int age;
    A(){
        System.out.println("첫 번째 생성자");
    }

    A(int a){
        this();
        System.out.println("두 번째 생성자");
    }
    A(int a, int b){
    }
    /*void abc(){
        this();
    }*/
}