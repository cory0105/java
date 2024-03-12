package Study.String;

import java.util.Arrays;

public class String_0306_2 {
    public static void main(String[] args) {
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.replace("Study", "공부"));
        // Study를 못 찾으면 변경하지 않고 원본 그대로 둠
        System.out.println(str1.replace("study", "공부"));
        // 두 번째 파라미터로 사용된 인덱스는 포함되지 않음(0<= 범위 <5)
        System.out.println(str1.substring(0, 5));

        // 연산자를 이용하여 ':'와 '/' 기준으로 분리시킴
        // split 메소드의 리턴형은 string[] 문자열의 배열이다
        String[] strArray = "abc/def-ghi jkl".split("/|-| ");
        System.out.println(Arrays.toString(strArray));
        String str1_ = " abc def ";
        //"앞뒤" 공백지우기
        System.out.println(str1_.trim());
        // 모든 공백 지우기
        System.out.println(str1_.replaceAll(" ", ""));
        System.out.println();

        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("java");

        System.out.println(str2==str3);
        System.out.println(str3==str4);
        System.out.println(str4==str2);
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));
    }
}
