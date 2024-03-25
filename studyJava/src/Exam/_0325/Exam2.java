package Exam._0325;

public class Exam2 { //오름차순으로 정렬
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i; // i보다 큰 번지 중 가장 작은 숫자가 있는 배열의 번지를 기억하기 위한 변수
            for (int j = i + 1; j < arr.length; j++){ // i보다 큰 번지를 비교하기 위한 for문
                if (arr[j] < arr[index]){ // 더 작은 값을 기억하기 위한 비교문
                    index = j;
                }
            }
            int smallerNumber = arr[index]; // i보다 큰 번지 중 가장 작은 숫자를 smallerNumber에 기억
            arr[index] = arr[i]; // 가장 작은 숫자를 가진 주소에 i번지의 주소를 저장
            arr[i] = smallerNumber; // i번지는 가장 작은 숫자로 변환
        }
    }

    public static void main(String a[]){
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        selectionSort(arr1);

        System.out.println("After Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}
