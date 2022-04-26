public class RoleCheckHandler extends Handler {

    Database database = new Database();

    @Override
    public boolean handle(String email, String password, UserType userType, int packageNumber, Location location) {
        UserType uType = database.getUser(email).getUserType();
        if (uType != userType)
            return false;

        return true;
    }

}
