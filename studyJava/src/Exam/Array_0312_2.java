package Exam;

import java.util.Arrays;

// 설명하는 문제(내가 쓴 해설)
public class Array_0312_2 {
    public static void main(String[] args) {
        // arr 배열 안의 같은 값이 몇 개 있는 지를 출력하는 코드
        int [] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int [] fr = new int [arr.length]; // arr와 같은 크기의 배열을 만들기 위해 만듬
        int visited = -1; // 중복된 값을 출력하지 않기 위해 생성
        for(int i = 0; i < arr.length; i++){
            int count = 1; // 해당 숫자가 몇 개 있는 지를 알기 위한 변수
            for(int j = i+1; j < arr.length; j++){ // i+1이 초기값인 이유는 i보다 1큰 수들을 비교하기 위함임.
                if(arr[i] == arr[j]){ // i번째 배열과 j번째 배열이 같다는 것은 해당 값이 중복되었다는 이야기임.
                    count++; // 중복되어 있으므로 count를 1 증가시킴
                    fr[j] = visited; // arr[j] 안의 값은 이미 전에 나온 중복 값이므로 기억을 하기 위해 visited를 사용하여 앞의 내용과 중복된 값이라는 것을 기억함.
                }
            }
            if(fr[i] != visited) // fr[i]가 visited랑 같다는 것은 이미 앞의 내용이 fr[i]랑 값이 같다는 것임. 그렇기 때문에 따로 중복값이 몇 개인지 출력하지 않아도 됨.
                fr[i] = count; // fr[i]에 arr[i]의 값과 같은 값이 몇 개 있는지를 기억함.
        }

        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited) // fr[i]가 visited랑 같다는 것은 이미 중복값이 앞에 나왔다는 것이므로 다음을 실행하지 않음
                System.out.println("    " + arr[i] + "    |    " + fr[i]); // arr[i]는 해당 값을, fr[i]는 해당 값이 몇 번 나오는 지를 출력
        }
    }
}
