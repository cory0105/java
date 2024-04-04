package HomeWork._0403;

public class Q1 {
    public static void main(String[] args) {
        // String 문자열의 소문자는 대문자로, 대문자는 소문자로 변경시킨
        // String 문자열을 리턴하는 메서드(changeCase)를 완성하시오
        String str = "cHanGe CasE";
        String result = changeCase(str);
        System.out.println(result); // ChANgE cASe
    }

    public static String changeCase(String str) {
        // 여기 코드 작성 !!
        String result = "";
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)>='a' && str.charAt(i)<='z'){
                result = result + str.toUpperCase().charAt(i);
            } else {
                result = result + str.toLowerCase().charAt(i);
            }
        }
        return result;
    }
}