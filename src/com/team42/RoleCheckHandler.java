public class RoleCheckHandler extends Handler {

    Database database = new Database();

    @Override
<<<<<<< HEAD
    public boolean handle(String email, String password) {
        return database.isStaff(email);
=======
    public boolean handle(String email, String password, UserType userType, int packageNumber, Location location) {
        UserType uType = database.getUser(email).getUserType();
        if (uType != userType)
            return false;

        return true;
>>>>>>> 1aa32d1fd2e1e4f810bea62f5d0a6e40cab3bce3
    }

}
