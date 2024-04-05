package Test._0404;

import Test._0404.Methods.Methods;
import Test._0404.Methods.SingUpOrLogin;
import java.io.IOException;
import static Test._0404.InfoCreate.*;

public class Main0405 {
    public static void main(String[] args) throws IOException {
        user = SingUpOrLogin.chooseSignOrLogin();
        while (true){
            Methods.chooseWork(user.getLoginId());
        }
    }
}
