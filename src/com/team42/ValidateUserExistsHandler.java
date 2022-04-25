
public class ValidateUserExistsHandler extends Handler {

    Database database = new Database();

    @Override
    public boolean handle(String email, String password) {

        return database.isValidUser(email);

    }

}
