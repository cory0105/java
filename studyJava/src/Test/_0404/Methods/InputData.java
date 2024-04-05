package Test._0404.Methods;

import Test._0404.Registration.LectureRegistration;
import Test._0404.Data.User;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InputData {
    static List<User> users = new ArrayList<>();
    static List<LectureRegistration> lectureRegistrations = new ArrayList<>();
    public static List<User> userDB() throws IOException {
        File file = new File("C:/Users/dw-020/Documents/GitHub/java/temp/UserDB.txt");
        InputStream is = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(is);
        while (is.available()!=0){
            String name = dis.readUTF();
            String id = dis.readUTF();
            String password = dis.readUTF();
            String email = dis.readUTF();
            int year = dis.readInt();
            int month = dis.readInt();
            int day = dis.readInt();
            users.add(new User(name,id,password,LocalDate.of(year,month,day),email));
        }
        System.out.println(users);
        return users;
    }

    public static List<LectureRegistration> LectureRegistrationDB() throws IOException {
        File file = new File("C:/Users/dw-020/Documents/GitHub/java/temp/LectureRegistrationDB.txt");
        InputStream is = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(is);
        while (is.available()!=0){
            String userId = dis.readUTF();
            int lectureId = dis.readInt();
            lectureRegistrations.add(new LectureRegistration(userId, lectureId));
        }
//        System.out.println(lectureRegistrations);
        return lectureRegistrations;
    }
}
