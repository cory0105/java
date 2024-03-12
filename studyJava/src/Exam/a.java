package Exam;

import java.util.Arrays;

public class a {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};
        int[] fr = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (fr[i] != visited) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        fr[j] = visited;
                    }
                }
                fr[i] = count;
//                System.out.println(Arrays.toString(fr));
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
            }
        }
    }
}

