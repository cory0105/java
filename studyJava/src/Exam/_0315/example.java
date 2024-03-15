package Exam._0315;

public class example {
    static void bubble(int[] arr) { // 오름차순으로 정렬하는 메서드
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){ // 한 바퀴 돌면 arr의 마지막 배열에는 제일 큰 수가 저장됨. 그래서 n-i를 해준거임
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {
        int arr[] ={3,60,35,2,45,320,5};

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubble(arr);

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}