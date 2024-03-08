import java.util.ArrayList;

public class t {
    public static void main(String[] args) {
        ArrayList<Integer> intList3 = new ArrayList<Integer>();
        intList3.add(1);
        intList3.add(2);
        intList3.add(3);
        System.out.println(intList3.toString());
        System.out.println(intList3);

        int[] intList1 = new int[3];
        intList1[0] = intList3.get(1);
        System.out.println(intList1[0]);
    }
}