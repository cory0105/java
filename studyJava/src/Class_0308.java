import java.util.ArrayList;

public class Class_0308 {
    public static void main(String[] args) {
        Students tom = new Students("Tom", 18, "Daejeon", "123");
        Students Steve = new Students("Steve", 20, "Seoul", "234");
        Students Sam = new Students();
        Sam.name = "Sam";
        Sam.setAge(22);

        System.out.print(tom.name +" ");
//        System.out.print(tom.age+" ");
        System.out.println(tom.getAge());
//        System.out.println(tom.address);
        System.out.println();

        tom.displayName();
        tom.displayAge();
        tom.displayaddress();
        System.out.println();

        tom.displayAll();
        Steve.displayAll();
        Sam.displayAll();

        System.out.println(tom.getPerNum());
        System.out.println(Sam.getName());

        // 메소드 호출
        ArrayList numberLi = new ArrayList();
        int[] numberList = {12,34,56,32,84,99,73,69};
        int[] numberList2 = {12,3324,432,31};
        getSumAvg(numberList);
        getSumAvg(numberList2);

    }
    static void getSumAvg(int[] numberList){ //같은 클래스 안에서는 public을 안 붙여도 됨
        int sum=0;
        for (int i = 0; i < numberList.length; i++){
            sum = sum + numberList[i];
        }
        System.out.println("총합 : " + sum + ", 평균 : " + (double) sum / numberList.length);
    }
}
