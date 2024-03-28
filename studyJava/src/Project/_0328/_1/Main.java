package Project._0328._1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User  steve = new User("Steve", "steveid", "stevepassword", "steveemail");
        User  tom = new User("tom", "tomid", "tompassword", "samemail");
        User  sam = new User("sam", "samid", "sampassword", "samemail");

        Lecture javaA = new Lecture("JavaA", 100, 30);
        Lecture javaB = new Lecture("JavaB", 100, 20);
        Lecture javaC = new Lecture("JavaC", 100, 10);
        Lecture springA = new Lecture("SpringA", 60, 20);
        Lecture springB = new Lecture("SpringB", 60, 15);
        Lecture springC = new Lecture("SpringC", 60, 10);
    }
}
