package Study.String;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class String_0307 {
    public static void main(String[] args) {
        //아래 배열에서 입력받은 값보다 큰 수만 출력하시오.
        int[] intList1 = {1,2,3,4,5,6,7,8,9,10};
        Scanner scan = new Scanner(System.in);
        System.out.print("0~10까지 숫자를 입력해주세요 : ");
        int num = 0;
        while (true) {
            num = scan.nextInt();
            if(num<=10 && num>=0){
                break;
            } else {
                System.out.println("입력하신 숫자는 0~10 사이의 숫자가 아닙니다.");
                System.out.print("다시 입력해주세요 : ");
            }
        }
        int[] intList2 = new int[9];
        int count = 0;
        for (int i = 0; i<intList1.length; i++){
            if(intList1[i]>num){
                System.out.print(intList1[i]+" ");
                intList2[count] = intList1[i];
                count++;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(intList2));

        ArrayList<Integer> intList3 = new ArrayList<Integer>();
        for (int i = 0; i<intList1.length; i++){
            if(intList1[i] > num){
                intList3.add(intList1[i]);
            }
        }
        System.out.println(intList3);
    }
}
