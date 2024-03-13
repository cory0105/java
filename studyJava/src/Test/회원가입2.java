package Test;

import java.util.Scanner;

public class 회원가입2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("회원이시면 로그인을, 아니시라면 회원가입을 입력해주세요 : ");
        while (true) {
            String a = sc.nextLine();
            if (a.equals("회원가입")) {
                newMember();
                break;
            } else if (a.equals("로그인")){
                break;
            }
            System.out.print("잘못 입력하셨습니다. 다시 입력해주세요 : ");
        }
    }
    public static void newMember(){ // 회원가입
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("주민번호 : ");
        String perNum = sc.nextLine();
        System.out.print("아이디 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호 : ");
        String pw = sc.nextLine();
        System.out.print("주소 : ");
        String address = sc.nextLine();
    }
}

