
public interface HandlerInterface {

    /*
     * The method takes the following parameters:
     * Email and password: The email and password of the user
     * UserType: The userType that the user trying to sign in as. If a customer
     * tried to login as a distribution center admin for example, the operation will
     * be refused
     * Package Number: this contains the number of package that the user wants to
     * add, updateLocation, or checkLocation (The action will be determined
     * according to the user role)
     * Location: This field is required only by staff members. It is used to add the
     * current location of the package to the database
     */
    public boolean handle(String email, String password, UserType userType, Integer packageNumber, Location location);
}
