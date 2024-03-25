package Study.Class._0325;

abstract public class Abstract {
    int a;
    String b;

    //생성자
    public Abstract() {
        this.a=3;
    }
    public Abstract(int a, String b) {
        this.a = a;
        this.b = b;
    }

    //메서드
    public int getValue(){
        return a;
    }
    abstract public String getString();

    public void setValue(int a){ //세터(setter) 메서드
        this.a = a;
    }
    public void setString(String b){ //세터(setter) 메서드
        this.b = b;
    }
}
