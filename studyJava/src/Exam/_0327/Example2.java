package Exam._0327;

public class Example2 {
    public static void main(String[] args) {

        // 문제 2. int 타입의 변수 num이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하세요.
        // num이 12345 이면 , ‘1+2+3+4+5’ 15 의 결과인 를 출력
        int num = 12345;
        int sum = 0;

        //방법1
//        String numCopy = String.valueOf(num);
//        for (int i=0; i<numCopy.length(); i++){
//            sum = sum + numCopy.charAt(i) - '0';
//        }
//        System.out.println("sum="+sum);

        //방법2
        while (num != 0){
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("sum="+sum);
    }
}