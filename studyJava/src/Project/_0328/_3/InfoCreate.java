package Project._0328._3;

import java.time.LocalDate;
import java.util.ArrayList;

public class InfoCreate {
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Lecture> lectures = new ArrayList<>();
    static ArrayList<LectureRegistration> lectureRegistrations = new ArrayList<>();
    static ArrayList<Teacher> teachers = new ArrayList<>();
    static ArrayList<LectureTeacher> lectureTeachers = new ArrayList<>();
    static {
        User user1 = new User("Steve", "hero11", "pass"
                , LocalDate.of(1999, 1, 1), "steve@email.com");
        users.add(user1);
        User user2 = new User("Tom", "tommy", "12345"
                , LocalDate.of(2001, 2, 5), "tom@email.com");
        users.add(user2);
        User user3 = new User("Susie", "sue", "qwe!@"
                , LocalDate.of(1988, 5, 12), "susie@email.com");
        users.add(user3);
        User user4 = new User("Laura", "nice", "234785923"
                , LocalDate.of(2004, 11, 11), "laura@email.com");
        users.add(user4);
        User user5 = new User("Emily", "goodlife", "fashdkeuh"
                , LocalDate.of(2001, 3, 23), "emily@email.com");
        users.add(user5);


        Lecture lecture1 = new Lecture(1, "Java", 100
                , Category.PROGRAMING, Difficulty.BEGINNER);
        lectures.add(lecture1);
        Lecture lecture2 = new Lecture(2, "Spring", 150
                , Category.FRONTEND, Difficulty.INTERMEDIATE);
        lectures.add(lecture2);
        Lecture lecture3 = new Lecture(3, "Javascript", 80
                , Category.PROGRAMING, Difficulty.BEGINNER);
        lectures.add(lecture3);


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

        Teacher teacher1 = new Teacher("t1","teacher1","tt1",LocalDate.of(2024,10,1),"t1@email.com");
        teachers.add(teacher1);
        Teacher teacher2 = new Teacher("t2","teacher2","tt2",LocalDate.of(2024,10,1),"t2@email.com");
        teachers.add(teacher2);
        Teacher teacher3 = new Teacher("t3","teacher3","tt3",LocalDate.of(2024,10,1),"t3@email.com");
        teachers.add(teacher3);
        Teacher teacher4 = new Teacher("t4","teacher4","tt4",LocalDate.of(2024,10,1),"t4@email.com");
        teachers.add(teacher4);

        LectureTeacher lectureTeacher1 = new LectureTeacher("t1",1);
        lectureTeachers.add(lectureTeacher1);
        LectureTeacher lectureTeacher2 = new LectureTeacher("t2",2);
        lectureTeachers.add(lectureTeacher2);
        LectureTeacher lectureTeacher3 = new LectureTeacher("t1",3);
        lectureTeachers.add(lectureTeacher3);
    }
}
