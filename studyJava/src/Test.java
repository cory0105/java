import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] inta = {1,2,3};
        System.out.println(Arrays.toString(inta));
        for(int k: inta){
            System.out.print(k+" ");
        }
        System.out.println();
        System.out.println();

        { // 5번째 소수는 무엇인지 출력
            int count = 0;
            out:
            for (int i = 0; i >= 0; i++) {
                int sum = 0;
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        sum = sum + 1;
                    }
                }
                if (sum == 1) {
                    count++;
                    if (count == 5) {
                        System.out.println(count + "번째 소수는 " + i);
                        break out;
                    }
                }
            }
        }
        System.out.println();

        { // 5번째 소수까지 출력
            int count = 0;
            out:
            for (int i = 0; i >= 0; i++) {
                int sum = 0;
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        sum = sum + 1;
                    }
                }
                if (sum == 1) {
                    count++;
                    System.out.println(count + "번째 소수는 " + i);
                    if (count == 5) {
                        break out;
                    }
                }
            }
        }
        System.out.println();

        { // 3~5번째 소수까지 출력
            int count = 0;
            out:
            for (int i = 0; i >= 0; i++) {
                int sum = 0;
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        sum = sum + 1;
                    }
                }
                if (sum == 1) {
                    count++;
                    if(count>=3){
                        System.out.println(count + "번째 소수는 " + i);
                    }
                    if (count == 5) {
                        break out;
                    }
                }
            }
        }
        System.out.println();

        { // 100보다 큰 소수 중 제일 작은 수
            int count = 0;
            int i=0;
            out:
            for (i = 0; i>=0; i++) {
                int sum = 0;
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        sum = sum + 1;
                    }
                }
                if (sum == 1) {
                    count++;
                    if(i>100){
                        System.out.println(count + "번째 소수는 " + i);
                        break out;
                    }
                }
            }
        }
        System.out.println();

        { // 100보다 작은 소수 중 제일 큰 수
            int count = 0;
            int i=0;
            int a=0;
            out:
            for (i = 0; i<100; i++) {
                int sum = 0;
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        sum = sum + 1;
                    }
                }
                if (sum == 1) {
                    count++;
                    a=i;
                }
            }
            System.out.println(count + "번째 소수는 " + a);
        }

        String test = "aekjlaaajklaeaakaaaejala";
        for (int i = 0; i < test.length(); i++) {
            System.out.print(test.indexOf('a', test.indexOf('a') + i) + " ");
            i = test.indexOf('a', test.indexOf('a') + i);
        }


    }
}
