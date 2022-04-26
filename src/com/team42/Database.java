import java.util.ArrayList;

public class Database {
    public static ArrayList<User> usersList = new ArrayList<>();
    public static ArrayList<Package> packagesList = new ArrayList<>();

    public static int packageNo = 1;

    public boolean isValidUser(String email) {
        for (User user : usersList) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }

        return false;
    }

    public boolean isValidPassword(String password) {
        for (User user : usersList)
            if (user.getPassword().equals(password))
                return true;

        return false;
    }

    public void addUser(User user) {
        usersList.add(user);
    }

    public void addPackage(Package p) {
        packagesList.add(p);
    }

    public Package getPackage(int packageNumber) {
        for (Package p : packagesList) {
            if (p.getPackageNumber() == packageNumber)
                return p;
        }
        return null;
    }

    public User getUser(String email) {
        for (User u : usersList) {
            if (u.getEmail().equals(email))
                return u;
        }

        return null;
    }

    public boolean updatePackageLocation(int packageNumber, Location location) {
        for (int i = 0; i < packagesList.size(); i++) {
            if (packagesList.get(i).getPackageNumber() == packageNumber)
                // TODO: Make sure it really updates
                packagesList.get(i).setLocation(location);
            return true;
        }
        return false;
    }

}
