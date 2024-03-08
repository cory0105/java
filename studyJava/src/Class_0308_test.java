import java.util.Scanner;
import java.util.Stack;

public class Class_0308_test {
    public static void main(String[] args) {
        // 양의 정수 10개를 입력
        // 배열에 담기
        // 3의 배수만 출력
            a(); // 방법1 : 사용자가 무조건 양의 정수만 출력할 것이란 전제가 있을 때의 방법
            b(); // 방법2 : 사용자가 음수의 값도 입력할 수도 있다는 가정이 있을 때의 방법(음수를 입력 시 다시 입력하게 함)
            multiple(input(10),3); // 방법3 : 몇 개의 정수를 입력받아서, 몇의 배수를 출력할지 정할 수 있는 방법(메소드를 이용해야 함)
    }

    public static void a(){
        int[] num = new int[10];
        for (int i=0; i<num.length; i++) {
            Scanner sc = new Scanner(System.in);
            num[i] = sc.nextInt();
        }
        for (int i=0; i<num.length; i++){
            if(num[i]%3==0){
                System.out.print(num[i] + " ");
            }
        }
    }

    public static void b(){
        int[] num = new int[10];
        System.out.println("양의 정수 10개를 입력하시오.");
        for (int i=0; i<num.length; i++){
            Scanner sc = new Scanner(System.in);
            num[i] = sc.nextInt();
            if (num[i]<=0){
                System.out.println("방금 입력하신 값은 양의 정수가 아닙니다. 다시 입력하시오.");
                i--;
            }
        }
        for (int i=0; i<num.length; i++){
            if(num[i]%3==0){
                System.out.println( num[i]);
            }
        }
    }

    public static void c(int[] num){
        System.out.println("양의 정수 10개를 입력하시오.");
        for (int i=0; i<num.length; i++){
            Scanner sc = new Scanner(System.in);
            num[i] = sc.nextInt();
            if (num[i]<=0){
                System.out.println("방금 입력하신 값은 양의 정수가 아닙니다. 다시 입력하시오.");
                i--;
            }
        }
        for (int i=0; i<num.length; i++){
            if(num[i]%3==0){
                System.out.println( num[i]);
            }
        }
    }

    public static int[] input(int n){
        System.out.println("양의 정수 " + n + "개를 입력하시오.");
        int[] num = new int[n];
        for (int i=0; i<num.length; i++){
            Scanner sc = new Scanner(System.in);
            num[i] = sc.nextInt();
            if (num[i]<=0){
                System.out.println("방금 입력하신 값은 양의 정수가 아닙니다. 다시 입력하시오.");
                i--;
            }
        }
        return num;
    }
    public static void multiple(int[] num, int n){ // 3배수를 출력하는 메소드
        for (int i=0; i<num.length; i++){
            if(num[i]%n == 0){
                System.out.print(num[i] + " ");
            }
        }
    }
}