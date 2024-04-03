package Study.Lambda.Exam;

interface IntCalculator{
    int calculate(int a, int b);
}
public class Exam1 {
    public static void main(String[] args) {
        // calculate 함수의 정의 = 두 개의 매개변수의 덧셈
        IntCalculator adder = (a, b) -> a+b;
        int result = adder.calculate(5,3);
        System.out.println(result);

        printResult(4,6,(x,y) -> x*y);
        printResult(4,3,adder);
    }
    public static void printResult(int x, int y, IntCalculator calculator){
        System.out.println("Result : " + calculator.calculate(x,y));
    }
}
