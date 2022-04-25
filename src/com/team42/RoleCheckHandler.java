import javax.xml.crypto.Data;

public class RoleCheckHandler extends Handler {

    Database database = new Database();

    @Override
    public boolean handle(String email, String password) {
        // TODO Auto-generated method stub
        return database.isStaff(email);
    }

}
