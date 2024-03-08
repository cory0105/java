import java.util.Scanner;

public class Test_Claas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("회원이시면 로그인을, 아니시라면 회원가입을 입력해주세요 : ");
        String a = sc.nextLine();
        if(a.equals("회원가입")){
            data newUser = new data();
            newUser.member();
        } else if (a.equals("로그인")) {

        }
    }
}

class data{
    private String name;
    private int age;
    private String perNum;
    private String id;
    private String pw;
    private String address;

    public data() {
    }

    public data(String name, int age, String perNum, String id, String pw, String address) {
        this.name = name;
        this.age = age;
        this.perNum = perNum;
        this.id = id;
        this.pw = pw;
        this.address = address;
    }

    public void member(){
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        this.name = sc.nextLine();
        System.out.print("나이 : ");
        this.age = sc.nextInt();
        System.out.print("주민번호 : ");
        this.perNum = sc.nextLine();
        System.out.print("아이디 : ");
        this.id = sc.nextLine();
        System.out.print("비밀번호 : ");
        this.pw = sc.nextLine();
        System.out.print("주소 : ");
        this.address = sc.nextLine();
    }

    public void login(){
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디 : ");
        this.id = sc.nextLine();
        System.out.print("비밀번호 : ");
        this.pw = sc.nextLine();
    }
}