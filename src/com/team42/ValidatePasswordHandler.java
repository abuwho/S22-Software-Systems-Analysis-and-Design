public class ValidatePasswordHandler extends Handler {

    Database database = new Database();

    @Override
    public boolean handle(String email, String password, UserType userType, int packageNumber, Location location) {

        if (!database.isValidPassword(password)) {
            return false;
        }

        else
            return getNextHandler().handle(email, password, userType, packageNumber, location);
    }

}
