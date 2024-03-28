package Project._0328._2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
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

        // 2. 강의 1번 수강생의 loginId 찾기
        for(int i=0; i<lectureRegistrations.size(); i++) {
            if (lectureRegistrations.get(i).getLectureId() == 1) {
                System.out.println(lectureRegistrations.get(i).getUserId());
            }
        }
        System.out.println();

        // 3. 유저의 loginId로 강의명 찾기
        out3:
        for (int i=0; i<lectureRegistrations.size(); i++){
            if (lectureRegistrations.get(i).userId.equals("hero11")){
                for (int j=0; j<lectures.size(); j++){
                    if (lectures.get(j).lectureId == lectureRegistrations.get(i).lectureId){
                        System.out.println(lectures.get(j).getTitle());
                        break out3;
                    }
                }
            }
        }
        System.out.println();



        // 4. 강의명으로 수강생들의 이메일 찾기
        for (int i=0; i<lectures.size(); i++){
            if ("Java".equals(lectures.get(i).title)){
                for (int j=0; j<lectureRegistrations.size(); j++){
                    if (lectures.get(i).lectureId == lectureRegistrations.get(j).lectureId){
                        for (int x=0; x<users.size(); x++){
                            if (lectureRegistrations.get(j).userId.equals(users.get(x).loginId)){
                                System.out.println(users.get(x).email);
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println();

        // 4. 강의명으로 수강생들의 이메일 찾기2
        int i=0;
        for (; i<lectures.size(); i++) {
            if ("Java".equals(lectures.get(i).title)) {
                i = lectures.get(i).lectureId;
                break;
            }
        }
        for (int j=0; j<lectureRegistrations.size(); j++){
            if (i == lectureRegistrations.get(j).lectureId){
                for (int x=0; x<users.size(); x++){
                    if (lectureRegistrations.get(j).userId.equals(users.get(x).loginId)){
                        System.out.println(users.get(x).email);
                        break;
                    }
                }
            }
        }
    }
}