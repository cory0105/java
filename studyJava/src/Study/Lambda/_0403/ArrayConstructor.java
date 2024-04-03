package Study.Lambda._0403;

interface AC{
    int[] methodAC(int length);
}
public class ArrayConstructor {
    public static void main(String[] args) {
        // 함수형 인터페이스 메서드가 입력된 갯수 만큼의 정수 배열을 리턴하는 경우
        AC ac = new AC() { // 익명 이너 클래스
            @Override
            public int[] methodAC(int length) {
                return new int[length];
            }
        };
        AC ac1 = length -> {return new int[length];};
        AC ac2 = length -> new int[length];
        AC ac3 = int[]::new;

        int[] array1 = ac3.methodAC(10);
        System.out.println(array1.length);
        int[] array2 = ac2.methodAC(20);
        System.out.println(array2.length);
    }
}
