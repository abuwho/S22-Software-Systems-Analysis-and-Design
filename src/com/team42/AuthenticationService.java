public class AuthenticationService {
    private Handler handler;
    Database database = new Database();

    public AuthenticationService(Handler handler) {
        this.handler = handler;
    }

    /*
     * This method verifies the user credentials and implement the request of the
     * user if he is authorized to do the actions in this request
     */
    public boolean loginAndHandleRequest(String email, String password, UserType userType, Integer packageNumber,
            Location location) {

        if (handler.handle(email, password, userType, packageNumber, location)) {
            return true;
        } else {
            System.out.println("Operation Failed");
            return false;
        }

    }
}
