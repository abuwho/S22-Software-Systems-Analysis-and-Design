
public class ValidateUserExistsHandler extends Handler {

    Database database = new Database();

    @Override
    public boolean handle(String email, String password) {

        if (!database.isValidUser(email))
            return false;

        return getNextHandler().handle(email, password);
    }

}
