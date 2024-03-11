public class cc {
    public static void main(String[] args) {
        AA a = new AA();
        a.print();
        a.print(3);
        a.print(5.8);
        a.print("안녕");
    }
}

class AA{
    void print(){
        System.out.println("입력값이 없습니다.");
    }
    void print(int n){
        System.out.println("정수 입력값 : "+ n);
    }
    void print(double n){
        System.out.println("실수 입력값 : " + n);
    }
    void print(String n){
        System.out.println(n);
    }
}