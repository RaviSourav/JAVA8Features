package Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserAuthenticationImpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Username and password");
        String uname = scanner.next();
        String pwd = scanner.next();
//        String uname = "rsourav";
//        String pwd = "password";
        UserAuthentication userAuthentication = new UserAuthentication(uname,pwd);
        Predicate<UserAuthentication> authentication = u -> u.userName.equals("rsourav") && u.password.equals("password");
        if (authentication.test(userAuthentication))
            System.out.println("Valid User");
        else
            System.out.println("not a valid user");
    }
}
