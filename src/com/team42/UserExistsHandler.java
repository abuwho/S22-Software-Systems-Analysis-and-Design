
public class UserExistsHandler extends Handler {

    Database database = new Database();

    @Override
    public boolean handle(String email, String password, UserType userType, int packageNumber, Location location) {

        if (!database.isValidUser(email))
            return false;

        return getNextHandler().handle(email, password, userType, packageNumber, location);
    }

}
