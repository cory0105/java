package Exam._0325;

public class A {
    public void createStudentsInfo() {
        String[] names = {"Steve", "tom", "Laura", "Susie"};
        String[] departments = {"Physics", "Computer", "English", "Law"};
        int[] studentsIds = {10001, 10002, 10003, 10004};
        // 데이터베이스의 raw data(가공하지 않은 순수 데이터)를
        //Students 객체형태로 만들고 이를 배열에 담는다.

        Students[] students = new Students[names.length]; // Students 대신 Object 사용 가능
        for (int i=0; i < students.length; i++){
            students[i] = new Students(names[i], departments[i], studentsIds[i]);
            System.out.println(students[i].toString());
        }
    }
}
