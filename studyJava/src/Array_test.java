import java.util.Arrays;

public class Array_test {
    public static void main(String[] args) {
        // 1. 길이가 10인 배열에 1부터 10까지 값을 입력하는 방법
            // 방법1
        int[] q1a1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(q1a1));
            // 방법2
        int[] q1a2 = new int[10];
        for(int i=0; i<q1a2.length; i++){
            q1a2[i] = i+1;
        }
        System.out.println(Arrays.toString(q1a2));

        // 2. 길이가 10인 배열에 10부터 1까지 값을 입력하는 방법
            //방법1
        int[] q2a1 = new int[10];
        int a = 10;
        for(int i=0; i<q2a1.length; i++){
            q2a1[i] = a;
            a--;
        }
        System.out.println(Arrays.toString(q2a1));
            //방법2
        int[] q2a2 = new int[10];
        for(int i=0; i<q2a2.length; i++){
            q2a2[i] = q2a2.length - i;
        }
        System.out.println(Arrays.toString(q2a2));

            //선생님 예시
        int[] q2e1 = new int[10];
        int len = q2e1.length;
        for(int i=0; i<q2e1.length; i++){
            q2e1[i] = len;
            len = len-1;
        }
        System.out.println(Arrays.toString(q2e1));

        // 3. 아래 과일 배열에 "사과"가 몇 개 들어있는지 확인
        // String[] fruitList = {"배", "사과", "바나나", "딸기", "사과", "수박"};
            //방법1
        String[] fruitList = {"배", "사과", "바나나", "딸기", "사과", "수박"};
        int count=0;
        for(int i=0; i<fruitList.length; i++){
            if(fruitList[i]=="사과"){
                count++;
            }
        }
        System.out.println("사과는 총 "+count+"개가 있습니다.");


    }
}
