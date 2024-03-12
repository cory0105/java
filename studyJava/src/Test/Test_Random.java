package Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test_Random {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 랜덤 갯수를 입력하시오 : ");
        int num = sc.nextInt();
        int[] a = new int[num];
        for (int i=0; i<a.length; i++){
            a[i] = rd.nextInt(5)+1;
        }
        System.out.println("1부터 5사이의 값을 입력하세요.");
        int[] user = new int[num];
        for (int i=0; i<a.length; i++){
            System.out.print(i+1+"번 : ");
            user[i] = sc.nextInt();
            if(user[i]<1 || user[i]>5){
                i--;
                System.out.println("잘못 입력하셨습니다.");
            }
        }
        for (int i=0; i<a.length; i++){
        }
        System.out.println(Arrays.toString(user));

        System.out.println(Arrays.toString(a));
    }
}
