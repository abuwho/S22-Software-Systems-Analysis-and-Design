public class ValidatePasswordHandler extends Handler {

    Database database = new Database();

    @Override
    public boolean handle(String email, String password) {

        return database.isValidPassword(password);
    }

}
