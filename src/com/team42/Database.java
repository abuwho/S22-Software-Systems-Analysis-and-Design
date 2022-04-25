import java.util.ArrayList;

public class Database {
    public static ArrayList<User> usersList = new ArrayList<>();
    public static ArrayList<Package> packagesList = new ArrayList<>();

    boolean isValidUser(String email) {
        for (User user : usersList) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }

        return false;
    }

    boolean isValidPassword(String password) {
        for (User user : usersList)
            if (user.getPassword().equals(password))
                return true;

        return false;
    }

    boolean isStaff(String email) {
        for (User user : usersList) {
            if (user.getEmail().equals(email)) {
                if (user.getUserType() == UserType.STAFF)
                    return true;
                else
                    return false;
            }
        }
        return false;
    }

    public void addUser(User user) {
        usersList.add(user);
    }

    public void addPackage(Package p) {
        packagesList.add(p);
    }

}
