package Exam._0315;
class A{
    char[] m = {'a','e','i','o','u'};
    char[] j = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','s','y','z'};

    A(){}
    A(String str){
        int mcount = 0;
        int jcount = 0;
        char[] array = str.toLowerCase().toCharArray();
        for (int i=0; i<array.length; i++){
            if (a(array,i).equals("모음")){
                mcount++;
            } else if (a(array,i).equals("자음")){
                jcount++;
            }
        }
        System.out.println("모음"+mcount+" 자음"+jcount);
    }

    public String a(char[] array, int e){
        for (int i=0; i<m.length; i++){
            if (array[e]==m[i]){
                return "모음";
            }
        }
        for (int i=0; i<j.length; i++){
            if (array[e]==j[i]){
                return "자음";
            }
        }
        return " ";
    }
}

public class Count {
    public static void main(String[] args) {
        // 아래 문자열의 모음과 자음의 갯수를 각각 count 하시오
        // 모음은 a e i o u
        // 스페이스는 문자 아님

        String str = "This is a really simple sentence";
        A a = new A(str);
    }
}
