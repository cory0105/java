package Test._0404.Methods;

import Test._0404.Registration.LectureRegistration;
import Test._0404.Data.User;

import java.io.*;

public class OutputData {
    public static void outputUser(User user) throws IOException {
        File DBFile = new File("C:/Users/dw-020/Documents/GitHub/java/temp/UserDB.txt");
        if (!DBFile.exists()){
            DBFile.createNewFile();
        }
        OutputStream os = new FileOutputStream(DBFile,true);
        DataOutputStream dos = new DataOutputStream(os);

        dos.writeUTF(user.getName());
        dos.writeUTF(user.getLoginId());
        dos.writeUTF(user.getPassword());
        dos.writeUTF(user.getEmail());
        dos.writeInt(user.getBirthDate().getYear());
        dos.writeInt(user.getBirthDate().getMonthValue());
        dos.writeInt(user.getBirthDate().getDayOfMonth());

        dos.flush();
        os.close();
        dos.close();
    }

    public static void outputLectureRegistration(LectureRegistration lectureRegistration) throws IOException {
        File DBFile = new File("C:/Users/dw-020/Documents/GitHub/java/temp/LectureRegistrationDB.txt");
        if (!DBFile.exists()){
            DBFile.createNewFile();
        }

        OutputStream os = new FileOutputStream(DBFile,true);
        DataOutputStream dos = new DataOutputStream(os);

        dos.writeUTF(lectureRegistration.getUserId());
        dos.writeInt(lectureRegistration.getLectureId());

        dos.flush();
        os.close();
        dos.close();
    }
}
