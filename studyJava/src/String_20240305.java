public class String_20240305 {
    public static void main(String[] args) {
        String str1 = new String("안녕");
        String str2 = str1;
        str1 = "안녕하세요";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println();

        String st1 = "Start";
        String st2 = "Start";
        String st3 = new String("Start");
        if(st1==st2){
            System.out.println("같음");
        } else{
            System.out.println("다름");
        }
        if(st2==st3){
            System.out.println("같음");
        } else{
            System.out.println("다름");
        }
        System.out.println(st2.equals(st3)); // 문자열 자체를 비교
        st3 = "Start";
        if(st2==st3){
            System.out.println("같음");
        } else{
            System.out.println("다름");
        }

        //문자열의 '+' 연산
        String a1 = "hello";
        String a2 = "world";
        System.out.println(a1+" "+a2);
        String a3 = a1 + a2;
        System.out.println(a3);

        //문자열과 숫자의 '+' 연산
        System.out.println(1+"hi"); //1hi
        System.out.println(1+2+"hi"); //3hi
        System.out.println("hi"+1+2); //hi12
        System.out.println("hi"+(1+2)); //hi3
    }
}
