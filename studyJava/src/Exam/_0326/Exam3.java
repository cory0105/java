package Exam._0326;

public class Exam3 {
    // 문자열 "12345"의 각 자리에 있는 숫자를 더하는 코드를 완성하시오
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

//        char[] charArray = str.toCharArray();
//        for (int i=0; i<charArray.length; i++){
//            sum = sum + charArray[i]-48;
//        }
//        System.out.println("합계는 " + sum); // 15

//        for (int i=0; i<str.length(); i++){
//            sum = sum + str.charAt(i) - 48;
//        }
//        System.out.println("합계는 " + sum); // 15

        for (int i=0; i<str.length(); i++){
            sum = sum + Character.getNumericValue(str.charAt(i));
        }
        System.out.println("합계는 " + sum); // 15
    }
}
