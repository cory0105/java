package Project._0328._2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main2 {
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

        Work work = new Work();
        work.lectureIdFindLoginId(lectureRegistrations, 1);
        work.loginIdFindTitle(lectures,lectureRegistrations,"hero11");
        work.titleFindEmail(users, lectures, lectureRegistrations, "Java");

        for (int i=0; i< lectureRegistrations.size(); i++){
            work.toString(users,lectures,lectureRegistrations.get(i));
        }
    }
}
