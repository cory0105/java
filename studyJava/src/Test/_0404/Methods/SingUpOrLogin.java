package Test._0404.Methods;

import Test._0404.Data.User;
import Test._0404.InfoCreate;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import static Test._0404.InfoCreate.*;

public clSingUpOrLogin {
    public static User chooseSignOrLogin(){
        Scanner scInt = new Scanner(System.in);
        System.out.print("회원이면 0, 회원이 아니면 1을 입력하시오 ");
        if (scInt.nextInt()==1){
            try {
                user=signUp();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                user=login();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return user;
    }

    public static User signUp() throws IOException {
        Scanner scLine = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
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
        OutputData.outputUser(user);
        users.add(user);
        return user;
    }

    public static User login() throws IOException {
        Scanner scLine = new Scanner(System.in);
        boolean bool = true;
        while (bool){
            System.out.print("아이디를 입력하시오 ");
            user.setLoginId(scLine.nextLine());
            System.out.print("비밀번호를 입력하시오 ");
            user.setPassword(scLine.nextLine());
            for (int i=0; i<users.size(); i++){
                if(user.getLoginId().equals(users.get(i).getLoginId()) && user.getPassword().equals(users.get(i).getPassword())){
                    System.out.println("정상적으로 로그인이 되었습니다.");
                    bool = false;
                    return users.get(i);
                } else if (i==users.size()-1){
                    System.out.println("아이디 혹은 비밀번호가 틀렸습니다.");
                }
            }
        }
        return user;
    }
}
