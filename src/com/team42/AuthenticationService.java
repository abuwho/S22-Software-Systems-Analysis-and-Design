public class AuthenticationService {
    private Handler handler;
    Database database = new Database();

    public AuthenticationService(Handler handler) {
        this.handler = handler;
    }

    public boolean login(String email, String password, UserType userType, Integer packageNumber, Location location) {
        if (handler.handle(email, password, userType, packageNumber, location)) {

            return true;

        } else {
            System.out.println("Operation Failed");
            return false;
        }

    }
}
