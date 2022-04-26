public class RoleCheckHandler extends Handler {

    Database database = new Database();

    @Override
    public boolean handle(String email, String password) {
        return database.isStaff(email);
    }

}
