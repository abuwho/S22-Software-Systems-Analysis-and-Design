
public interface HandlerInterface {

    /*
     * The method take the following parameters:
     * Email and password: The email and password of the user
     * UserType: When the user login, They tries to login under a specific rule,
     * this rule is directly passed to the function here
     * Package Number: this contains the number of package that the user wants to
     * add, updateLocation, or checkLocation (The action will be determined
     * according to the user role)
     * Location: This field is required only by staff members. It is used to add the
     * current location of the package to the database
     */
    public boolean handle(String email, String password, UserType userType, Integer packageNumber, Location location);
}
