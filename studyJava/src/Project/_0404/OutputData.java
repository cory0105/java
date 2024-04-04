package Project._0404;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class OutputData {
    public static void main(String[] args) throws IOException {
        File DBFile = new File("C:/Users/dw-020/Documents/GitHub/java/temp/UserDB.txt");
        if (!DBFile.exists()){
            DBFile.createNewFile();
        }

        OutputStream os = new FileOutputStream(DBFile);

    }
    public void login(){
        Scanner scLine = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        User user = new User();
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
    }
}
