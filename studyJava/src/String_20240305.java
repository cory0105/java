public class String_20240305 {
    public static void main(String[] args) {

        // String 클래스의 첫번째 특징
        // 객체의 값을 변경하면 새로운 객체를 생성 (주소값이 새로운 주소로 변경)
        // String 객체 변수는 값이 수정되지 않고 항상 새로운 값을 만듬!!
        String str1 = new String("안녕");
        String str2 = str1;
        str1 = "안녕하세요";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println();

        // String 클래스의 두번째 특징
        // 리터럴로 입력하는 경우, 해당 문자열을 재사용(=공유)함
        // 리터럴로 입력되는 값은 런타임이전에 이미 메모리에 만들어짐
        String st1 = "Start";
        String st2 = "Start";
        String st3 = new String("Start");
        if(st1==st2){
            System.out.println("1. 같음");
        } else{
            System.out.println("1. 다름");
        }
        if(st2==st3){
            System.out.println("2. 같음");
        } else{
            System.out.println("2. 다름");
        }
        System.out.println(st2.equals(st3)); // 문자열 자체를 비교
        st3 = "Start";
        if(st2==st3){
            System.out.println("3. 같음");
        } else{
            System.out.println("3. 다름");
        }
        st2 = new String("Start");
        if(st2==st3){
            System.out.println("4. 같음");
        } else{
            System.out.println("4. 다름");
        }
        st3 = new String("Start");
        if(st2==st3){
            System.out.println("5. 같음");
        } else{
            System.out.println("5. 다름");
        }
        System.out.println();

        //문자열의 '+' 연산
        String a1 = "hello";
        String a2 = "world";
        System.out.println(a1+" "+a2);
        String a3 = a1 + a2;
        System.out.println(a3);
        System.out.println();

        //문자열과 숫자의 '+' 연산
        System.out.println(1+"hi"); //1hi
        System.out.println(1+2+"hi"); // 3hi
        System.out.println("hi"+1+2); //hi12
        System.out.println("hi"+(1+2)); //hi3
    }
}
