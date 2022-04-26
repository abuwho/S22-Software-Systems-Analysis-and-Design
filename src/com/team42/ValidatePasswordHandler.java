public class ValidatePasswordHandler extends Handler {

    Database database = new Database();

    @Override
    public boolean handle(String email, String password) {

        if (!database.isValidPassword(password)) {
            return false;
        }

        else
            // return getNextHandler().handle(email, password);
            return true;
    }

}
