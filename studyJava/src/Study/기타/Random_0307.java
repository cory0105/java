package Study.기타;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Random_0307 {
    public static void main(String[] args) {
//        // 난수생성법, Random 숫자 만드는 법
//        Random rd = new Random();
//        int randNum = rd.nextInt(10); // 0 부터 입력한 정수값 -1 범위에서 랜덤
//        System.out.println(randNum);
//
//        // 정수의 배열[6]을 1~45(값 중복 허용X)
//        { // 내가 만든 코드
//            Random rd2 = new Random();
//            int[] randNum2 = new int[6];
//            for (int i = 0; i < randNum2.length; i++) {
//                randNum2[i] = rd2.nextInt(45) + 1;
//                for (int j = 0; j < i; ) {
//                    if (randNum2[i] == randNum2[j]) {
//                        randNum2[i] = rd2.nextInt(45) + 1;
//                    } else if (randNum2[i] != randNum2[j]) {
//                        j++;
//                    }
//                }
//            }
//            System.out.println(Arrays.toString(randNum2));
//        }
//
//        { // 효율적인 코드(참고)
//            Random rd2 = new Random();
//            int[] randNum2 = new int[6];
//            for (int i = 0; i < randNum2.length; i++) {
//                randNum2[i] = rd2.nextInt(45) + 1;
//                for (int j = 0; j < i; j++) {
//                    if (randNum2[i] == randNum2[j]) {
//                        i--;
//                        break;
//                    }
//                }
//            }
//            System.out.println(Arrays.toString(randNum2));
//        }
//
//        { // 중복을 없애고 순서 맞추는 코드
//            Random rd2 = new Random();
//            int[] randNum2 = new int[6];
//            for (int i = 0; i < randNum2.length; i++) {
//                randNum2[i] = rd2.nextInt(6) + 1;
//            } System.out.println("초기값 " + Arrays.toString(randNum2));
//            out:
//            while (true) {
//                for (int i = 0; i < randNum2.length * randNum2.length; i++) {
//                    for (int j = 0; j < randNum2.length - 1; j++) {
//                        if (randNum2[j] > randNum2[j + 1]) {
//                            int temp = randNum2[j];
//                            randNum2[j] = randNum2[j + 1];
//                            randNum2[j + 1] = temp;
//                        }
//                    }
//                }
//                System.out.println("정렬 " + Arrays.toString(randNum2));
//                boolean a = true;
//                for (int i = 0; i < randNum2.length - 1; i++) {
//                    if (randNum2[i] == randNum2[i + 1]) {
//                        randNum2[i] = rd2.nextInt(6) + 1;
//                        a = false;
//                    }
//                    if (i==randNum2.length-2 && a){
//                        break out;
//                    }
//                }
//                System.out.println("조정 " + Arrays.toString(randNum2));
//            }
//            System.out.println();
//            System.out.println("완료 " + Arrays.toString(randNum2));
//        }
//

//        { // 중복을 없애고 순서 맞추는 코드
//            Random rd2 = new Random();
//            int[] randNum2 = new int[6];
//            for (int i = 0; i < randNum2.length; i++) {
//                randNum2[i] = rd2.nextInt(6) + 1;
//            }
//            System.out.println("초기값 " + Arrays.toString(randNum2));
//            out:
//            while (true) {
//                boolean a = false;
//                for (int j = 0; j < randNum2.length - 1; j++) {
//                    if (randNum2[j] > randNum2[j + 1]) {
//                        int temp = randNum2[j];
//                        randNum2[j] = randNum2[j + 1];
//                        randNum2[j + 1] = temp;
//                        a = true;
//                    }
//                    if (j==randNum2.length-2 && a){
//                        continue out;
//                    }
//                }
//                System.out.println("정렬 " + Arrays.toString(randNum2));
//                for (int i = 0; i < randNum2.length - 1; i++) {
//                    if (randNum2[i] == randNum2[i + 1]) {
//                        randNum2[i] = rd2.nextInt(6) + 1;
//                        a = true;
//                    }
//                    if (i==randNum2.length-2 && !a){
//                        break out;
//                    }
//                }
//                System.out.println("조정 " + Arrays.toString(randNum2));
//            }
//            System.out.println("완료 " + Arrays.toString(randNum2));
//        }


//
//        {
//            Random rd2 = new Random();
//            int[] randNum2 = new int[6];
//            for (int i = 0; i < randNum2.length; i++) {
//                randNum2[i] = rd2.nextInt(45) + 1;
//                if (randNum2[i] > 45-randNum2.length+1+i) {
//                    i--;
//                } else if (i != 0 && randNum2[i] <= randNum2[i - 1]) {
//                    i--;
//                }
//            }
//            System.out.println(Arrays.toString(randNum2));
//        }
//
//        {
//            Random rd2 = new Random();
//            int[] randNum2 = new int[6];
//            for (int i = 0; i < randNum2.length; i++) {
//                randNum2[i] = rd2.nextInt(6) + 1;
//                if (randNum2[i] > 6-randNum2.length+1+i || (i!=0 && randNum2[i] <= randNum2[i-1])) {
//                    i--;
//                }
//            }
//            System.out.println(Arrays.toString(randNum2));
//        }

        // HashSet을 이용함. 가장 효율적이고 빠른 방법
        Random rd = new Random();
        HashSet<Integer> intList4 = new HashSet<>();
        while(intList4.size() < 6) {
            intList4.add(rd.nextInt(45) + 1);
        }
        System.out.println(intList4.toString());
    }
}
