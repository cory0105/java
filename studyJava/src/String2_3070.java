import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class String2_3070 {
    public static void main(String[] args) {
        // 아래 배열의 총합과 평균을 출력
        int[] numberList = {12,34,56,32,84,99,73,69};
        int sum=0;
        for (int i = 0; i < numberList.length; i++){
            sum = sum + numberList[i];
        }
        System.out.println("총합 : " + sum + ", 평균 : " + (double) sum / numberList.length);


        // 사용자로부터 문자열을 입력받아서 입력받은 문자열을 거꾸로 출력
        // 예) hello 를 입력 시 olleh 를 출력
        Scanner scan = new Scanner(System.in);
        System.out.print("입력 : ");
        String inputNum = scan.nextLine();
        char[] a = inputNum.toCharArray();
        char[] change = new char[a.length];
        for (int i=0; i < a.length; i++){
            change[i] = a[a.length-1-i];
        }
        System.out.println(Arrays.toString(change));



        // 사용자로부터 문자열을 입력받아서 입력받은 문자열을 거꾸로 출력
        // 예) hello 를 입력 시 olleh 를 출력
        Scanner scan2 = new Scanner(System.in);
        System.out.print("입력 : ");
        String inputNum2 = scan2.nextLine();
        char[] c = inputNum2.toCharArray();
        for (int i = c.length - 1; i>=0; i--){
            System.out.print(c[i]);
        }
    }
}
