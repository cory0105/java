package Exam._0327;

public class BinarySearchExample { // 정렬이 되어있다는 가정에만 사용 가능
    public static void binarySearch(int arr[], int first, int last, int key){ // arr:배열, first:비교할 배열의 첫 인덱스, last:배열의 마지막 인덱스, key:찾을 값
        int mid = (first + last)/2; //mid==2
        while( first <= last ){
            if ( arr[mid] < key ){ //
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        int key = 30;
        int last=arr.length-1;
        binarySearch(arr,0,last,key);
    }
}