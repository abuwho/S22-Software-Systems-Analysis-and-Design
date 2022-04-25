public class AuthenticationService {
    private Handler handler;

    public AuthenticationService(Handler handler) {
        this.handler = handler;
    }

    public boolean login(String email, String password) {
        if (handler.handle(email, password)) {
            System.out.println("Login Successfully");
            return true;
        }

        System.out.println("Login Failed");

        return false;
    }
}
