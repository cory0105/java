package Study.Class._0325;

public class Main {
    public static void main(String[] args) {
        //Abstract javaAbstract = new Abstract(); //추상 클래스는 인스턴스화 안됨
        JavaChild javaChild = new JavaChild(); // 추상 클래스를 상속한 클래스는 인스턴스화 가능
        System.out.println(javaChild.getValue());
        System.out.println(javaChild.getString());
        System.out.println();
        System.out.println(javaChild.a);
        System.out.println(javaChild.b);
        System.out.println();

//        Abstract javaAbstract2 = new Abstract(3,"a");
//        System.out.println(javaAbstract2.getValue());
//        System.out.println(javaAbstract2.getString());
        Abstract java = new JavaChild();
        System.out.println(java.a);
        System.out.println(java.b);
        System.out.println(java.getString());
        System.out.println();

        Abstract a = new JavaChild(10, "a");
        System.out.println(a.getValue());
        System.out.println(a.getString());
        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println();

        JavaChild javaChild1 = new JavaChild();
        System.out.println(javaChild1.getString());
        javaChild1.setValue(999);
        javaChild1.setString("banana");
        System.out.println(javaChild1.getValue());
        System.out.println(javaChild1.getString());

    }
}
