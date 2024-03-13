package Exam._0313;

public class _2 {
    public static void main(String[] args) {

        // 아래 문자열의 글자수를 카운트
        // 스페이스는 카운트하지 마시오
//        String string = "The best of both worlds";
//        int count = 0;

    }
}

class _2_1{
    public static void main(String[] args) {
        String string = "The best of both worlds";
        System.out.println(string.replace(" ","").toCharArray().length);
    }
}

class _2_2{
    // 아래 문자열의 글자수를 카운트
    // 스페이스는 카운트하지 마시오
    public static void main(String[] args) {
        String string = "The best of both worlds";
        int count = 0;
        char[] a = string.toCharArray();
        for (int i=0; i<a.length; i++){
            if (a[i] != ' ' ) {
                count++;
            }
        }
        System.out.println(count);
    }
}