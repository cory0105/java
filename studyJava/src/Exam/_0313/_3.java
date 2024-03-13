package Exam._0313;

import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        // n만큼 배열 안의 숫자를 왼쪽으로 순환하는 배열

        int [] arr = new int [] {1, 2, 3, 4, 5};

        int n = 3;

        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) { // arr 배열의 값을 출력하는 for문
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < n; i++){ // 3전까지만 for문을 돌림
            int j, first;
            first = arr[0];  // 포인트 1 // first는 무조건 배열의 첫 번째 수가 됨.
            for(j = 0; j < arr.length-1; j++){
                arr[j] = arr[j+1]; // 배열 안의 숫자를 한 번지씩 앞으로 저장
            }
            arr[j] = first;  // 포인트 2 j==4 따라서 마지막 배열은 1이 됨
        }
        System.out.println();

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " "); // 4 5 1 2 3
        }
    }
}

class _3_1 {
    public static void main(String[] args) {
        // n만큼 배열 안의 숫자를 왼쪽으로 순환하는 배열

        int [] arr = new int [] {1, 2, 3, 4, 5};

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < n; i++){
            int j, first;
            first = arr[0];
            for(j = 0; j < arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }
        System.out.println();

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

class _3_2 {
    public static void main(String[] args) {
        // n만큼 배열 안의 숫자를 왼쪽으로 순환하는 배열

        int [] arr = new int [] {1, 2, 3, 4, 5};
        int n = 3;
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for(int i = 0; i < n; i++){
            int j, last;
            last = arr[arr.length-1];
            for (j=arr.length-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[j] = last;
        }
        System.out.println();
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

class _3_메소드{
    public static void main(String[] args) {

    }

    public void loof(int n, int[] arr){
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for(int i = 0; i < n; i++){
            int j, last;
            last = arr[arr.length-1];
            for (j=arr.length-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[j] = last;
        }
        System.out.println();
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}