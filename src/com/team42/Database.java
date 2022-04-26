import java.util.ArrayList;

public class Database {
    public static ArrayList<User> usersList = new ArrayList<>();
    public static ArrayList<Package> packagesList = new ArrayList<>();

    // Used for automatically creating a unique Number for each package
    public static int packageNo = 1;

    // Checks if the user exists in the database
    public boolean isValidUser(String email) {
        for (User user : usersList) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }

        return false;
    }

    // Checks that the password entered by the user is correct
    public boolean isValidPassword(String email, String password) {
        for (User user : usersList)
            if (user.getEmail().equals(email))
                if (user.getPassword().equals(password))
                    return true;
                else
                    return false;

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

    // Changes the location of the package
    public boolean updatePackageLocation(int packageNumber, Location location) {
        for (int i = 0; i < packagesList.size(); i++) {
            if (packagesList.get(i).getPackageNumber() == packageNumber)
                packagesList.get(i).setLocation(location);
            return true;
        }
        return false;
    }

}
