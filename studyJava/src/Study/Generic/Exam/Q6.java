package Study.Generic.Exam;

public class Q6 {
    public static void main(String[] args) {
        B<String,Integer> b = new B<>();
        b.setV("안녕");
        b.setK(3);
        b.print();
    }
}

class A<K>{
    K k;
    public void setK(K k) {
        this.k = k;
    }
}
class B<V,K> extends A<K>{
    V v;
    public void setV(V v) {
        this.v = v;
    }
    public void print(){
        System.out.println(k + ": " + v);
    }
}