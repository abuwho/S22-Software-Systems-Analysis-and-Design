public class AuthenticationService {
    private Handler handler;
    Database database = new Database();

    public AuthenticationService(Handler handler) {
        this.handler = handler;
    }

    public boolean login(String email, String password, int packageNumber) {
        if (handler.handle(email, password, packageNumber)) {
            Package requestedPackage = database.getPackage(packageNumber);
            System.out.println("Login Successfully. The location of your package is : "
                    + requestedPackage.getLocation().toString());
            return true;
        }

        System.out.println("Login Failed");

        return false;
    }
}
