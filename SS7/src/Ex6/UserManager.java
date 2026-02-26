package Ex6;
import java.util.ArrayList;

public class UserManager {
    public static ArrayList<User> users = new ArrayList<>();
    public static void addUser(User u) {
        users.add(u);
    }

    public static boolean checkLogin(String inputUser, String inputPass) {
        for (User u : users) {
            if (u.username.equals(inputUser) && u.password.equals(inputPass)) {
                return true;
            }
        }
        return false;
    }
}
