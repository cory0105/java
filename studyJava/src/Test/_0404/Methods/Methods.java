package Test._0404.Methods;

import Test._0404.InfoCreate;
import Test._0404.Registration.LectureRegistration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods extends InfoCreate {
    public static void chooseWork(String userId) throws IOException {
        System.out.println("원하시는 기능을 보기에서 찾아 적어주세요.");
        System.out.println("<보기> 수강등록, 수강내역, 리뷰, 게시판");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (choice.equals("수강등록")){
            userLectureRegistration(userId);
        } else if (choice.equals("리뷰작성")){

        } else if (choice.equals("게시판")){

        } else if (choice.equals("수강내역")) {
            System.out.println(userLRs(userId));
        } else {
            System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
            chooseWork(userId);
        }
    }

    public static LectureRegistration userLectureRegistration(String userId) throws IOException {
        Scanner scInt = new Scanner(System.in);
        LectureRegistration lectureRegistration = new LectureRegistration();

        for (int i=0; i<lectures.size(); i++){
            System.out.println(lectures.get(i).getTitle() + "강의를 원하시면 " + lectures.get(i).getLectureId() + "을 입력해주세요.");
        }

        lectureRegistration.setLectureId(scInt.nextInt());
        lectureRegistration.setUserId(userId);

        OutputData.outputLectureRegistration(lectureRegistration);
        return lectureRegistration;
    }

    public static List<LectureRegistration> userLRs(String userId) throws IOException {
        List<LectureRegistration> lectureRegistrationList = InputData.LectureRegistrationDB();
        List<LectureRegistration> userLRs = new ArrayList<>();
        for (int i=0; i<lectureRegistrationList.size(); i++){
            if (userId.equals(lectureRegistrationList.get(i).getUserId())){
                userLRs.add(lectureRegistrationList.get(i));
            }
        }
        return userLRs;
    }
}
