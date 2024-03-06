import java.util.Scanner;

public class Scanner_0306 {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("0~6까지 숫자를 입력해주세요 : ");
            int inputNumber = 0;
            while (true) {
                inputNumber = sc.nextInt();
                if (inputNumber >= 0 && inputNumber <= 6) {
                    System.out.println(inputNumber);
                    break;
                } else {
                    System.out.print("잘못입력하셨습니다. 다시 입력해주세요 : ");
                }
            }
        }

        // 자바에서 문자열을 입력 받는 방법
        {
            Scanner sc2 = new Scanner(System.in);
            System.out.print("이름을 입력해주세요 : ");
            String inputstr = sc2.nextLine();
            System.out.println(inputstr);
        }

        // 사용자로부터 0~6까지 숫자를 입력받아 아래 배열에 해당하는 요일을 출력
        {
            char[] week = {'월', '화', '수', '목', '금', '토', '일'};
            Scanner scan = new Scanner(System.in);
            System.out.print("0~6까지 숫자를 입력해주세요 : ");
            int num = scan.nextInt();
            if (num >= 0 && num <= 6) {
                System.out.println(week[num]);
            } else {
                System.out.println("잘못입력하셨습니다.");
            }
        }

        // 사용자로부터 이름을 입력받아 아래 회원배열에 있는 이름이면 '~~님 환영합니다'를 출력하고
        // 없으면 "회원가입을 해주세요"를 출력
        // 소문자, 대문자 상관 없음
        {
            String[] members = {"Steve", "Tom", "Michael", "Laura", "Jessica", "Amia"};
            System.out.print("이름을 입력하시오 : ");
            Scanner sc = new Scanner(System.in);
            String userName = sc.nextLine();
            int a = 0;
            int i = 0;
            for (; i < members.length; i++) {
                if (userName.equalsIgnoreCase(members[i])) {
                    a = 1;
                    break;
                }
            }
            if (a == 1) {
                System.out.println(members[i] + "님 환영합니다.");
            } else {
                System.out.println("회원가입을 해주세요.");
            }
        }

        // 사용자로부터 이름을 입력받아 아래 회원배열에 있는 이름이면 '~~님 환영합니다'를 출력하고
        // 없으면 "회원가입을 해주세요"를 출력
        // 소문자, 대문자 상관 있음
        {
            String[] members = {"Steve", "Tom", "Michael", "Laura", "Jessica", "Amia"};
            System.out.print("이름을 입력하시오 : ");
            Scanner sc = new Scanner(System.in);
            String userName = sc.nextLine();
            int a = 0;
            for (int i = 0; i < members.length; i++) {
                if (userName.equals(members[i])) {
                    a = 1;
                    break;
                }
            }
            if (a == 1) {
                System.out.println(userName + "님 환영합니다.");
            } else {
                System.out.println("회원가입을 해주세요.");
            }
        }

        // 사용자로부터 이름을 입력받아 아래 회원배열에 있는 이름이면 '~~님 환영합니다'를 출력하고
        // 없으면 "회원가입을 해주세요"를 출력
        // 더 쉽고 좋은 방법(대소문자 상관 없음)
        {
            String[] members = {"Steve", "Tom", "Michael", "Laura", "Jessica", "Amia"};
            Scanner sc = new Scanner(System.in);
            System.out.print("이름을 입력하시오 : ");
            String Name = sc.nextLine();
            boolean a = false;
            for (int i = 0; i < members.length; i++) {
                a = members[i].equalsIgnoreCase(Name);
                if (a) {
                    break;
                }
            }
            if (a) {
                System.out.println(Name + "님 환영합니다.");
            } else {
                System.out.println("회원가입을 해주세요.");
            }
        }

        {
            String[] members = {"Steve", "Tom", "Michael", "Laura", "Jessica", "Amia"};
            Scanner sc = new Scanner(System.in);
            System.out.print("이름을 입력하시오 : ");
            String Name = sc.nextLine();
            for (int i = 0; i < members.length; i++) {
                if (members[i].equalsIgnoreCase(Name)) {
                    System.out.println(Name + "님 환영합니다.");
                    break;
                } else if (i == members.length-1) {
                    System.out.println("회원가입을 해주세요.");
                }
            }
        }
    }
}