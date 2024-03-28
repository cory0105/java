package Project._0328._2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        User user1 = new User("Steve", "hero11", "pass"
                , LocalDate.of(1999,1,1), "steve@email.com");
        users.add(user1);
        User user2 = new User("Tom", "tommy", "12345"
                , LocalDate.of(2001,2,5), "tom@email.com");
        users.add(user2);
        User user3 = new User("Susie", "sue", "qwe!@"
                , LocalDate.of(1988,5,12), "susie@email.com");
        users.add(user3);
        User user4 = new User("Laura", "nice", "234785923"
                , LocalDate.of(2004,11,11), "laura@email.com");
        users.add(user4);
        User user5 = new User("Emily", "goodlife", "fashdkeuh"
                , LocalDate.of(2001,3,23), "emily@email.com");
        users.add(user5);

        ArrayList<Lecture> lectures = new ArrayList<>();
        Lecture lecture1 = new Lecture(1, "Java", 100
                , "Programming", "beginner");
        lectures.add(lecture1);
        Lecture lecture2 = new Lecture(2, "Spring", 150
                , "Programming", "intermediate");
        lectures.add(lecture2);
        Lecture lecture3 = new Lecture(3, "Javascript", 80
                , "Programming", "beginner");
        lectures.add(lecture3);

        ArrayList<LectureRegistration> lectureRegistrations = new ArrayList<>();
        LectureRegistration lectureRegistration1 = new LectureRegistration("hero11", 1);
        lectureRegistrations.add(lectureRegistration1);
        LectureRegistration lectureRegistration2 = new LectureRegistration("tommy", 2);
        lectureRegistrations.add(lectureRegistration2);
        LectureRegistration lectureRegistration3 = new LectureRegistration("sue", 1);
        lectureRegistrations.add(lectureRegistration3);
        LectureRegistration lectureRegistration4 = new LectureRegistration("nice", 3);
        lectureRegistrations.add(lectureRegistration4);
        LectureRegistration lectureRegistration5 = new LectureRegistration("goodlife", 1);
        lectureRegistrations.add(lectureRegistration5);

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
