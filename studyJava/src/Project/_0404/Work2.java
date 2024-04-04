package Project._0404;

import java.time.LocalDate;
import java.util.Scanner;

public class Work2 extends InfoCreate {
    public void chooseWork(){
        System.out.println("원하는 기능을 보기를 보고 적어주세요.");
        System.out.print("<보기> 수강등록, 리뷰작성, 게시판");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (choice.equals("수강등록")){
            System.out.print("지금 수강하실 수 있는 과목은 ");


        } else if (choice.equals("리뷰작성")){

        } else if (choice.equals("게시판")){

        } else {
            System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
            chooseWork();
        }
    }

    public void loginIdFindNotTitle(String loginId){
        for (int i=0; i<lectureRegistrations.size(); i++){
            if (loginId.equals(lectureRegistrations.get(i))){

            }
        }
    }

    public void login(){
        Scanner scLine = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        System.out.print("회원이면 0, 회원이 아니면 1을 입력하시오 ");
        User user = new User();
        if (scInt.nextInt()==1){
            System.out.print("이름을 입력하시오 ");
            user.setName(scLine.nextLine());
            System.out.print("아이디를 입력하시오 ");
            user.setLoginId(scLine.nextLine());
            System.out.print("비밀번호를 입력하시오 ");
            user.setPassword(scLine.nextLine());
            System.out.print("이메일을 입력하시오 ");
            user.setEmail(scLine.nextLine());
            System.out.print("생년월일을 입력하시오 ");
            user.setBirthDate(LocalDate.of(scInt.nextInt(),scInt.nextInt(),scInt.nextInt()));
        } else {
            boolean bool = true;
            while (bool){
                System.out.print("아이디를 입력하시오 ");
                user.setLoginId(scLine.nextLine());
                System.out.print("비밀번호를 입력하시오 ");
                user.setPassword(scLine.nextLine());
                for (int i=0; i<users.size(); i++){
                    if(user.getLoginId().equals(users.get(i).loginId) && user.getPassword().equals(users.get(i).password)){
                        System.out.println("정상적으로 로그인이 되었습니다.");
                        bool = false;
                        break;
                    } else if (i==users.size()-1){
                        System.out.println("아이디 혹은 비밀번호가 틀렸습니다.");
                    }
                }
            }
        }
    }
}
