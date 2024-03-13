package Test;

import java.util.Arrays;

public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("이름을 입력하시오 : ");
        String userName = sc.nextLine();
        System.out.print("나이를 입력하시오 : ");
        int userAge = sc.nextInt();
        System.out.println();

        String userPro = "";
        String[] product = {"예금", "대출", "송금"};
        if(userAge<20){
            System.out.println(userName+"님께서는 미성년자이므로 보호자의 동의 없이 해당 서비스를 이용하실 수 없습니다.");
        } else{
            System.out.println("보기 중 원하시는 상품을 입력칸에 입력해주세요.");
            System.out.println("<보기> "+ Arrays.toString(product));
            System.out.print("입력 : ");
            java.util.Scanner pro = new java.util.Scanner(System.in);
            out:
            while (true) {
                userPro = pro.nextLine();
                int a = 0;
                for (int i = 0; i < product.length; i++) {
                    if (userPro.equals(product[i])) {
                        a = 1;
                        break out;
                    }
                }
                if (a == 0) {
                    System.out.println("지원하지 않는 서비스 입니다. 보기에 있는 서비스를 다시 입력해주세요.");
                    System.out.print("입력 : ");
                }
            }
        }
        System.out.println();
    }
}