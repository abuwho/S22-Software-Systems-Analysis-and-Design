public class User {
    private String email;
    private String password;
    private UserType userType;

    public User() {

    }

    public User(String email, String password, UserType userType) {
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    public String getEmail() {
        return this.email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return this.userType;
    }

    void setUserType(UserType userType) {
        this.userType = userType;
    }
}
