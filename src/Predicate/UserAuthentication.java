package Predicate;

public class UserAuthentication {
    String userName;
    String password;

    public UserAuthentication(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserAuthentication{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
