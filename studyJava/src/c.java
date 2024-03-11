import java.util.Arrays;

public class c {
    int b;
    public static void main(String[] args) {
        int a = 3;
        int k1 = twice(a);
        System.out.println(k1);
        System.out.println(a);
        int[] aa = new int[]{1,2,3,4};
        int[] aa2 = a2(aa);
        System.out.println(Arrays.toString(aa));
        System.out.println(Arrays.toString(aa2));
    }
    public static int twice(int a){
        a=a*2;
        return a;
    }

    public static int[] a2(int[] a){
        for (int i=0; i<a.length; i++){
            a[i] = i+5;
        }
        return a;
    }
}
