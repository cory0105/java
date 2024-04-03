package Study.Lambda;

interface T1{
    void abc(T2 t2, T3 t3);
}
interface T2{
    void a(T3 t3);
}
class T3{
    void b(){
        System.out.println("T3");
    }
}
public class Test {
    public static void main(String[] args) {
        T1 t1 = T2::a;
        T2 t2 = T3::b;
        t1.abc(t2,new T3());
    }
}
